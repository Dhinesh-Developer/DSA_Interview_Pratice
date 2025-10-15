package Day8;

public class program7 {
    public static void main(String[] args) {

        // calculate sum of digits until single digit
        int n = 12345;

        int sum = extractSum(n);
        System.out.println(sum);
    }

    static int extractSum(int n){
        int dup = n;
        int sum = 0;
        while(n>0){
            int last = n%10;
            sum += last;
            n = n/10;
        }

        return sum;
    }
}
