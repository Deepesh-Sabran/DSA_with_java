package searching;
import java.util.*;

public class BinarySearch {
    public int binary(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target <= arr[mid]){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the target element : ");
        int target = sc.nextInt();
        sc.close();

        BinarySearch bs = new BinarySearch();
        System.out.print("Element found at index : "+bs.binary(arr, target));
        
    }
}
