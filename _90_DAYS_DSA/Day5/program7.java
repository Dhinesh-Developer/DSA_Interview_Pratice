package Day5;

public class program7 {
    public static void main(String[] args) {
        // sum of first N natural numbers
        int n = 10;
        int res = findSumOfNthNaturalNumber(n);
        System.out.println(res);
    }

    static int findSumOfNthNaturalNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
