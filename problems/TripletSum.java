package problems;
import java.util.*;

public class TripletSum {
    public void triple(int[] arr, int sum) {
        // for(int i=0; i<arr.length-2; i++) {              // O(n^3)
        //     for(int j=i+1; j<arr.length-1; j++) {
        //         for(int k=0; k<arr.length; k++) {
        //             if(arr[i]+arr[j]+arr[k] == sum) {
        //                 System.out.println("Elements are : "+ arr[i]+" "+arr[j]+" "+arr[k]);
        //             }
        //         }
        //     }
        // }

        // need to sort the array ...
        Arrays.sort(arr);
        System.out.print("Sorted array is : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        int flag = 0;
        for(int i=0; i<arr.length && flag==0; i++) {     //O(n^2)
            int l = i+1, h=arr.length-1;
            while(l<h) {
                if(arr[i]+arr[l]+arr[h] < sum) {
                    l++;
                } else if(arr[i]+arr[l]+arr[h] > sum) {
                    h--;
                } else {
                    System.out.print("\nElements are : "+arr[i]+" "+arr[l]+" "+arr[h]);
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0) {
            System.out.println("\nNo triplet found !!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,9,3,7};
        int sum = 18;

        TripletSum ts = new TripletSum();
        ts.triple(arr, sum);
    }
}
