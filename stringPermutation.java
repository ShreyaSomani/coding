import java.io.*;
import java.util.*;

public class stringPermutation {
    
    public static int factorial(int n)
    {
        if(n<=1)
        return n;
        int f=1;
        
        for(int i=2;i<=n;++i)
        {
            f*=i;
        }
        return f;
    }
    
	public static void solution(String str){
		int n=str.length();
		int f=factorial(n);
		for(int i=0;i<f;++i)
		{
		    StringBuilder sb=new StringBuilder(str);
		    String s="";
		    int pos=i;
		    for(int j=n;j>=1;--j)
		    {
		        int r=pos%j;
		        pos=pos/j;
		        s+=sb.charAt(r);
		        sb.deleteCharAt(r);
		    }
		    System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}