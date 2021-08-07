import java.io.*;
import java.util.*;

public class ArrayListPrime {

	public static void solution(ArrayList<Integer> list){ 
		for(int i=0;i<list.size();++i)
		{
		    int val=list.get(i);
		    int count=0;
		    if(val<=2)
		    {
		        list.remove(i);
		        --i;
		    }
		    else
		    {
		        for(int j=2;j*j<=val;++j)
		        {
		            if(val%j==0)
		            ++count;
		        }
		        if(count==0)
		        {
		            list.remove(i);
		            --i;
		        }
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			list.add(scn.nextInt());
		}
		solution(list);
		System.out.println(list);
	}

}