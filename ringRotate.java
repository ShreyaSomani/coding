import java.io.*;
import java.util.*;

public class ringRotate {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        int s=sc.nextInt();
        int r=sc.nextInt();
        
        int top=s-1;
        int bottom=n-s;
        int left=s-1;
        int right=m-s;
        
        int len=2*(bottom-top)+2*(right-left);
        
        int[] a=new int[len];
        int k=0;
        for(int i=left;i<=right;++i)
        a[k++]=arr[top][i];
            ++top;
        
        for(int i=top;i<=bottom;++i)
        a[k++]=arr[i][right];
            --right;
        
        for(int i=right;i>=left;--i)
        a[k++]=arr[bottom][i];
            --bottom;
        
        for(int i=bottom;i>=top;--i)
        a[k++]=arr[i][left];
        
        
        rotate(a,r,len);
        
        k=0;
        top=s-1;
        bottom=n-s;
        left=s-1;
        right=m-s;
        
        for(int i=left;i<=right;++i)
        arr[top][i]=a[k++];
            ++top;
        
        for(int i=top;i<=bottom;++i)
        arr[i][right]=a[k++];
            --right;
        
        for(int i=right;i>=left;--i)
        arr[bottom][i]=a[k++];
            --bottom;
        
        for(int i=bottom;i>=top;--i)
        arr[i][left]=a[k++];
        
        
        display(arr);
    }
    
    public static void rotate(int[] a, int k,int n){
    while(k>0)
  {
      int b=a[0];
      for(int i=1;i<n;++i)
      a[i-1]=a[i];
      a[n-1]=b;
      --k;
  }
}

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}