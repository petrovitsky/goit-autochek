package main.module8;

public abstract class AbstractShape implements Shape {
    private String name = getClass().getSimpleName();

    public String getName(){
        return this.name;
    };


}
