package Задача1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "Pickup", "Roadster", "Limousine", "Van", "Estate", "Hatchback",
                "Saloon", "Van", "Roadster", "Limousine", "Estate", "Hatchback",
                "Saloon", "Pickup", "Roadster", "Van", "Hatchback", "Saloon",
                "Pickup", "Estate", "Limousine", "Van", "Roadster"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество повторений каждого слова: " + wordCount);
    }
}