package Day6;

public class program3 {
    public static void main(String[] args) {

        // print inverted pyramid
        int n = 5;
        revertPyramid(n);
    }
    static void revertPyramid(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
