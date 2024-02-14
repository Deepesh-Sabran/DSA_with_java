package problems;

public class MaxSum {
    public static void main(String[] args) {
        // int[] arr = {3,-2,-1,4,5};
        int[] arr = {-3,1,-8,12,-4,5,-8,2};
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i=0; i<arr.length; i++) {
            current_sum = arr[i] + current_sum;
            if(current_sum > max_sum) {
            max_sum = current_sum;
            }
            if(current_sum < 0) {
                current_sum = 0;
            }
        }
        System.out.println(current_sum);
    }
}
