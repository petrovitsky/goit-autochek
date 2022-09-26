package main.module8;

public enum Colour {
    GREEN("Green"),
    BLUE("Blue"),
    RED("Red"),
    WHITE("White"),
    BLACK("Black"),
    YELLOW("yellow");

    public String getColour() {
        return this.colour;
    }

    private String colour;

    Colour(String colour) {
        this.colour = colour;
    }

    Colour() {

    }
}
