import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int flag=0;
        for(int i=0;i<10;i++){
        int s=i*(i+1);
        if(s==x){
            flag+=1;
        }
        }
        if(flag==1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}