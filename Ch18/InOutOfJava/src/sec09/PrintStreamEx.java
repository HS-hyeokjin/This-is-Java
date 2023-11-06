package sec09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("printstream.txt");
        PrintStream ps = new PrintStream(fos);

        ps.print("마치, ");
        ps.println("프린터가 출력하는 것처럼 데이터를 출력합니다.");
        ps.printf("| %6d | %-10s  | %10s | \n", 1, "Lee", "직장인");
        ps.printf("| %6d | %-10s  | %10s | \n", 2, "Kim", "학생");

        ps.flush();
        ps.close();
    }
}
