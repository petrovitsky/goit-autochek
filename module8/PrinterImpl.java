package main.module8;

public class PrinterImpl implements Printer {
    private Shape s;

    public PrinterImpl(Shape s) {
        this.s = s;
    }

    @Override
    public void printName(Shape shape) {
        System.out.println(shape.name);
    }
}
