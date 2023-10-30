package tcp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressGet {
    public static void main(String[] args) {
        try{

            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 로컬 주소 : " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for(InetAddress remote : iaArr){
                System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
            }

        } catch (UnknownHostException e) { e.printStackTrace();}


    }
}