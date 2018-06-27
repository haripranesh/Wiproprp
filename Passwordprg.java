package password;
import java.util.Scanner;
public class Password {
    public static String checkPass(String a)
    {
        int len=a.length();
        int lowcount=0,upcount=0,digcount=0,specialcount=0,f=0,f1=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isLowerCase(a.charAt(i)))
            {
                lowcount++;
            }
            if(Character.isUpperCase(a.charAt(i)))
            {
                upcount++;
            }
            if(a.charAt(i)>='0' && a.charAt(i)<='9' )
            {
                digcount++;
            }
            if((a.charAt(i)>=33 && a.charAt(i)<=45 && a.charAt(i)!=34 && a.charAt(i)!=44 )|| a.charAt(i)==64)
            {
                specialcount++;
            }
        }
        if(lowcount>=1 && upcount>=1 && digcount>=1 && specialcount>=1 && len>=8)
        {
            f1=1;
            return "Strong Password";
        }
        if(lowcount>0 && upcount>0 && specialcount>0 && f1!=1&& len>=6)
        {
            return "Moderate Password";
        }
        else
        {
            return "Weak Password";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=checkPass(str);
        System.out.println(str1);
    }
}
