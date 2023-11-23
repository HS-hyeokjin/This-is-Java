package sec04;

public class SupersonicAirplaneMain {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();   //이륙
        sa.fly();       //일반 비행
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();       //초음속 비행
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();       //일반 비행
        sa.land();      //착륙
    }
}
