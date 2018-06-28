package pkg1stprg;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String one=sc.nextLine();
       String two=sc.nextLine();
       StringBuilder onee=new StringBuilder(one);
       StringBuilder twoo=new StringBuilder(two);
       one=onee.reverse().toString();
       two=twoo.reverse().toString();
       
       int maxlen=one.length()>two.length()?one.length():two.length();

       String op="";int carry=0;
       for(int i=0;i<maxlen;i++)
       {
           int a=0,b=0;
           if(i<one.length())
           {
               a=Character.getNumericValue(one.charAt(i));
           }
           if(i<two.length())
           {
              b=Character.getNumericValue(two.charAt(i)); 
           }
           int res=a+b+carry;
           if(res>=10)
           {
               op+=String.valueOf(res%10);
               carry=res/10;
           }
           else
           {
               op+=String.valueOf(res);
               carry=0;
           }
        }
       StringBuilder out=new StringBuilder(op);
       System.out.println(out.reverse());
    }
}
