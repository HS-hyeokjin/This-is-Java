package sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Lee");
        dos.writeDouble(3.3);
        dos.writeInt(1);

        dos.writeUTF("Kim");
        dos.writeDouble(4.4);
        dos.writeInt(2);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("primitive.db");
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 0; i < 2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }
        dis.close();
        fis.close();
    }
}
