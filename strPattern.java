import java.io.*;
import java.util.*;

public class strPattern {

    public static void main(String[] args)  {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length();++i)
        {
            for(int j=0;j<=i;++j)
            System.out.print(s.substring(j,i+1)+" ");
            System.out.println();
        }
    }
}
