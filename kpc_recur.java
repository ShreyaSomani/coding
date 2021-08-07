import java.io.*;
import java.util.*;

public class kpc_recur {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    ArrayList<String> list=getKPC(str);
    System.out.println(list);
    }
    
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<> ();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0); //2
        String res=str.substring(1);//53
        ArrayList<String> rres=getKPC(res);//9 words [mg,mh,mi,ng,nh,ni,og,oh,oi]
        
        
        ArrayList<String> mres=new ArrayList<> ();
        String codesforch=codes[(int)ch-48]; //extracting 2
        for(int i=0;i<codesforch.length();++i)//[d,e,f]
        {
            char chcode=codesforch.charAt(i);
            for(String rstr:rres)
            mres.add(chcode+rstr);
        }
        return mres;
        
        
    }

}