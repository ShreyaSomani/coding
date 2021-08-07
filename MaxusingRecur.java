import java.io.*;
import java.util.*;

public class MaxusingRecur {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i)
        arr[i]=sc.nextInt();
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx==arr.length-1)
        return arr[idx];
        
        int max=maxOfArray(arr,idx+1);
        if(arr[idx]<max)
        return max;
        else
        return arr[idx];
        
    }

}