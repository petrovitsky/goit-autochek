package main.module8;

public class ShapeTest {

    public static void main(String[] args) {

    AbstractShape octagon = new Octagon();
        System.out.println("octagon.getName() = " + octagon.getName());
    }
}

interface Vector {

    void interMethod ();
    @Override
    String toString();
}

abstract class AbstarctVector implements Vector {

}

class ArrayVector extends AbstarctVector {

    @Override
    public void interMethod() {

    }
}

class ZeroVector extends AbstarctVector {
    public static final ZeroVector INSTANCE = new ZeroVector();

    private ZeroVector(){}

    @Override
    public void interMethod() {

    }

}