import java.util.Scanner;
public class Rad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double Ar=3.14*r*r;
        System.out.printf("%.2f",Ar);
    }
}