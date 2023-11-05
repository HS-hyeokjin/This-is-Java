package sec04;

public class Tv implements RemoteController {

    private int volume;

    @Override
    public void turnOn(){
        System.out.println("티버 켜기");
    }

    @Override
    public void turnOff() {System.out.println("티비 끄기");}

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteController.MAX_VOLUME){
            System.out.println("볼륨 최대치 초과");
        }
    }
}