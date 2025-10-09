package Day5;

public class program6 {
    public static void main(String[] args) {

        // print Nth fibonacci nunmber
        int n = 5;
        int res = findNthFibonacciNumber(n);
        System.out.println(res);
    }

    public static int findNthFibonacciNumber(int n){
        int a=0,b=1;
        if(n == 0) return a;
        if(n == 1) return b;
        int fibo = 0;
        for(int i=3;i<=n;i++){
            fibo = a+b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
}
