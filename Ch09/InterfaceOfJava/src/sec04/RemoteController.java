package sec04;

public interface RemoteController{

        //상수 필드
        //public static final 생략
        int MAX_VOLUME = 10;
        int MIN_VOLUME = 0;
        //int volume;   <- 불가능

        //추상 메서드
        //public abstract 생략
        void turnOn();
        void turnOff();
        void setVolume(int volume);

        //일반 메서드
        default void setMute(boolean mute){
                if(mute){
                        System.out.println("무음처리");
                        setVolume(0);
                }
                else{
                        System.out.println("무음해제");
                }
        }

        static void changeBattery(){
                System.out.println("배터리 교체");
        }

}

