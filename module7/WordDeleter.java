package main.module7;

import java.util.Arrays;

public class WordDeleter {
    public String remove(String phrase, String[] words){
        StringBuilder sb = new StringBuilder(phrase);
        sb.replace(sb.indexOf(words[0]),  sb.indexOf(words[0]) + words[0].length(), " ");

        return sb.toString();
    }
}


class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}