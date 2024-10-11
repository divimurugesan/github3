class EXceptionThrows{
    public static void main(String[] args)// throws ClassNotFoundException
    {
       // new jimmy().show();
        
     try{
            new jimmy().show();
            new jimmy().add();

        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divisible");
        }
        System.out.println("rest ofthe code");
    }

}
class jimmy{
    void show()throws ClassNotFoundException{
        System.out.println("hello");
      //  throw new ClassNotFoundException("class is found!");
    }
    void add() throws ArithmeticException{
        int a=1/0;
       // return a;
    }
}