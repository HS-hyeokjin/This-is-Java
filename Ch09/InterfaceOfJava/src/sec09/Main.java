package sec09;

public class Main {
    public static void main(String[] args) {
        InterfaceC impl = new InterFaceCImpl();
        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
