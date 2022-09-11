package main.module5;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();


    public void launch() {
        gasStation.refuel();
        serviceTower.service();
    }
}

class GasStation {
    public void refuel(){
        System.out.println("Refuel done!");
    }
}

class ServiceTower{
    public void service(){
        System.out.println("Service done!");
    }
}