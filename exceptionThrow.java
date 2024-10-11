import java.io.*;
import java.util.Scanner;
public class exceptionThrow {
    public static void main(String[] args) {
        int age =9;
        unchecked(age);
        try{
            checked();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
            throw new user("this is user exception");
        }
        catch(user u){
            System.out.println("in catch");
        }
        System.out.println("rest of codes");
    }
    public static void unchecked(int age){
    

 
    try{
        if( age<18){
             throw new ArithmeticException("not eligible");
        }
             
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);

    }
System.out.println("eligible");
    }
        
    
    public static void checked() throws FileNotFoundException{
      FileReader F=new FileReader("file.txt");
      Scanner b=new Scanner(F);
      while(b.hasNextLine()){
        System.out.println(b.nextLine());
    }
    b. close();
    //  throw new FileNotFoundException(" file is not there");
    }
}
class user extends Exception{
    public user(String str)
    {
        super(str);
    }

}
