package sec04;

public class Audio implements RemoteController {

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끄기");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            System.out.println("볼륨 최대치 초과");
        }
        else {
            this.volume = volume;
        }
    }

    //추가 필드 선언
    private int memoryVolume;

    @Override
    public void setMute(boolean mute){
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음처리");
            setVolume(RemoteController.MIN_VOLUME);
        } else{
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }
    }
}