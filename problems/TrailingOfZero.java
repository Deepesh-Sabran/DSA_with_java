package problems;

public class TrailingOfZero {
    public long count(long n) {

        long fact = 1;
        for(long i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial is : "+fact);

        long counter = 0;
        for(long i=5; i<=n; i*=5) {
            counter=counter+n/i;
        }
        return counter;
    }
    public static void main(String[] args) {
        
        TrailingOfZero tz = new TrailingOfZero();

        System.out.println("\nNo of zeroes are : "+tz.count(10));
    }
}