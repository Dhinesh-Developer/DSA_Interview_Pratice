package Day5;

public class program1 {
    public static void main(String[] args) {
        // Find the nth power of a number without inbuilt function.
        int res1 = findNthPower(2,5);
        System.out.println("res1: "+res1);
    }

    static int findNthPower(int base,int exp){

       // return (int) Math.pow(base,exp);
        int res = 1;
        for(int i=1;i<=exp;i++){
            res = res * base;
        }
        return res;
    }
}
