package problems;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,5,8,0};
        int[] temp = new int[arr.length]; // declaring an empty array of same size as original array

        System.out.print("Original array : \n");
        for(int i:arr) {
            System.out.print(i+" ");
        }

        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i]; // assigning non zero element to the temp array without distubing there occurance ...
                j++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println("\narray after movig zeros : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
}
