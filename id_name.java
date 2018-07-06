package task11;
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] id=new int[n];
        String[] name=new String[n];
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            id[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(id[i]>id[j])
                {
                    int t=id[i];
                    String tr=name[i];
                    id[i]=id[j];
                    name[i]=name[j];
                    id[j]=t;
                    name[j]=tr;
                }
            }
        }
        int first=id[0];
        String tmep="";
        for(int i=0;i<n-2;i++)
        {
            if(id[i]+1==id[i+1] && id[i+1]+1==id[i+2])
            {
               tmep+=name[i]+" "+name[i+1]+" "+name[i+2]; 
            }
        }
        System.out.println(tmep);
       
    }
    
}
