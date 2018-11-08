//this class will perform quick sort
import java.util.*;
class Quick
{
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter " + arr.length + " elements:");
        for(int i=0; i<arr.length; i++)
        { 
            System.out.print((i+1) + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("\nOriginal array: ");
        show(arr);
        qsort(arr, 0, arr.length-1);
        System.out.println("\nSorted Array: ");
        show(arr);
    }
    
    public void show(int a[])
    {
        System.out.print("| ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " | ");
        System.out.println();
    }
    
    public void qsort(int a[], int low, int high)
    {
        showWin(a);
        int l=low;
        int h=high;
        if(low>=high) return;
        int mid=a[(l+h)/2];
        while(l<h)
        {
            while(l<h && a[l]<mid) l++;
            while(l<h && a[h]>mid) h--;
            if(l<h)
            {
                int t=a[l];
                a[l]=a[h];
                a[h]=t;
            }            
        }
        if(h<l)
        {
            int t=h;
            h=l;
            l=t;
        }
        qsort(a, low, l);
        qsort(a, (l==low)?l+1: l, high);
    }
    
    public void showWin(int a[])
    {
        String str="| ";
        for(int i=0; i<a.length; i++)
            str=str + a[i] + " | ";
        str=str+"\n";
    }
}

public class QuickSort
{
    public static void main(String args[])
    {
        new Quick().get();
    }
}