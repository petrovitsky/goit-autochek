package main;

import java.util.Arrays;
import java.util.Scanner;

public class MoonComputerTests {
    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        boolean resAnd = a & b & c;
        boolean resOr = a | b | c;
        System.out.println(resAnd + " " + resOr);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a + b + " ");
        System.out.print(a - b + " ");
        System.out.print(a * b + " ");
        System.out.print(a / b);
        scanner.close();
    }

    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please weite your data here, and then press ENTER....");
        String input = scanner.nextLine();
        System.out.println("Loading....");
        System.out.println("Your data is: " + input);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        PassportFormCreator pc = new PassportFormCreator();
        pc.createForms();

    }
}

class PassportFormCreator {
    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();

        age *= 10;

        System.out.println(firstName + " " + lastName + " " + age);
        System.out.print(firstName.toUpperCase() + "\n" + lastName.toUpperCase() + "\n" + age);


        scanner.close();
    }


}

