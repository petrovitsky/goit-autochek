package main;

public class SaveStarShip {
    public int calculateDistance(int distance){
        return Math.abs(distance);
    }
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}
