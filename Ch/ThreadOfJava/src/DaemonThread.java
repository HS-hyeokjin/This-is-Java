public class DaemonThread {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);   //AutoSaveThread 를 Main Thread의 데몬스레드로 만듦
        autoSaveThread.start();
        try {
            Thread.sleep(3001);
        } catch (InterruptedException e) {
        }
        System.out.println("메인스레드 종료");
    }
}
