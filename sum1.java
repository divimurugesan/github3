import java.util.Scanner;
class sum1{
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       long n=scan.nextLong();
       System.out.println(sum(n));
       scan.close();
    }
    public static long sum(long n){
        long sum=0;
        for(long i=1;i<=5;i++){
            sum=sum+i*i*i;
        }
        return sum;
    }
}