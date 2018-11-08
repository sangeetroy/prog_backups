//this class will perform insertion sort on an array of elements
import java.util.*;
class Merge
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
        System.out.println("The original array:");
        show(arr);
        mSort(arr, 0, arr.length-1);
        System.out.println("The sorted array:");
        show(arr);
    }

    public void show(int a[])
    {
        System.out.print("| ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " | ");
        System.out.println();
    }

    public void mSort(int arr[], int lo, int n)
    {
        int low=lo;
        int high=n;
        if(low>=high) return;
        int mid=(low + high)/2;
        mSort(arr, low, mid);
        mSort(arr, mid + 1, high);
        int endLow=mid;
        int startHigh=mid + 1;
        while((lo<=endLow) && (startHigh<=high))
        {
            if(arr[low]<arr[startHigh]) low++;
            else
            {
                int temp=arr[startHigh];
                for(int k=startHigh-1; k>=low; k--)
                    arr[k+1]=arr[k];
                arr[low]=temp;
                low++;
                endLow++;
                startHigh++;
            }
        }
    }
}

public class MergeSort
{
    public static void main(String args[])
    {
        new Merge().get();
    }
}