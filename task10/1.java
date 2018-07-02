package good_num;
import java.util.*;
public class Good_num {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String x="";
       int f=2;
       for(int i=0;i<n;i++)
       {
           if(i%2==0)
           {
               x+=1;
           }
           else
           {
               if(f==2)
               {
                   x+=2;
                   f=3;
               }
               else if(f==3)
               {
                   x+=3;
                   f=2;
               }
           }
       }
       System.out.println(x);
    }
}
