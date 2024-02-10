package sorting;
import java.util.*;

public class BubbleSort {
    public void sort(int arr[], int n) {
        boolean swap;

        // printing unsorted array 
        System.out.println("Unsorted array elements are : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<n-1; i++) {
            swap = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
                break;
        }

        // printing sorted array 
        System.out.println("\nSorted array elements are : ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of araay : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements of array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // calling sort function after creating object of class BubbleSort
        BubbleSort b = new BubbleSort();
        b.sort(arr, n);
    }
}
