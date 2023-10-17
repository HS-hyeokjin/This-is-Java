public class User2Thread extends Thread{
    private Calculator calculator;

    public User2Thread() {
        setName("ueser2Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory2(50);
    }
}
