package Day6;

public class program6 {
    public static void main(String[] args) {

        // print numbers reverse from N to 1
        int n = 5;
        printReverse(n);
    }
    static void printReverse(int n){
        for(int j=n;j>=1;j--){
            System.out.print(j+" ");
        }
    }

}
