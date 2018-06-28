package pkg3rd_prg;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int one=sc.nextInt();
         int two=sc.nextInt();
         int three=sc.nextInt();
         int four=sc.nextInt();
         String str=String.valueOf(one)+String.valueOf(two)+String.valueOf(three)+String.valueOf(four);
         int[] count=new int[10];
         for(int i=0;i<str.length();i++)
         {
             count[Character.getNumericValue(str.charAt(i))]++;
         }
         int maxval=0,index=0,index1=0;
         for(int i=0;i<count.length;i++)
         {
              if(maxval<count[i])
              {
                  maxval=count[i];
                  index=i;
              }
              if(maxval==count[i])
              {
                  index1=i;
              }
         }
         int op=index>index1?index:index1;
        System.out.println(op);
    }
}
