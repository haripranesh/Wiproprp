package whatsapp_que1;

import java.util.Scanner;

public class Whatsapp_que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){ a[i]=sc.nextInt();}
        int f=0;
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==sum)
                {
                    System.out.print("("+a[i]+","+a[i+1]+")"+" ");
                    f=1;
                }
            } 
        }
        if(f==0)
        {
            System.out.println(-1);
        }
    }
}
