package main.module11;

public class ModuleTest {
    private static MathExamples add = (a, b) -> a + b;
    private static MathExamples sub = (a, b) -> a - b;
    private static MathExamples mult = (a, b) -> a * b;
    private static MathExamples div = (a, b) -> a / b;


    public static void main(String[] args) {
        System.out.println("test(3,5,add) = " + test(3, 5, add));
        System.out.println("test(3,5,sub) = " + test(3, 5, sub));
        System.out.println("test(3,5,mult) = " + test(3, 5, mult));
        System.out.println("test(3,5,div) = " + test(3, 5, div));

    }

    public static int test(int a, int b, MathExamples m) {

        return m.add(a, b);
    }
}

@FunctionalInterface
interface MathExamples {
    int add(int a, int b);
}