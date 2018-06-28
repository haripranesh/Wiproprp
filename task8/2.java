package pkg2nd;
import java.util.*;

public class Main {
    public static boolean isPrime(int a)
    {
        int f=0;
        for(int j=2;j<=a/2;j++)
        {
            f=0;
            if(a%j==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            boolean x=isPrime(i);
            if(!x || i==1)
            {
               sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
