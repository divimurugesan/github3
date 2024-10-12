public class threads {
    public static void main(String[] args) {
        new E().start();
        new F().run();
        try{

        
            Thread.sleep(2);
            }
            catch(InterruptedException e){
                System.out.println("some error");
            }
        }

    }

class E extends Thread{
 public   void run (){
        for (int i=0;i<100;i++){
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
class F extends Thread{
  public  void run (){
        for (int i=0;i<100;i++){
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

