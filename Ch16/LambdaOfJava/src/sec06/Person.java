package sec06;

public class Person {
    public Member getMember1(Creatable1 creatable){
        String id = "winter";
        Member member = creatable.creat(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable){
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}
