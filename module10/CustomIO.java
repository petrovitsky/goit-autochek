package main.module10;

import java.io.IOException;
import java.io.InputStream;

public class CustomIO {
    public static void main(String[] args) throws IOException {

        byte [] input = new byte[] {12,33,45,32,123,44,12};

        InputStream is = new InputStream() {
            private int index = 0;
            @Override
            public int read() throws IOException {
                if (index == input.length){
                    return  -1;
                }
                return input[index++];
            }
        };

        int data = 0;
        while (data != -1 ) {
            System.out.println(data);
            data = is.read();
        }

        System.out.println("input.length = " + input.length);


    }
}
