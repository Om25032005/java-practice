
package sorting;
import java.util.*;
public class sort
{
    public static void print(int n,int arr1[])
    {
        for(int i=0;i<n;i++)
            System.out.print(arr1[i]+" ");
    }





    public static void bubble(int n,int arr[])
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array using bubble sort :");
        print(n,arr);
    }





    public static void selection(int n, int arr[])
    {
        for(int i=0;i<n-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
        
            arr[smallest]=temp;
        }
        System.out.println("Sorted array using selection sort :");
        print(n,arr);
    }




    public static void insertion(int n,int arr[])
    {
        for(int i=1;i<n;i++)
        {
            int current =arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("sorted array using insertion sort :");
        print(n,arr);
    }



    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[20];
        
    System.out.print("enter no of elements :");
    int n=sc.nextInt();
    System.out.println("enter elements :");
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    bubble(n,arr);
    System.out.println();
    selection(n,arr);
    System.out.println();
    insertion(n,arr);
    }
}
