package sec04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("fileWriter.txt");
            char[] arr = {'q', 'w', 'e'};


            writer.write(arr);
            writer.write("rty");
            writer.flush();
            writer.close();
        }catch (IOException e){e.printStackTrace();}
    }
}
