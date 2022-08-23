package main;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    public boolean isHangarOk(int side1, int side2, int price) {
        boolean result = false;
        if ((price / (side1 * side2)) > 1000 || side1 * side2 < 1500 || ((float)Math.max(side1, side2) / Math.min(side1, side2)) > 2) {
            return result;
        } else {
            return !result;
        }
    }

    public String getMyPrizes(int ticket) {
        String result = null;

        if (ticket % 10 == 0) {
            result = "crystall";
        } else if (ticket % 10 == 7) {
            result = "chip";
        } else {
            result = "";
        }

        if (ticket > 200) {
            return result + " coin";
        } else {
            return result;
        }

    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        max = c;

        if (a > b) {
            if (a >= c) {
                max = a;
            }
        } else if (b >= c) {
            max = b;
        }

        if (max < 10) {
            System.out.println(max * 0.7F);
        } else if (max > 100) {
            System.out.println(max * 2.1F);
        } else {
            System.out.println(max * 1.2F);
        }
        scanner.close();
        System.out.println(max);
    }

    public int calculateNeededFuel(int distance) {
        return distance <= 20 ? 1000 : (distance - 20) * 5 + 1000;
    }

    public int roundSpeed(int speed) {
        if (speed % 10 > 4) {
            return (speed / 10 + 1) * 10;
        } else {
            return (speed / 10) * 10;
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return count * 70;
        } else if (fuel.equals("STAR500")) {
            return count * 120;
        } else if (fuel.equals("STAR1000")) {
            return count * 200;
        } else return count * 50;
    }

    public String choosePlanet(long distanceToEarth) {
        return distanceToEarth < 45677 ? "Earth" : "Pern";
    }

    public String[] getPlanets(String galaxy) {

        switch (galaxy) {
            case "Miaru":
                return new String[]{"Maux", "Reux", "Piax"};
            case "Milkyway":
                return new String[]{"Earth", "Mars", "Jupiter"};
            case "DangerBanger":
                return new String[]{"Fobius", "Demius"};
            default:
                return new String[0];
        }
    }

    public int calculateDistance(int distance) {
        return Math.abs(distance);

    }


    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(25));

        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(64, 133, 5005056));
    }
}
