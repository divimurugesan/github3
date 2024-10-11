class extra{
    void show() throws ClassNotFoundException{
        Class.forName("extra");
        throw  new  ClassNotFoundException("hello");
    }
}
//it throws an exception in one method or cls and we need create try and catch in cls main



public class exception2 {
    public static void main(String[] args) {
        extra obj= new extra();
        try{
            obj.show();
         }
        catch(ClassNotFoundException e){
            System.out.println("clss not ");
        }
        System.out.println("hi");
    }
}
