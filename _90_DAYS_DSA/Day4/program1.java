package Day4;

// check if a number is prime or not

public class program1 {
    public static void main(String[] args) {

        int n = 5;
        boolean res = isPrime(n);
        System.out.println(res);
    }

    static boolean isPrime(int n){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return (cnt==2?true:false);
    }
}
