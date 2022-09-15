package main.module6.levels;

public class Level {
    private String name;
    Point[] points;

    Level(String name, Point[] points) {
        this.name = name;
        this.points = points;

    }

    @Override
    public String toString() {
        return "Quarke level, name is " + name + ", point count is " + points.length;
    }

    static class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
