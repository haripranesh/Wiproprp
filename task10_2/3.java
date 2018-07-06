package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static int fact(int a)
    {
     if(a>=1)
     {
         return a*fact(a-1);
     }
     else
     {
        return 1;
     }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int n=sc.nextInt();
     int sum=0;
     for(int i=1;i<=n;i++)
     {
         if(i==n)
         {
             sum+=Math.pow(x, n)/n;
         }
         else
         {
             sum+=Math.pow(x, i)/fact(i);
         }
     }
          System.out.println(sum);
    }
}
