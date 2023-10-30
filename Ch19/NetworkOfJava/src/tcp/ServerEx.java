package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요");
        System.out.println("==============================================");

        //TCP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        scanner.close();
        stopServer();
    }

    private static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    //ServerSocket 생성 및 바인딩
                    serverSocket = new ServerSocket(50001);
                    System.out.println("서버 시작됨");

                    while (true) {
                        System.out.println("\n 서버 연결 요청을 기다림");
                        //연결 수락
                        Socket socket = serverSocket.accept();

                        //연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("서버" + isa.getHostName() + "의 연결 요청을 수락함");

                        //데이터 받기
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String message = dis.readUTF();

                        //데이터 보내기
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(message);
                        dos.flush();
                        System.out.println("받은 데이터 다시 보냄");


                        socket.close();
                        System.out.println("서버" + isa.getHostName() + "의 연결을 끊음");
                    }
                } catch (IOException e) {
                    System.out.println("서버" + e.getMessage());
                }
            }
        };
        thread.start();
    }


    private static void stopServer() {
        try {
            //ServerSocket을 닫고 Port 언바인딩
            serverSocket.close();
            System.out.println("서버 종료됨");
        } catch (IOException e1) {
        }
    }
}
