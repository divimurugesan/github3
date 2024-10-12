public class threads1 {
    public static void main(String[] args) {
       G obj= new G();
        I obj1=new I();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
        
    }
}//start only belongs to thread cls but thread cls implements the runnable interface
//so create the obj of runnable & pass it to the thread cls

class G implements Runnable{
    public void run (){
           for (int i=0;i<3;i++){
           System.out.println("hello");
           try{
   
           
           Thread.sleep(10);
           }
           catch(InterruptedException e){
               System.out.println("some error");
           }
       }
   }
   }
   class I implements Runnable{
     public  void run (){
           for (int i=0;i<3;i++){
           System.out.println("hI");
           try{
   
           
               Thread.sleep(10);
               }
               catch(InterruptedException e){
                   System.out.println("some error");
               }
           }
           }
       }
   
   