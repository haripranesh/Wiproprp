package javaapplication1;
import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String one=sc.next();
        String two=sc.next();
        int f=0;
        int[] count=new int[256];
        for(int i=0;i<one.length();i++)
        {
            count[one.charAt(i)]++;
            count[two.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                f=1;
            }
        }
        int swap=0;
        if(f==1)
        {
            System.out.println("-1");
        }
        else
        {
            for(int i=0;i<one.length();i++)
            {
                if(one.charAt(i)!=two.charAt(i))
                {
                    swap++;
                }
            }
            System.out.println(swap/2);
        }
    }
}
