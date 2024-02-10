package problems;

public class Occurance {
    public void freq(int[] arr) {
        int frq = 1;
        int i = 1;
        while(i<arr.length) {
            while(i<arr.length && arr[i] == arr[i-1]) {
                frq++;
                i++;
            }
            System.out.println("Elemnt : "+arr[i-1]+" | "+"Frequency : "+frq);
            frq = 1;
            i++;
        }
    }
    public static void main(String[] args) {
        // first you need a sorted array if the array is not sorted then you need to sort it first
        int[] arr = {20,20,30,30,30,40,50,50};

        Occurance oc = new Occurance();
        oc.freq(arr);
    }
}
