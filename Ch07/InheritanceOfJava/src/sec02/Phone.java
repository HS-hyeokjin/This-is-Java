package sec02;

public class Phone {
    public String model;
    public String color;

    public void bell(){
        System.out.println("벨이 울린다.");
    }
    public void sendVoice(String message){
        System.out.println("본인 : " + message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }
    public void hangUp() {
        System.out.println("전화를 끊는다.");
    }
}
