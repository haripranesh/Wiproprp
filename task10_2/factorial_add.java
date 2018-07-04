package sum_of_factorial;
import java.util.Scanner;
public class Sum_of_factorial {
    
    public static int factorial(int a)
    {
        int temp=1;
        for(int i=1;i<=a;i++)
        {
           temp=temp*i; 
        }
        return temp;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++)
        {
           res=res+factorial(i); 
        }
        System.out.println(res);
    }
}
