package main.module8;

public class ShapeTest {

    public static void main(String[] args) {



        Printer printer = new Printer() {
            @Override
            public void printName(Shape s) {
                System.out.println(s.name);
            }
        };
        System.out.println(printer.getClass().getName());


    }
}


