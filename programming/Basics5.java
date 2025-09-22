import java.util.Scanner;

public class Basics5 {

    private static void checkLeapYear(int n){
        if(n%400==0 && (n%4==0 || n%100!=0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }
    }

    private static void celsicusToFahrenheit(double n){
        double fahrenheit = (n*9/5)+32;
        System.out.println("Fahrenheit: "+fahrenheit);
    }

    private static void fahrenheitToCelsius(double n){
        double celsius = (n-32)*5/9;
        System.out.println("Celsius: "+celsius);
    }

    private static void check(char c){
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("is Vowel: "+c);
        }else{
            System.out.println("is consonant: "+c);
        }
    }

    private static void findLargest(int a,int b,int c){
        int x = a>b?a:b;
        int y = b>c?b:c;
        int z = x>y?x:y;
        System.out.println("Largest: "+z);
    }

    private static void swapTwoNumbers(int a,int b){
        // a = a+b;
        // b = a-b;
        // a = a-b;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapped: "+a+" "+b);
    }

    private static void calculateSumOfDigits(int n){
        int dup = n;
        int sum = 0;
        while(n > 0){
            int last = n%10;
            sum+=last;
            n = n/10;
        }
        System.out.println("sum of all digits: "+sum);
    }

    private static void checkIsPalindrome(String s){
        String dup = s;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reversed: "+rev.equals(s));
    }

    private static void countNumberOfDigits(int n){
        int cnt =0 ;
        while(n > 0){
            cnt++;
            n/=10;
        }
        System.out.println("Count number of digits: "+cnt);
    }

    private static void printAsciiValue(char c){
        System.out.println((int)c);
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //41.check if the year is leap year.
        checkLeapYear(n);

        //42. convert celsius to fahernheit
        celsicusToFahrenheit(37);

        //43. convert to fahrenheit to celsius
        fahrenheitToCelsius(98.6);

        //44. check if the character is vowel or consonant
        check('a');

        //45. Find the largest of three numbers
        findLargest(10,20,30);

        //46. swap two variable without using a thrid variable.
        swapTwoNumbers(10,20);

        //47. calculate the sum of digits until single digit
        calculateSumOfDigits(12345);

        //48. check if a string is palindrome
        checkIsPalindrome("markram");

        //49. count number of digits in a number
        countNumberOfDigits(12345);

        //50.print ASCII value of a character
        printAsciiValue('a'); 
    }
    
}
