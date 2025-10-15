package Day8;

public class program3 {
    public static void main(String[] args) {

        // convert fahrenheit to celsius
        double fahrenheit = 98.6;
        double res = convert(fahrenheit);
        System.out.println(res);
    }

    static double convert(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
