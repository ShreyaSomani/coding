import java.io.*;
import java.util.*;

public class searchSorted {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                arr[i][j]=sc.nextInt();
            }
        }
       
        int data=sc.nextInt();
        int row=-1,col=-1;
         for(int i=0;i<n;++i)
        {
           int j=binary(arr,i,n,data);
           if(j>-1)
           {
               row=i;
               col=j;
               break;
           }
        }
        
        if(row>-1 && col>-1)
        System.out.println(row+"\n"+col);
        else
        System.out.println("Not Found");
        
    }
    
    
    public static int binary(int[][] arr,int i,int n,int data)
    {
        int beg=0;
        int end=n-1;
        int mid=0;
        
        while(beg<=end)
        {
            mid=(beg+end)/2;
            if(arr[i][mid]==data)
            return mid;
            else if(arr[i][mid]>data)
            end=mid-1;
            else
            beg=mid+1;
        }
        return -1;
        
    }
    
}