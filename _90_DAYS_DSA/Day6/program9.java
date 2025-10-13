package Day6;

public class program9 {
    public static void main(String[] args) {

        // print hollow triangle
        int n = 5;
        hollowTriangle(n);
    }

    static void hollowTriangle(int n){

        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(" ");
//            }

            // hollow traingle
            for(int j=1;j<=(2*i-1);j++){
                if(j==1 || j==(2*i-1) || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
