import java.util.*;
public class SingleDigit{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num<0){
            System.out.println("Please enter a non-negative integer.");
        } 
        else{
            int result=addDigitsUntilSingleDigit(num);
            System.out.println(result);
        }
    }
    public static int addDigitsUntilSingleDigit(int num){
        while(num>=10){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}