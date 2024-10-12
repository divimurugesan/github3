public class Threadstate implements Runnable {
    public static void main(String[] args) {
        Threadstate obj=new Threadstate();
        Thread t=new Thread(obj);
        System.out.println("t1"+t.getState());
        t.start();
        System.out.println("t1 after"+t.getState());
        new abc().start();
        System.out.println(t.getName());
    }
    public void run (){
        System.out.println("hello");
    }
}
class abc extends Thread{
   public  void run(){
        System.out.println("thread is running");
    }
}

