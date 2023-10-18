public class PrintThread extends Thread {

    @Override
    public void run() {
        try{
            while (true){
                System.out.println("실행중");
                Thread.sleep(1);  //일시정지로 만듦(예외가 발생 할 수 있도록) 이때 다른 스레드 인터럽트됨
            }
        } catch(InterruptedException e){}
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}