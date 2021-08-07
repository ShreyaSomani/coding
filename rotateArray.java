import java.io.*;
import java.util.*;

public class rotateArray{
  public static void display(int[] a,int n)
  {
   for(int i=0;i<n;++i)
   System.out.print(a[i]+" ");
  }

  public static void rotate(int[] a, int k,int n){
  while(k>0)
  {
      int b=a[n-1];
      for(int i=n-2;i>=0;--i)
      a[i+1]=a[i];
      a[0]=b;
      --k;
  }
}

public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = sc.nextInt();
    }
    int k = sc.nextInt();

    while(k<0) k=k+n;
    while(k>n) k=k-n;
    rotate(a, k,n);
    display(a,n);
 }

}