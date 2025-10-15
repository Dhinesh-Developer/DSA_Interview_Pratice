package Day8;

public class program6 {
    public static void main(String[] args) {

        // swap two numbers without using third variable
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1+" "+n2);

        // swap
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println(n1+" "+n2);
    }
}
