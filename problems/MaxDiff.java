package problems;

public class MaxDiff {
    public void difference(int[] arr) { // O(n)
        int max_dif, min_val;
        max_dif = arr[1] - arr[0];
        min_val = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] - min_val > max_dif) {
                max_dif = arr[i] - min_val;
            }
            if(arr[i] < min_val) {
                min_val = arr[i];
            }
        }
        System.out.println("Maximum difference is : "+max_dif);
    }

    public static void main(String[] args) {
        int[] arr = {7,1,3,100,8,4,10};
        MaxDiff md = new MaxDiff();
        md.difference(arr);
    }
}
