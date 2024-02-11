package problems;

public class EquilibriumIndex {
    public void eqIndex(int[] arr) {
        int total_sum = 0;

        // find sum of all element in array
        for(int i:arr) {
            total_sum += i;
        }

        int lhs_sum = 0, flag = 0;
        for(int i=0; i<arr.length; i++) {
            total_sum -= arr[i];
            if(lhs_sum == total_sum) {
                System.out.println("\nEquilibrium index is : " + i);
                flag = 1;
                break;
            }
            lhs_sum += arr[i];
        }
        if(flag == 0) {
            System.out.println("\n"+ -1);
        }
    }

    public static void main(String[] args) {
        // int[] arr = {8,2,5,2,1};
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.print("Original array is : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }

        EquilibriumIndex ei = new EquilibriumIndex();
        ei.eqIndex(arr);
    }
}
