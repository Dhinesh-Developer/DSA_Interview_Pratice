package Day4;

public class program6 {
    public static void main(String[] args) {

        // find the LCM of a number
        // multiple test cases
        int[][] testCases = {
                {4,6},
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
            int lcm = findLcm(a,b);
            System.out.println(a+" "+b+" of LCM is "+lcm);
        }
    }

    static int findLcm(int a,int b){

        int gcd = findGCD(a,b);
        int lcm = a*b/gcd;
        return  lcm;
    }

    private static int findGCD(int a,int b){
        int gcd = 1;
        int minLength = a<b?a:b;
        for (int i=1;i<=minLength;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
