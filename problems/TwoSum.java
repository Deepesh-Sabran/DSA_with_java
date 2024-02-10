package problems;

import java.util.Arrays;

public class TwoSum {
    public void twoSum(int[] arr, int sum) {
        Arrays.sort(arr); // method to sort array ... O(n log n)
        System.out.print("sorted array is : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }

        // with two pointer technique ... O(n)
        int l = 0, h = arr.length - 1; 
        while(l<h) {
            if(arr[l] + arr[h] == sum) {
                System.out.print("\nElements ara : "+arr[l]+" & "+arr[h]);
                break;
            } else {
                if(arr[l] + arr[h] > sum)
                    h--;
                else
                    l++; 
            }
        }

        // we need to add adjacent elements ... O(n^2)
        // for(int i=0; i<arr.length-1; i++) {
        //     for(int j=i+1; j<arr.length; j++) {
        //         if(arr[i] + arr[j] == sum) {
        //             System.out.print("\nElements ara : "+arr[i]+" & "+arr[j]);
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 9, 4};
        int sum = 11;

        TwoSum ts = new TwoSum();
        ts.twoSum(arr, sum);
    }
}
