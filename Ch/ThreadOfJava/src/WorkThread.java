public class WorkThread extends Thread {
    public boolean work = true;

    //생성자
    public WorkThread(String name){
        setName(name);
    }

    //메서드
    @Override
    public void run(){
        while(true){
            if(work){
                System.out.println(getName() + " : 작업처리");
            } else{
                Thread.yield();
            }
        }
    }
}
