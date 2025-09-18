import java.util.Scanner;

class Basics{

    private static boolean CheckPrime(int n){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt == 2) return true;
        else return false;
    }

    private static void printPrimeInRange(int n){
        System.out.print("Prime numbers in range: ");
        for(int i=1;i<=n;i++){
            boolean res = CheckPrime(i);
            if(res) System.out.print(i+" ");
        }
        System.out.println();
    }

        
    private static boolean checkPerfectNumber(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum +=i;
            }
        }
        return (sum==n);
    }

    private static int findFactorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    private static int findGCD(int n1,int n2){
        int n = Math.min(n1,n2);
        int gcd = 0;
        for(int i=1;i<=n;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    private static int findLCM(int n1,int n2){
        int gcd = findGCD(n1, n2);
        int lcm = (n1*n2)/gcd;
        return lcm;
    }

    private static boolean checkArmstrongNumber(int n){
        int dup = n;
        int len = 0;
        while(n > 0){
            len++;
            n = n/10;
        }

        int sum = 0;
        int num = dup;
        while(dup > 0){
            int last = dup%10;
            sum += Math.pow(last,len);
            n /= 10;
        }

        return sum==num;
    }


    private static boolean checkPalindrome(int n){
        int dup = n;
        int rev = 0;
        while(n > 0){
            int last = n%10;
            rev = rev*10+last;
            n = n/10;
        }
        return dup==rev;
    }

    private static int extractDigits(int n){
        int dup = n;
        int sum = 0;
        while(n > 0){
            int last = n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }

    private static int reverse(int n){
        int dup = n;
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = rev*10+last;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //1. check whether the number is prime or not
        boolean res = CheckPrime(n);
        System.out.println("Prime Number is : "+res);

        //2.print all prime number in range
        printPrimeInRange(n);

        //3.check if a number is perfect number or not
        boolean res1 = checkPerfectNumber(n);
        System.out.println("Is Perfect Number: "+res1);

        // 4. Find factorial of a number
        int res2 = findFactorial(n);
        System.out.println("Factorail of a Number: "+res2);

        //5. Find GCD of two number
        int res4 = findGCD(54,24);
        System.out.println("GCD of two number is: "+res4);

        //6. Find lcm of two number
        int res5 = findLCM(12,15);
        System.out.println("LCM of two number: "+res5);

        //7. check if a number is armstrong number
        // boolean res6 = checkArmstrongNumber(n);
        // System.out.println("is Armstrong number: "+res6);

        //8. check if the number is palindrome
        boolean res7 = checkPalindrome(121);
        System.out.println("is palindrome Number: "+res7);

        //9. calculate the sum of digits of a number
        int res8  = extractDigits(987);
        System.out.println("Sum of digits: "+res8);

        //10. Reverse a number.
        int res9 = reverse(3369);
        System.out.println("Reverse a number: "+res9);

    }
}