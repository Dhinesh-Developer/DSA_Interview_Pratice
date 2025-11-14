package TUF.Day7;
/* Pattern 3
1
12
123
1234
12345
* */
public class program3 {
    class Solution {
        public void pattern3(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
