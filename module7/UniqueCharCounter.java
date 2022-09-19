package main.module7;

public class UniqueCharCounter {
    public int count(String phrase) {
        char[] chars = phrase.toCharArray();
        int unique = chars.length;
        for (char s : chars) {
            int counter = 0;
            for (int i = 0; i < chars.length; i++) {
                if (s == chars[i]) {
                    unique--;
                }
            }
        }
        return unique;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}