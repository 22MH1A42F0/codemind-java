import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextInt();
        double f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}