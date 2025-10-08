package Day4;

import java.util.ArrayList;
import java.util.List;

// print all prime numbers in a range
public class program2 {
    public static void main(String[] args) {

        int n = 10;
        List<Integer> res = primeInRange(n);
        System.out.println(res.toString());
    }

    private static List<Integer> primeInRange(int n){
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                li.add(i);
            }
        }
        return li;
    }

    static boolean isPrime(int n){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==2?true:false;
    }
}
