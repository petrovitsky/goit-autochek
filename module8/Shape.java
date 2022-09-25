package main.module8;

public abstract class Shape {
    protected int area;
    protected final String name;
    {
        this.name = getClass().getSimpleName();
    }
    public abstract String getName();
}
