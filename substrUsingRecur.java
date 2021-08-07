import java.io.*;
import java.util.*;

public class subseqUsingRecur {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    ArrayList<String> ss=gss(str);
   
    System.out.println(ss);
    
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);//a
        String res=str.substring(1);//bc;
        ArrayList<String> rres = gss(res);//[--,-c,b-,bc]
        
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:rres)
        mres.add("-"+rstr);
        for(String rstr:rres)
        mres.add(ch + rstr);
        
        
        return mres;
    }

}