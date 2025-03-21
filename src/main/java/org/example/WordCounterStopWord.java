package org.example;

import com.google.gson.Gson;
import java.util.*;

public class WordCounterStopWord {

    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
            "a", "an", "and", "the", "is", "in", "on", "at", "of", "to", "for", "with", "that", "this", "it"
    ));

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();

        if (input == null || input.trim().isEmpty()) {
            return wordCount;
        }

        String[] words = input.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", "") // Remove punctuation
                .split("\\s+");

        for (String word : words) {
            if (!word.isEmpty() && !STOP_WORDS.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static String exportToJson(Map<String, Integer> wordCount) {
        Gson gson = new Gson();
        return gson.toJson(wordCount);
    }
}
