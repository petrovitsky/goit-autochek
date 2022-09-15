package main.module6.levels;

public class Level {
    private String name;

    public Level(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + name;
    }
}
