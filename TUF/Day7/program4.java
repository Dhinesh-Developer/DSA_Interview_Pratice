package TUF.Day7;
/* pattern 4
1
22
333
4444
55555
* */
public class program4 {
    class Solution {
        public void pattern4(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }

    }
}
