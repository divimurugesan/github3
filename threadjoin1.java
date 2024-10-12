public class threadjoin1 {
    public static void main(String[] args) {
        Thread t1= new tjoin1();
        Thread t2= new tjoin1();
        Thread t3= new tjoin1();
        t1.start();
        try{
            //t1.join();
            t1.join(1400);
            
        }catch(Exception e){
            System.err.println(e);
        }
       
        t2.start();
        t3.start();
    }
}
class tjoin1 extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}