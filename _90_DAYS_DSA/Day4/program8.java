package Day4;

public class program8 {
    public static void main(String[] args) {

        // check if a number is palindrome
        int[] testCases = {12,43,123,634,123123,123321,121,777};

        // finding the number is palindrome for each testcase
        for(int x : testCases){
            boolean res = isPalindrome(x);
            System.out.println(x+" is Palindrome "+res);
        }
    }

    public static boolean isPalindrome(int n){
        int dup = n;
        int valid = 0;
        while(n > 0){
            int last = n%10;
            valid = valid*10+last;
            n/=10;
        }
        return dup==valid;
    }
}
