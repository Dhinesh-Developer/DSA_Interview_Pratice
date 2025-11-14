package TUF.Day7;
/* Pattern 5

 *****
 ****
 ***
 **
 *
 *
* */
public class program5 {
    class Solution {
        public void pattern5(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
