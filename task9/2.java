package password_generation;
import java.util.Scanner;
public class Password_generation {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int one=sc.nextInt();
       int two=sc.nextInt();
       int three=sc.nextInt();
       
       String on=String.valueOf(one);
       String tw=String.valueOf(two);
       String th=String.valueOf(three);
       String all=on+tw+th;
       int max=0;
       for(int i=0;i<all.length();i++)
       {
           if(max<Character.getNumericValue(all.charAt(i)))
           {
               max=Character.getNumericValue(all.charAt(i));
           }
       }
       String temp=String.valueOf(max);
       
       for(int i=0;i<3;i++)
       {
           int a=Character.getNumericValue(on.charAt(i));
           int b=Character.getNumericValue(tw.charAt(i));
           int c=Character.getNumericValue(th.charAt(i));
           temp+=a<b?(a<c?a:c):(b<c?b:c);       
       }
    System.out.print(temp);
    }
}
