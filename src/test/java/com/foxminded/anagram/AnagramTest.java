package com.foxminded.anagram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTest {
    private String nonLetterAtTheBeginningOfTheWord;
    private String nonLetterAtTheEndOfTheWord;
    private String nonLetterAtTheMiddleOfTheWord;
    private String nonLetterAtTheBeginningAndAtTheMiddleOfTheWord;
    private String nonLetterAtTheBeginningAndAtTheEndOfTheWord;
    private String nonLetterAtTheMiddleAndAtTheEndOfTheWord;
    private String nonLettersAtTheBeginningAtTheMiddleAndAtTheEndOfTheWord;
    private String onlyLetters;
    private String emptyWord;
    private String nullWord;
    private Anagram anagram;


    @Before
    public void initialize() {
        nonLetterAtTheBeginningOfTheWord = "1abcd";
        nonLetterAtTheEndOfTheWord = "abcd1";
        nonLetterAtTheMiddleOfTheWord = "ab1cd";
        nonLetterAtTheBeginningAndAtTheMiddleOfTheWord = "1ab1cd";
        nonLetterAtTheBeginningAndAtTheEndOfTheWord = "1abcd1";
        nonLetterAtTheMiddleAndAtTheEndOfTheWord = "ab1cd1";
        nonLettersAtTheBeginningAtTheMiddleAndAtTheEndOfTheWord = "1ab1cd1";
        onlyLetters = "abcd";
        emptyWord = "";
        nullWord = null;
        anagram = new Anagram();
    }

    @Test
    public void nonLetterMustRemainAtTheBeginning_WhenWordForReverseWithNonLetterAtTheBeginning() {
        String expected = "1dcba";
        String result = anagram.reversSentence(nonLetterAtTheBeginningOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void nonLetterMustRemainAtTheEnd_WhenWordForReverseWithNonLetterAtTheEnd() {
        String expected = "dcba1";
        String result = anagram.reversSentence(nonLetterAtTheEndOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void nonLetterMustRemainAtTheMiddle_WhenWordForReverseWithNonLetterAtTheMiddle() {
        String expected = "dc1ba";
        String result = anagram.reversSentence(nonLetterAtTheMiddleOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAndAtTheMiddle_WhenWordForReverseWithNonLetterAtTheBeginningAndAtTheMiddle() {
        String expected = "1dc1ba";
        String result = anagram.reversSentence(nonLetterAtTheBeginningAndAtTheMiddleOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAndAtTheEnd_WhenWordForReverseWithNonLetterAtTheBeginningAndAtTheEnd() {
        String expected = "1dcba1";
        String result = anagram.reversSentence(nonLetterAtTheBeginningAndAtTheEndOfTheWord);
        Assert.assertEquals(expected,result);
}

    @Test
    public void nonLettersMustRemainAtTheMiddleAndAtTheEnd_WhenWordForReverseWithNonLetterAtTheMiddleAndAtTheEnd() {
        String expected = "dc1ba1";
        String result = anagram.reversSentence(nonLetterAtTheMiddleAndAtTheEndOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAtTheMiddleAndAtTheEnd_WhenWordForReverseWithNonLetterAtTheBeginningAtTheMiddleAndAtTheEnd() {
        String expected = "1dc1ba1";
        String result = anagram.reversSentence(nonLettersAtTheBeginningAtTheMiddleAndAtTheEndOfTheWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void wordShouldBeReverse_WhenWordForReverseWithoutNonLetters() {
        String expected = "dcba";
        String result = anagram.reversSentence(onlyLetters);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void shouldBeEmpty_WhenWordForReverseIsEmpty() {
        String expected = "";
        String result = anagram.reversSentence(emptyWord);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void shouldBeNull_WhenWordForReverseIsNull() {
        String result = anagram.reversSentence(nullWord);
        Assert.assertNull(result);
    }
}