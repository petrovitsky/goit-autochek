package main.module10.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        InputStream is = new DataInputStream(System.in);
        Scanner scanner = new Scanner(is);
        OutputStream os = new DataOutputStream(System.out);

        while (scanner.hasNext()) {

            os.write(scanner.nextLine().getBytes(StandardCharsets.UTF_8));
        }

    }
}
