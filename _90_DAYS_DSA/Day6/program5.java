package Day6;

public class program5 {
    public static void main(String[] args) {

        // print pascal's triangle upto n rows
        int n = 5;
        generatePascalTraingle(n);
    }

    static void generatePascalTraingle(int n){

        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/j+1; // formula to generate a next element
            }
            System.out.println();
        }
    }
}
