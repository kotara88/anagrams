package com.foxminded.anagram;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private String sentence = "1abcd ab1cd abcd1";

    @Test
    public void sentenceShouldBeReversed() {
        Anagram anagram = new Anagram();
        String expected = "1dcba dc1ba dcba1";
        String result = anagram.reversSentence(sentence);
        Assert.assertEquals(expected,result);
    }
}