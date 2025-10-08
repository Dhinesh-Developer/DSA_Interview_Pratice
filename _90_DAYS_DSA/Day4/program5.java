package Day4;

public class program5 {
    public static void main(String[] args) {

        // find the GCD of a number
        // multiple test cases
        int[][] testCases = {
                {12, 18},
                {5, 15},
                {7, 13},
                {8, 20},
                {42, 56},
                {100, 80},
                {81, 153},
                {270, 192},
                {1, 9},
                {17, 0}
        };

        for(int[] x : testCases){
            int a = x[0];
            int b = x[1];
            int gcd = findGCD(a,b);
            System.out.println(a+" "+b+" GCD is "+gcd);
        }
    }

    static int findGCD(int a,int b){
        int min = (a<b)?a:b;
        int gcd = 1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
