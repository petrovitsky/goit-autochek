package main.module5;

public class Spaceport {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();



    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }


}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation {
    public void compress() {
        System.out.println("Compress done!");
    }
}

class  Radar {
    public void scan(){
        System.out.println("Scan done!");
    }
}