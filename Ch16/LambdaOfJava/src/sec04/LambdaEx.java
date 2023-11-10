package sec04;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두개인 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        //리턴문이 하나만 있을 경우 ( 연산식 )
        person.action((x, y) -> (x + y));

        //리턴문이 하나만 있을 경우 ( 메서드 호출 )
        person.action((x, y) -> sum(x, y));

    }
    public static double sum(double x, double y){
        return (x+y);
    }
}
