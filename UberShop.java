package main;

import java.util.Arrays;


public class UberShop {

    public int[] removePrice(int[] prices) {
        return new int[0];
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int amountOfOccur = 0;
        for (int price : prices) {
            if (price == toRemove) {
                amountOfOccur++;
            }
        }

        int[] result = new int[prices.length - amountOfOccur];
        int index = 0;
        for (int price : prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        int counter = 0;
        for (int price : prices) {
            if (price == min) {
                counter++;
            }
        }


        return counter;
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }
        int min = prices[0];
        int max = prices[0];
        for (int price : prices) {

            if (price < min) {
                min = price;
            }
            if (price > max) {
                max = price;
            }
        }
        return max == min ? new int[]{max} : new int[]{min, max};

    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] < 1000 ? prices[i] * 2 : (float) (prices[i] * 1.5);
        }
    }

    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();
        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[]{100f, 23.5f, 400f};
//        shop.printPrices(prices);

        //Should be [200, 2250]
//        float[] prices = new float[]{100f, 1500f};
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));

        //Should be [50, 1500]
//        int[] prices = new int[]{100, 1500, 300, 50};
//        int[] minMax = shop.findMinMaxPrices(prices);
//        System.out.println(Arrays.toString(minMax));

//        int[] prices = new int[]{100, 1500, 300, 50, 10, 10, 70};
//        System.out.println(shop.getMinPriceCount(prices)); //Should be 2

        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}
