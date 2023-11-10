package sec05.Ex01;

public class Person {
    public void action(Calcuable calcuable){
        double result = calcuable.cacl(10,4);
        System.out.println("결과" + result);
    }
}
