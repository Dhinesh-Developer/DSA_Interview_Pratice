package Day8;

public class program5 {
    public static void main(String[] args) {

        // find the largest of three number
        int n1 = 10;
        int n2=20;
        int n3 = 30;

        int num1 = n1>n2?n1:n2;
        int num2 = n2>n3?n2:n3;

        int num = num1>num2?num1:num2;
        System.out.println(num);
    }
}
