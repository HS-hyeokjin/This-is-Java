package sec10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamEx {
    public static void main(String[] args) throws Exception {
        //보조 스트림 연결
        FileOutputStream fos = new FileOutputStream("object.dat");
        ObjectOutput oos = new ObjectOutputStream(fos);

        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 10000);
        int[] arr1 = {1, 2, 3};

        //객체 역직렬화하여 객체로 저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("object.dat");
        ObjectInput ois = new ObjectInputStream(fis);

        //파일을 읽고 역직렬화로 객체 복원
        Member m2 = (Member) ois.readObject();
        Product p2 = (Product) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close(); fis.close();

        System.out.println(m2);
        System.out.println(p2);
        System.out.println(Arrays.toString(arr2));
    }
}
