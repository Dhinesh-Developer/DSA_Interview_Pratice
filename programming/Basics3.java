import java.util.Scanner;

public class Basics3 {

    private static void multiplicationTable(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i+"x"+n+"="+(i*n));
        }
    }

    private static void pyramidPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void invertedPyramid(int n){
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

    private static void rightAngleTraingle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void diamondPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void reverse(int n){
        System.out.println("Reverse a number: ");
        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void pascalTraingle(int n){
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            int num = 1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    private static void squarePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void hollowSquarePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void hollowTrainglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==n ||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //21.print mulitplication table of n
        //multiplicationTable(n);

        //22. print pyramid pattern using stars
        //pyramidPattern(n);

        //23. print inverted pyramid
        invertedPyramid(n);


        //24. print right angled triangle
        rightAngleTraingle(n);

        //25. print diamond pattern
        diamondPattern(n);

        //26. print pascal's triangle up to n terms
        pascalTraingle(n);

        //27. print number from reverse n to 1
        reverse(n);

        //28. print square patter of stars.
        squarePattern(n);

        //29. print hollow square pattern.
        hollowSquarePattern(n);

        //30. print hollow triangle pattern
        hollowTrainglePattern(n);

    }
}
