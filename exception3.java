class my extends Exception{
    public my(String s){
        super(s);
    }
}


public class exception3 {
public static void main(String args[]){
    int i=0;
    try{
        i=2/1;
        throw new my("i like exception");
    }
    catch(my e){
        System.out.println(e);
    }
    System.out.println(i);
}
}
