package Day5;

public class program10 {
    public static void main(String[] args) {

        // check if a number is a perfect square
        int n = 10;
        boolean res = checkIfNumberIsPerfectNumber(n);
        System.out.println(res);
    }

    static boolean checkIfNumberIsPerfectNumber(int n){
        if(n <0 )return false;
        for(int i=1;i*i<=n;i++){
            if(i == n) return true;
        }
        return false;
    }

}
