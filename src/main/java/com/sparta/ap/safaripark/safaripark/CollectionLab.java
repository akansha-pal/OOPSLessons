package com.sparta.ap.safaripark.safaripark;

import java.util.*;

public class CollectionLab {
    public static void main(String[] args) {
        System.out.println(makeFiveSet(60));
        System.out.println(longWordList("My Name is Akansha Pal"));

        var hashMap = countDigit("012ABC6789JH68");
        for (var entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " >> " + entry.getValue());
        }
    }

    public static HashSet<Integer> makeFiveSet(int max) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0) {
                hashSet.add(i);
            }
        }
        return hashSet;
    }

    public static List<String> longWordList(String phrase) {
        List<String> wordList = new ArrayList<>();
        List<String> words = List.of(phrase.split(" "));
        for (var word : words) {
            if (word.length() >= 5) {
                wordList.add(word);
            }
        }
        return wordList;
    }

    public static HashMap<Character, Integer> countDigit(String str) {
        HashMap<Character, Integer> digits = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            var character = str.charAt(i);
            if (Character.isDigit(character)) {
                if (digits.containsKey(character)) {
                    digits.put(character, digits.get(character) + 1);
                } else {
                    digits.put(character, 1);
                }
            }
        }
        return digits;
    }

}
