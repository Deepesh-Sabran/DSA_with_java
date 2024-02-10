package sorting;
import java.util.*;

public class MergeSort {
	public static void conquer(int arr[], int low, int mid, int high) {
		// need to create a merged array where it's whole new memory space ...
		// indexing is always 0 based that's why we need to add 1
		int[] merged = new int[high - low + 1];

		// now we need to insert data of sub arrays into this merged array ...
		// for that we need to create indexs for tracking two different sub arrays
		int idx1 = low; // for left sub array
		int idx2 = mid+1; // for right sub array
		int x = 0; // for the merged array

		// now we start sorting among values
		while(idx1 <= mid && idx2 <= high) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		// let's say one sub array is sortd but other sub array need to be sort more so ...
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= high) {
			merged[x++] = arr[idx2++];
		}

		// now we need to copy elements from merged arr to original arr
		for(int i=0, j=low; i<merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	public static void divide(int arr[], int low, int high) {
		if(low >= high)
			return;
		
		// need to find the mid value
		int mid = low + (high - low)/2;
		divide(arr, low, mid); // for left sub array
		divide(arr, mid+1, high); // for right sub array

		// for merging ...
		conquer(arr, low, mid, high);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		divide(arr, 0, n-1);
		// now we are printing the sorted array
		System.out.print("sorted array is : ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}