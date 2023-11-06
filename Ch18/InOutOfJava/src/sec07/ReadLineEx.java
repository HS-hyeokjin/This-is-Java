package sec07;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineEx {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/sec07/ReadLineEx.java"));

        int lineNo = 1;
        while (true) {
            String str = br.readLine();
            //더이상 읽을 파일 없으면 wile 종료
            if(str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}