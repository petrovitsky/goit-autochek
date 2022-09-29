package main.module11;

public class ModuleTest {
    public static void main(String[] args) {
        int result = test(3, 4, (a, b) -> a * b);
        System.out.println(result);
    }

    public static int test (int a, int b, MathExamples m ){

        return m.add(a,b);
    }
}

@FunctionalInterface
interface MathExamples{
    int add(int a, int b);
}