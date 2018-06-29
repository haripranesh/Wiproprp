package currency;
import java.util.Scanner;
public class Currency {
    public static int check(int a,int b)
    {
        switch(a)
        {
            case 1:
            {
                b=b-1000;
                return b;
            }
            case 2:
            {
                b=b-500;
                return b;
            }
            case 3:
            {
                b=b-100;
                return b;
            }
            case 4:
            {
                b=b-50;
                return b;
            }
            case 5:
            {
                b=b-10;
                return b;
            }
            case 6:
            {
                b=b-1;
                return b;
            }
        }
       return 0; 
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int temp=n,count=0;
       int o=0;
       while(temp>=0)
       {
           if(temp>=1000)
           {
               o=1;
           }
           if(temp<1000 && temp>=500)
           {
               o=2;
           }
           if(temp<500 && temp>=100)
           {
               o=3;
           }
           if(temp<100 && temp>=50)
           {
               o=4;
           }
           if(temp<50 && temp>=10)
           {
               o=5;
           }
           if(temp<10)
           {
               o=6;
           }
           temp=check(o,temp);
           //System.out.println(temp);
           count++;
       }
        System.out.println(count-1);   
    }
}
