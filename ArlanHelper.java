package main;

public class ArlanHelper {
    public String drawRect(int width, int height, char c){
        int row = 1;
        int line = 1;
        String result = "";
        while (line <= height) {
            while (row <= width) {
                result += c;
                row++;
            }
            result+="\n";
            row = 1;
            line++;
        }
        return result;
    }

    public String drawQuad(int i) {
        int row = 1;
        int line = 1;
        String result = "";
        while (line <= i) {
            while (row <= i) {
                result += "*";
                row++;
            }
            result+="\n";
            row = 1;
            line++;
        }

        return result;
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));

        System.out.println(helper.drawRect(5, 5, 'X'));
    }

}