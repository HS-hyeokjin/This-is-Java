package sec02;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx {
    public static void main(String[] args) {
    try{
        FileOutputStream fos = new FileOutputStream("fileOutStream.txt");
        byte[] arr = {1,2,3,4,5,10,100};

        fos.write(arr);
        fos.flush();
        fos.close();
        }
    catch(IOException e){e.printStackTrace();}
    }
}


