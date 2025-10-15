package Day8;

public class program2 {
    public static void main(String[] args) {

        // convert celsius to fahrenheit
        double celsius = 37;
        double  res= fahrenheit(celsius);
        System.out.println(res);
    }

    static double fahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
}
