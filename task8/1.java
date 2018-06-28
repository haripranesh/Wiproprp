package add_string;
import java.util.Scanner;
public class Add_string {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String one=sc.nextLine();
       String two=sc.nextLine();
       StringBuilder onee=new StringBuilder(one);
       StringBuilder twoo=new StringBuilder(one);
       one=onee.reverse().toString();
       two=twoo.reverse().toString();
       
       for(int i=0;i<one.length();i++)
       {
           int a=Character.getNumericValue(one.charAt(i));
           int b=Character.getNumericValue(two.charAt(i));
           int res=a+b;
           
       }
    }
    
}
