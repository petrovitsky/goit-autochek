package main;

import java.util.Arrays;

public class HarekCity {
    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        return Arrays.copyOf(names, names.length);
    }
    public void printKeyboard(){
        char[][] array = createKeyboard();
        for (int i = 0; i < array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
    public char[][] createKeyboard(){

        char[][] chars = new char[][]{{'1', '2', '3'}, {'4', '5', '6'} , {'7', '8', '9'}, {'*', '0', '#'}};

        return chars;
    }
    public String[] changeElectResultAgain(String[] results){

        return Arrays.copyOfRange(results, 2,5);
    }
    public void changeElectResult(String[] results){

        try {
            String tmp;
            tmp = results[0];
            results[0] = results[results.length - 1];
            results[results.length - 1] = tmp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());;
        }
    }
    public String firstAndLastTogether(String[] names) {

        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    public void fixNames(String[] names, String[] toReplace) {
        int iterstorRepl = 0;
        int iteratorNames = 0;

        while (iterstorRepl < toReplace.length) {
            if (iteratorNames % 2 != 0) {
                names[iteratorNames] = toReplace[iterstorRepl];
                iterstorRepl++;
            }
            iteratorNames++;
        }

    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public static void main(String[] args) {


        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
}
