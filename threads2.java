public class threads2 {
    public static void main(String[] args) {
        Runnable obj=() ->
        {
      for (int i=0;i<3;i++){
            System.out.println("hello");
            try{ Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("some error");
            }
     }

    };
    Runnable obj1=() ->{
        for (int i=0;i<3;i++)
        {
              System.out.println("hii");
              try{ Thread.sleep(10);
              }
              catch(InterruptedException e){
                  System.out.println("some error");
              }
       }
  
      };
      Thread t1=new Thread(obj);
      Thread t2=new Thread(obj1);
      t1.start();
      t2.start();
}}
