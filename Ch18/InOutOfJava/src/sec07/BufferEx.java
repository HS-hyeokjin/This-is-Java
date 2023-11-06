package sec07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx {
    public static void main(String[] args) throws Exception {
        // 기존 방법
        String orginalFilePath1 = BufferEx.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "targetFile1.jpg";
        FileInputStream fis = new FileInputStream(orginalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        // 버퍼 사용 성능 향상
        String orginalFilePath2 = BufferEx.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(orginalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼x 복사
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");

        // 버퍼o 복사
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용:\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        fis2.close();
        fos2.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}

