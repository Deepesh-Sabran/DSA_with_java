package problems;

import java.util.*;

class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,5};
        Arrays.sort(arr);
        //print array elements
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        //finding duplicates
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                System.out.println("\nDuplicate element: " + arr[i]);
                System.out.println(true);
            }
        }
    }
}