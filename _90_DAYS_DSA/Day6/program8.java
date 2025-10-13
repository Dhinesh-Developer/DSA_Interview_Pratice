package Day6;

public class program8 {
    public static void main(String[] args) {

        // print hollow square pattern
        int n = 5;
        hollowSquare(n);
    }

    static void hollowSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
