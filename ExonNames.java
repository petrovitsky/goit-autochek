package main;

import java.util.Scanner;

public class ExonNames {


    public String makeHalfOfName(String name) {

        return name.substring(0, name.length() / 2);
    }

    public String makeNameClean(String name) {

        return "CLEAN" + name.strip() + "CLEAN";
    }

    public String makeNamePositive(String name) {


        return name.toLowerCase().replace("no", "yes");
    }

    public boolean isInvisibleName(String name) {
        return name.isBlank();
    }

    public boolean isMoneyName(String name) {
        char a = name.charAt(0);
        char b = name.charAt(name.length() - 1);

        return (a >= 48 && a <= 57) && (b >= 48 && b <= 57);

    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        return String.valueOf(name.charAt(0)).toUpperCase() + String.valueOf(name.charAt(name.length() - 1)).toUpperCase();
//        String code = name.charAt(0) + String.valueOf(name.charAt(name.length() - 1));
//        return code.toUpperCase();
    }

    public boolean isNameLucky(String name) {

        return name.toLowerCase().contains("o") || name.toLowerCase().contains("a");
    }

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {

        return String.join(" ", firstName.toLowerCase(), lastName.toUpperCase());
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);
        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("g");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        //Should be CLEANdirtyCLEAN
        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);

        //Should be Gu
        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + names.makeHalfOfName("Gurk"));


    }
}

class NameEncoderDecoder {
    public String encode(String name) {
        String result = name.replace('e', '1').replace('u', '2')
                .replace('i', '3').replace('o', '4')
                .replace('a', '5');
        return "NOTFORYOU" + result + "YESNOTFORYOU";
    }

    public String decode(String name){


        return name.substring(9).replace("YESNOTFORYOU", "")
                .replace('1','e').replace('2','u')
                .replace('3', 'i').replace('4','o')
                .replace('5','a');
    }

    public static void main(String[] args) {
        NameEncoderDecoder test = new NameEncoderDecoder();
        System.out.println(test.encode("Crab"));
        System.out.println(test.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        System.out.println(test.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }

}
