package Day8;

public class program8 {
    public static void main(String[] args) {

        // check if the String is palindrome
        String s = "racecar";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
    static boolean isPalindrome(String s){
        int left = 0,right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
