package main.module6.levels;

import java.io.IOException;
import java.io.InputStream;

public class LevelTest {
    public static void main(String[] args) throws IOException {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));

        byte[] input = new byte[]{1,2,3,4,5};
        InputStream stream = new InputStream() {
            private int index = 0;

            @Override
            public int read() throws IOException {
                if (index == input.length) {
                    return -1;
                }
                return input[index++];
            }
        };

        int data = stream.read();
        while (data != -1){
            System.out.println("data = " + data);
            data = stream.read();
        }


    }
}