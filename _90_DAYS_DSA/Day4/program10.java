package Day4;

public class program10 {
    public static void main(String[] args) {

        // reverse a number
        int[] testCases = {123,9764,876,876873,763453,6751324,68517324,67871234,8651,1234,67234};
        for(int x : testCases){
            int reversedNumber = reverse(x);
            System.out.println(x+" reversed is "+reversedNumber);
        }
    }

    public static int reverse(int n){
        int res = 0;
        while(n > 0){
            int last = n%10;
            res = res*10+last;
            n = n/10;
        }
        return res;
    }
}
