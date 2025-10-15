package Day8;

public class program1 {
    public static void main(String[] args) {

        // check if the year is leap year or not
        int n = 2000;
        boolean res = isLeapYear(n);
        System.out.println(res);
    }

    static boolean isLeapYear(int n){
        if(n%400==0 &&(n%4==0 || n%100!=0)){
            return true;
        }
        return false;
    }

}
