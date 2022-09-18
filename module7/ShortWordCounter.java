package main.module7;

import java.util.Arrays;

public class ShortWordCounter {
    public int count(String phrase, int minLength){
        int result = 0;
        String [] words = phrase.split("\s");
        for (String s : words) {
            if (s.length()<= minLength){
                result++;
            }
        }
        return result;
    }
}
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}