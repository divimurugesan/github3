public class exception6 {
    public static void main(String []args){
        int i=56;
        try{
            i=i/0;

        }
        catch(Exception e){

        e.printStackTrace();
        System.out.println( e);
        }
        finally{
            System.out.println(i);
        }
    }
    
}
