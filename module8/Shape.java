package main.module8;

public abstract class Shape {
    private String name = getClass().getSimpleName();
    private Colour colour;


    public Shape(Colour colour) {
        this.colour = colour;

    }

    public String getName(){
        return this.name;
    }

    public String  getColour(){
        return this.colour.getColour();
    }


}
