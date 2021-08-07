import java.io.*;
import java.util.*;

public class mazeWithJumps {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<String> list=  getMazePaths(1,1,n,m);
    System.out.println(list);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if(sr==dr && sc==dc)
    {
        ArrayList<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    ArrayList<String> hpaths=new ArrayList<>();
    ArrayList<String> vpaths=new ArrayList<>();
    ArrayList<String> dpaths=new ArrayList<>();
    ArrayList<String> mres=new ArrayList<>();
    for(int i=1;i<=dc-sc;++i)
    {
    hpaths=getMazePaths(sr,sc+i,dr,dc); 
    for(String rstr:hpaths)
    mres.add("h"+ i + rstr);
    }
    
    for(int i=1;i<=dr-sr;++i)
    {
    vpaths=getMazePaths(sr+i,sc,dr,dc); 
    for(String rstr:vpaths)
    mres.add("v"+ i + rstr);
    }
    
    for(int i=1;i<=dr-sr && i<=dc-sc;++i)
    {
    dpaths=getMazePaths(sr+i,sc+i,dr,dc);
    for(String rstr:dpaths)
    mres.add("d"+ i +rstr);
    }
    
    return mres;  
    }

}