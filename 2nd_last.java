package prp;
import java.util.Scanner;
import java.lang.*;
public class Prp {
    public static int return2nd(int a)
    {
        int res=0;
        for(int i=0;i<2;i++)
        {
           res=a%10; 
           a/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=return2nd(a);
        System.out.println(res);
    }
}
