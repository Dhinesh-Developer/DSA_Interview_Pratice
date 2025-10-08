package Day4;
// check if a number is perfect number
public class program3 {
    public static void main(String[] args) {

        // multiple test cases to test the program
        int[] testNumbers = {6, 28, 12, 496, 0, 1, 8128, 27};

        for(int num : testNumbers){
            isPerfectNumber(num);
        }
    }

    static void isPerfectNumber(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if(sum==num && sum!=0){
            System.out.println(num+" is Perfect number");
        }else{
            System.out.println(num+" is not perfect number");
        }
    }
}
