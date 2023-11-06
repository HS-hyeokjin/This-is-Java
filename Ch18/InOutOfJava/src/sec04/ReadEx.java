package sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("fileWriter");
            char[] arr = new char[100];
            while(true){
                int num = reader.read(arr);
                if(num == -1){break;}
                for (int i = 0; i < num; i++) {
                    System.out.println(arr[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
    }
}
