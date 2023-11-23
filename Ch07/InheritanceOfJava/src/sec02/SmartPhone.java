package sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태 변경");
    }

    public void internet() {
        if (wifi) {
            System.out.println("인터넷에 연결");
        } else {
            System.out.println("인터넷 연결 안됨");
        }
    }
}