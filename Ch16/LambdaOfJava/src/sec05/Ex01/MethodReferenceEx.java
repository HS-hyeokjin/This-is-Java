package sec05.Ex01;

public class MethodReferenceEx {
    public static void main(String[] args) {
        Person person = new Person();

        //정적 메서드의 경우
        //person.action((x, y) -> Computer.staticMethod(x, y));
        person.action(Computer :: staticMethod);

        //인스턴스 메서드일 경우
        //person.action((x, y) -> com.instanceMethod(x,y));
        Computer com = new Computer();
        person.action(com :: instanceMethod);
    }
}
