package com.foxminded.anagram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
    private String nonLetterInTheBeginningOfTheWord;
    private String nonLetterInTheEndOfTheWord;
    private String nonLetterInTheMiddleOfTheWord;
    private String nonLetterInTheBeginningAndInTheMiddleOfTheWord;
    private String nonLetterInTheBeginningAndInTheEndOfTheWord;
    private String nonLetterInTheMiddleAndInTheEndOfTheWord;
    private String nonLettersTheBeginningInTheMiddleAndInTheEndOfTheWord;
    private String onlyLetters;
    private String emptyWord;
    private String nullWord;
    private Anagram anagram;


    @Before
    public void initialize() {
        nonLetterInTheBeginningOfTheWord = "1abcd";
        nonLetterInTheEndOfTheWord = "abcd1";
        nonLetterInTheMiddleOfTheWord = "ab1cd";
        nonLetterInTheBeginningAndInTheMiddleOfTheWord = "1ab1cd";
        nonLetterInTheBeginningAndInTheEndOfTheWord = "1abcd1";
        nonLetterInTheMiddleAndInTheEndOfTheWord = "ab1cd1";
        nonLettersTheBeginningInTheMiddleAndInTheEndOfTheWord = "1ab1cd1";
        onlyLetters = "abcd";
        emptyWord = "";
        nullWord = null;
        anagram = new Anagram();
    }

    @Test
    public void NonLetterInTheBeginningOfTheWordShouldStayInItsPlace() {
        String expected = "1dcba";
        reverseWord(nonLetterInTheBeginningOfTheWord, expected);
    }

    @Test
    public void NonLetterInTheEndOfTheWordShouldStayInItsPlace() {
        String expected = "dcba1";
        reverseWord(nonLetterInTheEndOfTheWord, expected);
    }

    @Test
    public void NonLetterInTheMiddleOfTheWordShouldStayInItsPlace() {
        String expected = "dc1ba";
        reverseWord(nonLetterInTheMiddleOfTheWord, expected);
    }

    @Test
    public void NonLettersInTheBeginningAndInTheMiddleOfTheWordShouldStayInItsPlace() {
        String expected = "1dc1ba";
        reverseWord(nonLetterInTheBeginningAndInTheMiddleOfTheWord, expected);
    }

    @Test
    public void NonLettersInTheBeginningAndInTheEndOfTheWordShouldStayInItsPlace() {
        String expected = "1dcba1";
        reverseWord(nonLetterInTheBeginningAndInTheEndOfTheWord, expected);
}

    @Test
    public void NonLettersInTheMiddleAndInTheEndOfTheWordShouldStayInItsPlace() {
        String expected = "dc1ba1";
        reverseWord(nonLetterInTheMiddleAndInTheEndOfTheWord, expected);
    }

    @Test
    public void NonLettersTheBeginningInTheMiddleAndInTheEndOfTheWordShouldStayInItsPlace() {
        String expected = "1dc1ba1";
        reverseWord(nonLettersTheBeginningInTheMiddleAndInTheEndOfTheWord, expected);
    }

    @Test
    public void wordShouldBeReverse() {
        String expected = "dcba";
        reverseWord(onlyLetters, expected);
    }

    @Test
    public void shouldBeEmpty() {
        String expected = "";
        reverseWord(emptyWord, expected);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointExeption() {
        String result = anagram.reversSentence(nullWord);
    }

    private void reverseWord(String word, String expected){
        String result = anagram.reversSentence(word);
        Assert.assertEquals(expected,result);
    }
}