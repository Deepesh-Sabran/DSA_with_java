package problems;

public class SubarraySumZero {
    public boolean sumZero(int[] arr) {
        for(int i=0; i<arr.length; i++) {       // O(n^2)
            int current_sum = 0;
            for(int j=i; j<arr.length; j++) {
                current_sum += arr[j];
                if(current_sum == 0)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4,-3,2,1};

        SubarraySumZero sazs = new SubarraySumZero();
        System.out.println(sazs.sumZero(arr));
    }
}
