package com.foxminded.anagram;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void sentenceShouldBeReversed() {
        Anagram anagram = new Anagram();
        String sentence = "1aB<cd!# ^Efg?h)7";
        String expected = "1dc<Ba!# ^hgf?E)7";
        String result = anagram.reversSentence(sentence);
        Assert.assertEquals(expected,result);
    }
}