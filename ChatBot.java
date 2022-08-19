package main;

import java.util.*;

public class ChatBot {
    public static String process(String message) {
        if (isHelloMessage(message)) {
            String botName = "GoITeensChatBot";
            return "Вітаю, я - " + botName;
        }

        int professionSalary = find(message, professions);
        int dreamCost = find(message,dreams) ; //Write code in this line

        if (professionSalary < 0) {
            return "Я не знайшов у твоєму повідомленні назви професії";
        }
        if (dreamCost < 0) {
            return "Я не знайшов у твоєму повідомленні мрії, яку ти хочеш";
        }


        return "Заробітня плата - " + professionSalary + ", вартість мрії - " + dreamCost;
    }

    public static int find(String message, Map<String, Integer> data) {
        message = message.toLowerCase();

        for(String word: data.keySet()) {
            String lowerCasedWord = word.toLowerCase();

            if (message.contains(lowerCasedWord)) {
                return data.get(word);
            }
        }

        return -1;
    }

    public static Map<String, Integer> getDreams() {
        return dreams;
    }

    public static boolean isHelloMessage(String message) {
        message = message.toLowerCase();

        String helloWord1 = "привіт";
        String helloWord2 = "вітаю";

        return message.contains(helloWord1) || message.contains(helloWord2);
    }

    public static int calculateMonthCount(int dreamCost, int professionSalary) {
        return validateMonthCount(dreamCost/professionSalary);
        //Write code under this line

    }
    public static int validateMonthCount(int monthCount) {
        return monthCount == 0 ? 1 : monthCount;
        //Write code under this line

    }

    private static Map<String, Integer> dreams = new HashMap<>();
    private static Map<String, Integer> professions = new HashMap<>();

    static {
        dreams.put("iPhone", 27000);
        dreams.put("Машин", 100000);

        professions.put("Designer", 20000);
        professions.put("Java", 55000);
        professions.put("Frontend", 40000);
    }
}

