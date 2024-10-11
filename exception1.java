class Myexception extends  Exception{
    public Myexception(String str){
        super(str);
    }
}
// custom expection that should extend the super cls and the constructer should be created and pass the variable through super

public class exception1 {

        public static void main(String[] args) {
            int i=20;
            int j=0;
    
            try{
               j=18/i; 
               if(j==0)
                throw new Myexception("i don't want 0");
            }
            
            catch(Myexception e){
                    j=18/1;
                    System.out.println("arithmetic expression" + e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array limit");
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
            System.out.println(j);
            System.out.println("bye..");
        }
    }
    

