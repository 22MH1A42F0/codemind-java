import java.util.Scanner;
public class Amicable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum1=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
               sum1=sum1+i;
            }
        }
        int sum2=0;
        for(int i=1;i<m;i++){
            if(m%i==0){
               sum2=sum2+i;
            }
        }
        if(sum1==m && sum2==n){
            System.out.println("Amicable");
        }
        else {
            System.out.println("Not Amicable");
        }
    }
}