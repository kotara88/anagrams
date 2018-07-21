package com.foxminded.anagram;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
    public String reversSentence(String sentence){
        if(sentence == null)
            return null;

        String words [] = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words){
            StringBuilder reversedWord = reversWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    private StringBuilder reversWord(String word){
        StringBuilder reversedWord = new StringBuilder(removeNonLetters(word)).reverse();
        Map<Integer, String> nonLetters = getNonLetters(word);
        for (Map.Entry<Integer, String> pair: nonLetters.entrySet()){
            reversedWord.insert(pair.getKey(), pair.getValue());
        }
        return reversedWord;
    }


    private String removeNonLetters(String word){
        return word.replaceAll("[^A-Za-z]","");
    }

    private  Map<Integer, String> getNonLetters(String word){
        Map<Integer, String> nonLetters = new TreeMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))){
                nonLetters.put(i, String.valueOf(word.charAt(i)));
            }
        }
        return nonLetters;
    }
}
