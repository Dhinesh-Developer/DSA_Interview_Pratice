package Day4;

public class program9 {
    public static void main(String[] args) {

        // calculate the sum of digits in a number
        int[] testCase = {1232,123,123123,5673453,12341324,152345,1234324,76867,45678,246457,356546754};

        for(int x : testCase){
            int sum = findSum(x);
            System.out.println(x+" sum of digits in a number is: "+sum);
        }
    }
    static int findSum(int n){

        int sum = 0;
        while (n>0){
            int last = n%10;
            sum += last;
            n = n/10;
        }
        return sum;
    }
}
