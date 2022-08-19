package main;

import java.util.Arrays;

public class HarekCity {
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


        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults));
    }
}
