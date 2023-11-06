package sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private static final int SerialVersionUID = -3459324938459;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return id + ":" + name;
    }
}
