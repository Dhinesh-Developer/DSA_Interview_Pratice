
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class String4 {

    private static String stringCompresssion(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                sb.append(s.charAt(i - 1)).append(cnt);
                cnt = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(cnt);
        return sb.toString();

    }

    private static String removeAdjcanetDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (Character x : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == x) {
                st.pop();
            } else {
                st.push(x);
            }
        }

        String res = "";
        for (Character x : st) {
            res = res + x;
        }
        return res;
    }

    private static int myAtoi(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        int i = 0, n = s.length();
        long res = 0;
        int sign = 1;

        // skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (res * sign);
    }

    private static String IntegerToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();

    }

    private static int RomanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = map.get(s.charAt(i));
            if (cur < prev) {
                res -= cur;
            } else {
                res += cur;
            }
            prev = cur;
        }
        return res;
    }

    private static String convertToTitle(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num--;
            int last = num % 26;
            sb.append((char) (last + 'A'));
            num /= 26;
        }
        return sb.toString();
    }

    private static int titleToNumber(String s) {
        int res = 0;
        for (char x : s.toCharArray()) {
            res = res * 26 + (x - 'A' + 1);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //151. String compression (aaabb) -> (a3b2);
        String res1 = stringCompresssion("aaabb");
        System.out.println(res1);

        //152. Remove all adjacent duplicates
        String res2 = removeAdjcanetDuplicates("abbaca");
        System.out.println(res2);

        //153. convert string to a integer (ATOI)
        /*   System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));        // -42
        System.out.println(myAtoi("4193 with words"));// 4193
        System.out.println(myAtoi("words 987"));     // 0
        System.out.println(myAtoi("-91283472332"));  // -2147483648 (MIN_VALUE)
        System.out.println(myAtoi("91283472332"));   // 2147483647 (MAX_VALUE) */
        //154. Integer to roman / roman to integer
        System.out.println(IntegerToRoman(1994));
        System.out.println(RomanToInteger("MCMXCIV"));

        //155. Excel column title (A,B,....Z,AA,AB,)
        // Integer → Excel Column Title
        /* System.out.println(convertToTitle(1));   // A
        System.out.println(convertToTitle(26));  // Z
        System.out.println(convertToTitle(27));  // AA
        System.out.println(convertToTitle(28));  // AB
        System.out.println(convertToTitle(701)); // ZY
        System.out.println(convertToTitle(702)); // ZZ
        System.out.println(convertToTitle(703)); // AAA


        //Excel Column Title → Integer
        System.out.println(titleToNumber("A"));   // 1
        System.out.println(titleToNumber("Z"));   // 26
        System.out.println(titleToNumber("AA"));  // 27
        System.out.println(titleToNumber("AB"));  // 28
        System.out.println(titleToNumber("ZY"));  // 701
        System.out.println(titleToNumber("ZZ"));  // 702
        System.out.println(titleToNumber("AAA")); // 703 */
    }
}
