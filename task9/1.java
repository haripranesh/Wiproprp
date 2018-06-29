package task9_1;
import java.util.*;
public class Task9_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,f=0,odd_c=0;
        String str=String.valueOf(n);
        int[] count=new int[10];
        
        for(int i=0;i<str.length();i++)
        {
            count[Character.getNumericValue(str.charAt(i))]++;
        }
        
        int od_ev=(str.length()%2==0)?1:0;
        if(od_ev==1)
            {
              for(int i=0;i<count.length;i++)
                {
                 if(count[i]%2!=0)
                 {
                    f=1;
                    break;  
                 }
                }
              String x=(f==1)?"NO":"YES";
              System.out.println(x);
            }
        else
        {
            for(int i=0;i<count.length;i++)
            {
                if(count[i]%2==1)
                {
                    odd_c++;
                }
                if(odd_c>1)
                {
                    f=2;
                    break;
                }
            }
              String x=(f!=2)?"YES":"NO";
              System.out.println(x);
        }
    }
}
