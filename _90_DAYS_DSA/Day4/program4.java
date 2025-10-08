package Day4;

public class program4 {
    public static void main(String[] args) {

        // find the factorial of a number
        int[] testCases = {5,6,7,8,9,10};
        for(int n : testCases){
            int res = findFactorial(n);
            System.out.println(n+" for factorial is "+res);
        }
    }

    static int findFactorial(int n){

        int res =1;
        for(int i=1;i<=n;i++){
            res *=i;
        }
        return res;
    }
}
