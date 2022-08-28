package main;

import java.util.Arrays;

public class EncapsulationTest {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        String[] phones = book.getPhones();
        phones[0] = "0000";
        System.out.println(Arrays.toString(phones));


    }
}
class PhoneBook {
    private final String[] phones = new String[]{"1212", "323232", "4545454", "56565656"};

    public String[] getPhones() {
        return phones;
    }
}