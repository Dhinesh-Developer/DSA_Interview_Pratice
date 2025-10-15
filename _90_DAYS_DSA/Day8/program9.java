package Day8;

public class program9 {
    public static void main(String[] args) {

        // count the number of digits in a number
        int n = 12345;

        int res = countDigits(n);
        System.out.println(res);
    }

    static int countDigits(int n){
        int cnt = 0;
        while(n > 0){
            cnt++;
            n = n/10;
        }
        return cnt;
    }
}
