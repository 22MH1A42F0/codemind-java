import java.util.Scanner;
public class Demo{
    public static int length(int n){
        int length=0;
        while(n!=0){
        length=length+1;
        n=n/10;
        }
         return length;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n;
        int r=0;
        int sum=0;
        int len=length(num);
        n=num;
        while(num>0){
            r=num%10;
            sum=sum+(int)Math.pow(r,len);
            num=num/10;
            len--;
        }
        if(sum==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}