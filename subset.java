import java.io.*;
import java.util.*;
import java.lang.*;
public class subset {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;++i)
        arr[i]=sc.nextInt();
        
        int binary=(int)Math.pow(2,n);
        
        for(int i=0;i<binary;++i)
        {
            int dec=i;
            String s="";
            for(int j=n-1;j>=0;--j)
            {
                int r=dec%2;
                dec=dec/2;
                if(r==0)
                s="-\t"+s;
                else
                s=arr[j]+"\t"+s;
            }
           System.out.println(s); 
        }
        
     }
}


