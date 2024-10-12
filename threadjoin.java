public class threadjoin {
    public static void main(String args[]){
        Thread t=new tjoin();
        Thread t2= new tjoin();
        t.start();
        try{
            System.out.println("thread name"+Thread.currentThread().getName());
            t.join();
        }catch(InterruptedException e){
            System.err.println(e);
        }
        t2.start();
        try{
            System.out.println("thread name"+Thread.currentThread().getName());
            t2.join();
        }catch(InterruptedException e){
            System.err.println(e);
        }
    }
    
}
class tjoin extends Thread{
    public void run()
{

 for(int i=0;i<2;i++){
       // System.out.println(i);
        
        try{
            Thread.sleep(100);
            System.out.println("thread name"+Thread.currentThread().getName());
    
        }catch(InterruptedException e){
            System.err.println(e);
        }
        System.out.println(i);
    }
}}

