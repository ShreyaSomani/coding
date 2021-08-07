import java.io.*;
import java.util.*;

public class PalinSubstring {

	public static void solution(String str){
		for(int i=0;i<str.length();++i)
		{
		    for(int j=i;j<str.length();++j)
		   {
		       String s=str.substring(i,j+1);
		   
		       int p=0;
		       int m=s.length()-1;
		       boolean flag=true;
		       while(p<=m)
		       {
		           if(s.charAt(p)!=s.charAt(m))
		           {
		               flag=false;
		               break;
		           }
		           ++p;
		           --m;
		       }
		       if(flag==true)
		       System.out.println(s);
		   }
		 
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}