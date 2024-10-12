public class threadsleep {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);

            }catch(InterruptedException E){
                System.out.println(E);
            }
        }
        System.out.println("xyz");
        Thread t=new xyz();
        Thread t2=new xyz();
        t.start();
        t2.start();
    }
}
class xyz extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
}
