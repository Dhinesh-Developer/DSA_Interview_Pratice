package Day5;

public class program8 {
    public static void main(String[] args) {

        // sum of first n odd number
        int n  =10;
        int res = sumOfFirstNOddNumber(n);
        System.out.println(res);
    }
    static int sumOfFirstNOddNumber(int n){
        int res = 0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                res += i;
            }
        }
        return res;
    }
}
