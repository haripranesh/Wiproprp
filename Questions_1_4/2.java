package whats_app_que2;

import java.util.Scanner;

public class Whats_app_que2 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int f=0;
       for(int i=0;i<str.length()-1;i++)
       {
           char[] a=str.toCharArray();
           char t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;
           
           String str1=new String(a);
           StringBuilder ab=new StringBuilder(str1);
           ab.reverse();
           String str2=ab.toString();
           if(str1.equals(str2))
           {
               f=1;
                System.out.println("YES");
                break;
           }
       }
       if(f!=1)
       {
            System.out.println("NO");
       }
    }
}
