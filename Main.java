package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//
//        String message = scan.nextLine();
//
        String str= "jasa";

        MoonRobotVespenGasDetector test = new MoonRobotVespenGasDetector();
        MarsValueConverter mars = new MarsValueConverter();

        System.out.println(mars.changeMoneyAmount(100F, 40.50F));
        System.out.println(mars.calculateMoneySum(50, 40));

        System.out.println(test.isAcidOk(100, 50, 150));
        System.out.println(test.isDensityOk(1500));
        System.out.println(test.isDensityOk(3000));
        System.out.println(test.isTemperatureOk(false));
        System.out.println(test.isGroundOkForVespenGas(120, 75, 150, 5000, false));
    }
}

class MoonRobotVespenGasDetector {

    int a;

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return (isAcidOk(acidValue, minAcid, maxAcid) == true) && (isDensityOk(density)) && (isTemperatureOk(cold));
    }
}

class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove) {


        return (int) (startAmount - toRemove);


    }

    public byte calculateMoneySum(int sum1, int sum2) {

        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney){

        return (short) (startMoney/2);
    }
}

