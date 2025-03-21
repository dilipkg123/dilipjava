package org.example;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordCounterTest {

    @Test
    void testNormalSentence() {
        Map<String, Integer> result = WordCounter.countWords("this is a test this is only a test");
        assertEquals(2, result.get("this"));
        assertEquals(2, result.get("is"));
        assertEquals(2, result.get("a"));
        assertEquals(2, result.get("test"));
        assertEquals(1, result.get("only"));
    }

    @Test
    void testWithExtraSpaces() {
        Map<String, Integer> result = WordCounter.countWords("  hello   world  hello  ");
        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(2, result.size());
    }

    @Test
    void testEmptyString() {
        Map<String, Integer> result = WordCounter.countWords("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullInput() {
        Map<String, Integer> result = WordCounter.countWords(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void testOnlySpaces() {
        Map<String, Integer> result = WordCounter.countWords("     ");
        assertTrue(result.isEmpty());
    }

    @Test
    void testSpecialCharacters() {
        Map<String, Integer> result = WordCounter.countWords("hello, world! hello.");
        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
    }

    @Test
    void testCaseSensitivity() {
        Map<String, Integer> result = WordCounter.countWords("Hello hello HELLO");
        assertEquals(3, result.get("hello")); // All treated as lower case
    }
}
