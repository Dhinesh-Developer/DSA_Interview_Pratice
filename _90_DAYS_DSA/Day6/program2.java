package Day6;

public class program2 {
    public static void main(String[] args) {

        // print pyramid pattern using star
        int n= 5;
        printPyramid(n);
    }

    static void printPyramid(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
