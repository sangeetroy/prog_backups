//this class will sort an array using Insertion Sort
import java.util.*;
class Insertion
{
    private int arr[];
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        arr=new int[sc.nextInt()];
        System.out.println("Enter " + arr.length + " elements: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element #" + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }
    }
    
    public void sort()
    {
        int n=arr.length;
        for(int i=1; i<n; i++)
        {
            int j=i;
            int ele=arr[i];
            while((j>0) && (arr[j-1]>ele))
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=ele;
        }
    }
    
    public void show()
    {
        System.out.print("| ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}

public class InsertionSort
{
    public static void main(String args[])
    {
        Insertion i=new Insertion();
        i.get();
        System.out.println("Original array: ");
        i.show();
        System.out.println("Sorted Array: ");
        i.sort();
        i.show();
    }
}
