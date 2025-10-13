package Day6;

public class program7 {
    public static void main(String[] args) {

        // print square pattern of stars
        int n = 5;
        squarePattern(n);
    }
    static void squarePattern(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
