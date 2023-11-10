package sec05.Ex02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "Kim";
        String b = "Lee";

        int result = comparable.compare(a, b);
        if (result < 0) {
            System.out.println(a + "은 " + b + " 보다 앞에 옵니다.");
        } else if (result == 0) {
            System.out.println(a + "와 " + b + "는 같습니다,");
        }
        System.out.println(b + "은 " + a + " 보다 앞에 옵니다.");
    }
}
