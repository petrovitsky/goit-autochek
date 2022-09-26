package main.module8;

import java.util.Arrays;

public class ShapeTest {

    public static void main(String[] args) {
        Shape cyr = new Circle(Colour.BLUE);
        ShapePrinter sp = new ShapePrinter();
        Colour c = Colour.RED;
        System.out.println(c.getColour());

    }
}
