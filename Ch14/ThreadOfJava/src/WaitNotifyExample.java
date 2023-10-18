public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();   //공유작업 객체

        ThreadA threadA = new ThreadA(workObject);
        ThreadB threadB = new ThreadB(workObject);

        threadA.start();
        threadB.start();
    }
}