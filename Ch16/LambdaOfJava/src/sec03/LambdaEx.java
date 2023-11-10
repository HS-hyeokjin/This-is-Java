package sec03;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name);
            System.out.println(job);
        });

        person.action2((word) -> {
            System.out.println(word);
            System.out.println(word);
        });
    }
}
