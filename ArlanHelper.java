package main;

public class ArlanHelper {

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        int index = 0;
        while (repeatCount > 0) {
            while (index < pattern.length) {
                result += pattern[index];
                index++;
            }
            repeatCount--;
            index = 0;
        }
        return result;
    }

    /* recommended solution

     public String drawLine(int length) {
        String result = "";

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result;
    }*/
    public String drawLine(int length) {
        String result = "";
        int star = 0;
        int hash = 0;

        while (star + hash < length) {
            result += "*";
            star++;
            if (star + hash < length) {
                result += "#";
                hash++;
            }
        }

        return result;
    }

    public String drawRect(int width, int height, char c) {
        int row = 1;
        int line = 1;
        String result = "";
        while (line <= height) {
            while (row <= width) {
                result += c;
                row++;
            }
            result += "\n";
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
            result += "\n";
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

        System.out.println(helper.drawLine(5));


        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));

    }

}