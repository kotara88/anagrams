package com.foxminded.anagram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);
        Anagram anagram = new Anagram();
        System.out.println("If you want to exit input \"q\"");
        while (true) {
            System.out.println("Input a sentence you want to reverse");
            sentence = scanner.nextLine();
            if (sentence.equals("q"))
                break;
            System.out.print("The reverse sentence: ");
            System.out.println(anagram.reversSentence(sentence));
        }
    }
}
