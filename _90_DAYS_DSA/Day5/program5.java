package Day5;

public class program5 {
    public static void main(String[] args) {

        // print fibonacci series up to n terms
        int n = 10;
        printFibonacciSeries(n);
    }

    static void printFibonacciSeries(int n){
        int a = 0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }

    }
}
