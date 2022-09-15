package main.module6.levels;

public class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level("Test", points));
    }
}