package sorting;
import java.util.*;

public class InsertionSort {

    public void sort(int arr[], int n) {
        // printing unsorted array 
        System.out.print("Unsorted array : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }

        //sorting...
        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        // printing sorted array 
        System.out.print("\nSorted array : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the element of array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        InsertionSort ins = new InsertionSort();
        ins.sort(arr, n);
    }
}
