package Day4;

public class program7 {


    public static void main(String[] args) {

        // check if the number is Armstrong number
        int[] testCases = {0, 1, 153, 370, 371, 407, 9474, 9475, 123, 8208};

        for(int x : testCases){
            boolean res = isArmStrongNumber(x);
            System.out.println(x+" is ArmStrong Number "+res);
        }
    }

    public static boolean isArmStrongNumber(int n){
        int original = n;
        int temp = n;

        int cnt =0 ;

        // count digits manually
        while(temp > 0){
            cnt++;
            temp = temp/10;
        }

        int sum = 0;
        temp = n;
        while(temp>0){
            int digit = temp%10;
            int power = 1;

            // compute digit^cnt manually
            for(int i=0;i<cnt;i++){
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }
        return sum == original;

    }
}
