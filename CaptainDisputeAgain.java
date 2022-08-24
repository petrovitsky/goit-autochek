package main;

public class CaptainDisputeAgain {
    public static int findMin(int[] triple){
        return Math.min(Math.min(triple[0], triple[1]),triple[2]);
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {1, 10, 3}));
        System.out.println(findMin(new int[] {50, 4, 100}));
    }
}
