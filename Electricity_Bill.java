import java.util.Scanner;
public class Sol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c,b,Sc,t;
        String id=sc.nextLine();
        String n=sc.nextLine();
        double u=sc.nextDouble();
        if(u<199) {
          c=1.20;
        }
        else if(u>=200 && u<400) {
            c=1.50;
        }
        else if(u>=400 && u<600) {
            c=1.80;
        }
        else {
            c=2.00;
        }
        b=u*c;
        if(b>400) {
            Sc=0.15*b;
        }
        else {
            Sc=100;
        }
        t=Sc+b;
        System.out.printf("%.2f",t);
    }
}