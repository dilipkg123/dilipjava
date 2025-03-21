package org.example;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTestIgnoreStopCases {

        @Test
        void testNormalSentence() {
            Map<String, Integer> result = WordCounterStopWord.countWords("this is a test this is only a test");
            assertEquals(2, result.get("test"));
            assertEquals(1, result.get("only"));
            assertFalse(result.containsKey("is")); // Stop word ignored
            assertFalse(result.containsKey("a"));  // Stop word ignored
        }

        @Test
        void testWithExtraSpaces() {
            Map<String, Integer> result = WordCounterStopWord.countWords("  hello   world  hello  ");
            assertEquals(2, result.get("hello"));
            assertEquals(1, result.get("world"));
            assertEquals(2, result.size());
        }

        @Test
        void testEmptyString() {
            Map<String, Integer> result = WordCounterStopWord.countWords("");
            assertTrue(result.isEmpty());
        }

        @Test
        void testNullInput() {
            Map<String, Integer> result = WordCounterStopWord.countWords(null);
            assertTrue(result.isEmpty());
        }

        @Test
        void testOnlySpaces() {
            Map<String, Integer> result = WordCounterStopWord.countWords("     ");
            assertTrue(result.isEmpty());
        }

        @Test
        void testSpecialCharacters() {
            Map<String, Integer> result = WordCounterStopWord.countWords("hello, world! hello.");
            assertEquals(2, result.get("hello"));
            assertEquals(1, result.get("world"));
        }

        @Test
        void testCaseSensitivity() {
            Map<String, Integer> result = WordCounterStopWord.countWords("Hello hello HELLO");
            assertEquals(3, result.get("hello")); // All treated as lower case
        }

        @Test
        void testStopWordsAreIgnored() {
            Map<String, Integer> result = WordCounterStopWord.countWords("The quick brown fox jumps over the lazy dog");
            assertEquals(1, result.get("quick"));
            assertEquals(1, result.get("brown"));
            assertFalse(result.containsKey("the")); // Stop word ignored
        }

        @Test
        void testJsonExport() {
            Map<String, Integer> wordCount = WordCounterStopWord.countWords("Hello world! Hello world.");
            String jsonOutput = WordCounterStopWord.exportToJson(wordCount);
            assertTrue(jsonOutput.contains("\"hello\": 2"));
            assertTrue(jsonOutput.contains("\"world\": 2"));
        }
    }

