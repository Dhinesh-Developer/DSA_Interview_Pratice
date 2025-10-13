package Day6;

public class program1 {
    public static void main(String[] args) {

        // print multiplication table of N
        int n = 5;

        printTable(n);
    }

    static void printTable(int n){

        for(int i=1;i<=10;i++){
            System.out.println(i+"x"+n+"="+i*n);
        }
    }
}
