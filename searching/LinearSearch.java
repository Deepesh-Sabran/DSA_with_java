package searching;
import java.util.*;

public class LinearSearch {
    public int linear(int arr[], int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Target found at index : "+i);
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the terget element : ");
        int target = sc.nextInt();
        sc.close();

        LinearSearch ls = new LinearSearch();
        ls.linear(arr, target);
    }
}
