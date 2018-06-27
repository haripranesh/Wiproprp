package prp;
import java.util.Scanner;
import java.lang.*;
public class Prp {
    public static int isOdd(int a)
    {
        if(Math.abs(a)%2==0 || Math.abs(a)==0 )
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=isOdd(a);
        System.out.println(res);
    }
}
