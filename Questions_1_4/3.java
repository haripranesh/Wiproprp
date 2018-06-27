package whatsapp_que3;
import java.util.Scanner;
public class Whatsapp_que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        char c='a';
        int count=0,alpha_c=0;
        
        for(int i=1;i<=26;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(c==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>0)
            {
                alpha_c++;
            }
            c++;
            count=0;
        }
        if(alpha_c==26)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }    
    }
}
