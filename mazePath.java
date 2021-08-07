import java.io.*;
import java.util.*;

public class mazePath {

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
    
    if(sc<dc)
    hpaths=getMazePaths(sr,sc+1,dr,dc); //[1,1]->[1,2]
    
    if(sr<dr)
    vpaths=getMazePaths(sr+1,sc,dr,dc);//[1,1]->[2,1]
    
    ArrayList<String> mres=new ArrayList<>();
    for(String rstr:hpaths)
    mres.add('h'+rstr);
    
    for(String rstr:vpaths)
    mres.add('v'+rstr);
      
    return mres;  
    }

}