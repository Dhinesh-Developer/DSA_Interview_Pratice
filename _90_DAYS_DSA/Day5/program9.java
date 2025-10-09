package Day5;

public class program9 {
    public static void main(String[] args) {

        // sum of first N even number
        int n = 10;
        int res = sumOfFirstNEvenNumber(n);
        System.out.println(res);
    }
    static int sumOfFirstNEvenNumber(int n){
        int res = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                res += i;
            }
        }
        return res;
    }
}
