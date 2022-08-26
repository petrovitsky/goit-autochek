package main;

import java.util.Arrays;

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String[] allData = new String[stocks.length * 2];
        int index = 0;
        for (String str : stocks) {
            String[] tmp = str.split(" ");
            allData[index] = tmp[0];
            allData[index + 1] = tmp[1];
            index += 2;
        }

        String result = "";
        for (int i = 1; i < allData.length ; i+=2) {
            if (Integer.parseInt(allData[i]) < 200) {
                result += allData[i - 1];
                result += " ";
            }
        }


//        String[] result = stocks[0].split(" ");
        return result.trim();
    }

    public static void main(String[] args) {
        String a = "";
        CheapStocks cs = new CheapStocks();
        System.out.println(cs.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200"}));
    }
}

