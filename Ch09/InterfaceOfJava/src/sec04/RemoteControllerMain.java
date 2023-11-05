package sec04;

import sec04.Audio;
import sec04.Tv;

public class RemoteControllerMain {
    public static void main(String[] args) {
        RemoteController rc = new Tv();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        RemoteController.changeBattery();
    }
}
