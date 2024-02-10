package sorting;
import java.util.*;

public class SelectionSort {
    public void sort(int arr[], int n) {
        // printing unsorted array
        System.out.print("Unsorted array elements are : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }

        // sorting...
        for(int i=0; i<n-1; i++) {
            int min_index = i;
            for(int j = i+1; j<n; j++) {
                if(arr[min_index] > arr[j])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        // printing sorted array
        System.out.print("\nSorted array elements are : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        SelectionSort s = new SelectionSort();
        s.sort(arr, n);
    }
}