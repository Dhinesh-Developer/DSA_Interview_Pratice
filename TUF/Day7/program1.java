package TUF.Day7;
/* Pattern 1
 *****
 *****
 *****
 *****
 *****
* */
public class program1 {
    class Solution {
        public void pattern1(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
