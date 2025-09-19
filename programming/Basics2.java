import java.util.Scanner;

class Basics2{

    private static int findNthPower(int base,int exp){
        //Math.pow(base,exp);
        int res = 1;
        for(int i=1;i<=exp;i++){
            res = res * base;
        }
        return res;
    }

    private static void findFirstNnaturalNumber(int n){
        System.out.print("First N natural Number: ");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void findFirstNOddNumber(int n){
        System.out.print("First N odd Number: ");
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    private static void findFirstNEvenNumber(int n){
        System.out.print("First N Even number: ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    private static void printFibonnaciSeries(int n){
        int a = 0,b = 1;
        System.out.print("First n fibonacci series: ");       
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    private static int findNthFibonacciNumber(int n){
        int a =0 , b = 1;
        if(n == 1) return a;
        if(n == 2) return b;
        int fibo = 0;
        for(int i=3;i<=n;i++){
            fibo = a+b;
            a = b;
            b = fibo;
        }
        return fibo;
    }

    private static void sumOfFirstNNaturalNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of first N natural Number: "+sum);
    }

    private static void sumOfFirstNOddNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum += i;
            }
        }
        System.out.println("Sum of first n odd number: "+sum);
    }

    private static void sumOfFirstNEvenNumber(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("Sum of first n even number: "+sum);
    }

    private static boolean checkPerfectNumber(int num){
        if(num < 0) return false;
        for(int i=1;i*i<=num;i++){
            if(i*i == num )return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();

        //11. Find the nth power of a number without inbuilt function.
        int res1 = findNthPower(a,n);
        System.out.println("res1: "+res1);

        //12. Find first n natural number
        findFirstNnaturalNumber(n);

        //13. print first n odd number
        findFirstNOddNumber(n);

        //14. print first n even number
        findFirstNEvenNumber(n);

        //15. print fibonacci series upto n tersm
        printFibonnaciSeries(n);

        //16. find nth fibonacci number.
        int res2 = findNthFibonacciNumber(n);
        System.out.println("Nth fibonacci Number: "+res2);

        //17. sum of first n natural number
        sumOfFirstNNaturalNumber(n);

        //18. sum of first n odd number
        sumOfFirstNOddNumber(n);

        //19. sum of first n even number
        sumOfFirstNEvenNumber(n);

        //20. check if the number is perfect number or not-> input:  25
        boolean res3 = checkPerfectNumber(n); 
        System.out.println("check the n is perfect Number: "+res3);
    }
}
