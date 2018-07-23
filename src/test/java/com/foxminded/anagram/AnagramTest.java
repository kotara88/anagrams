package com.foxminded.anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private String wordWithNonLetterAtTheBeginning;
    private String wordWithNonLetterAtTheEnd;
    private String wordWithNonLetterAtTheMiddle;
    private String wordWithNonLetterAtTheBeginningAndAtTheMiddle;
    private String wordWithNonLetterAtTheBeginningAndAtTheEnd;
    private String wordWithNonLetterAtTheNiddleAndAtTheEnd;
    private String wordWithNonLetterAtTheBeginningAtTheMiddleAndAtTheEnd;
    private String sentenceWithTwoWord;
    private String onlyLetters;
    private String emptyWord;
    private String nullWord;
    private Anagram anagram;


    @Before
    public void initialize() {
        wordWithNonLetterAtTheBeginning = "1abcd";
        wordWithNonLetterAtTheEnd = "abcd1";
        wordWithNonLetterAtTheMiddle = "ab1cd";
        wordWithNonLetterAtTheBeginningAndAtTheMiddle = "1ab1cd";
        wordWithNonLetterAtTheBeginningAndAtTheEnd = "1abcd1";
        wordWithNonLetterAtTheNiddleAndAtTheEnd = "ab1cd1";
        wordWithNonLetterAtTheBeginningAtTheMiddleAndAtTheEnd = "1ab1cd1";
        sentenceWithTwoWord = "abcd wxyz";
        onlyLetters = "abcd";
        emptyWord = "";
        nullWord = null;
        anagram = new Anagram();
    }

    @Test
    public void nonLetterMustRemainAtTheBeginning_WhenWordToReverseWithNonLetterAtTheBeginning() {
        String expected = "1dcba";
        String result = anagram.reversSentence(wordWithNonLetterAtTheBeginning);
        assertEquals(expected,result);
    }

    @Test
    public void nonLetterMustRemainAtTheEnd_WhenWordToReverseWithNonLetterAtTheEnd() {
        String expected = "dcba1";
        String result = anagram.reversSentence(wordWithNonLetterAtTheEnd);
        assertEquals(expected,result);
    }

    @Test
    public void nonLetterMustRemainAtTheMiddle_WhenWordToReverseWithNonLetterAtTheMiddle() {
        String expected = "dc1ba";
        String result = anagram.reversSentence(wordWithNonLetterAtTheMiddle);
        assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAndAtTheMiddle_WhenWordToReverseWithNonLetterAtTheBeginningAndAtTheMiddle() {
        String expected = "1dc1ba";
        String result = anagram.reversSentence(wordWithNonLetterAtTheBeginningAndAtTheMiddle);
        assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAndAtTheEnd_WhenWordToReverseWithNonLetterAtTheBeginningAndAtTheEnd() {
        String expected = "1dcba1";
        String result = anagram.reversSentence(wordWithNonLetterAtTheBeginningAndAtTheEnd);
        assertEquals(expected,result);
}

    @Test
    public void nonLettersMustRemainAtTheMiddleAndAtTheEnd_WhenWordToReverseWithNonLetterAtTheMiddleAndAtTheEnd() {
        String expected = "dc1ba1";
        String result = anagram.reversSentence(wordWithNonLetterAtTheNiddleAndAtTheEnd);
        assertEquals(expected,result);
    }

    @Test
    public void nonLettersMustRemainAtTheBeginningAtTheMiddleAndAtTheEnd_WhenWordToReverseWithNonLetterAtTheBeginningAtTheMiddleAndAtTheEnd() {
        String expected = "1dc1ba1";
        String result = anagram.reversSentence(wordWithNonLetterAtTheBeginningAtTheMiddleAndAtTheEnd);
        assertEquals(expected,result);
    }

    @Test
    public void sentenceMustReverse_WhenSentenceWithTwoWords() {
        String expected = "dcba zyxw";
        String result = anagram.reversSentence(sentenceWithTwoWord);
        assertEquals(expected,result);
    }

    @Test
    public void wordShouldBeReverse_WhenWordToReverseWithoutNonLetters() {
        String expected = "dcba";
        String result = anagram.reversSentence(onlyLetters);
        assertEquals(expected,result);
    }

    @Test
    public void shouldBeEmpty_WhenWordToReverseIsEmpty() {
        String expected = "";
        String result = anagram.reversSentence(emptyWord);
        assertEquals(expected,result);
    }

    @Test
    public void shouldReturnNull_WhenWordToReverseIsNull() {
        String result = anagram.reversSentence(nullWord);
        assertNull(result);
    }
}