
package palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,c=0;
        int[] count=new int[10];
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++)
        {
            count[Character.getNumericValue(str.charAt(i))]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==1)
            {
                c++;
            }
            System.out.print(count[i]);
        }
      if(c>1)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }
}
