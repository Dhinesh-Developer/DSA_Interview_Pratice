
import java.util.*;

public class Advance1 {

    private static void rotate90(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] trans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }

    private static boolean search(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 5;

        // search in unsorted array
        /* for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false; */
        // search in sorted array
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

    }

    private static void setMatrixZeros(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void median() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {6, 7, 8, 9};
        int n = nums1.length;
        int m = nums2.length;

        int len = n + m;
        int[] merged = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i];
            } else {
                merged[k++] = nums2[j];
            }
        }

        while (i < n) {
            merged[k++] = nums1[i];
        }
        while (j < m) {
            merged[k++] = nums2[j];
        }
        if (n % 2 == 1) {
            System.out.println(merged[n / 2]);
        } else {
            System.out.println((merged[(n / 2) - 1] + merged[n / 2]) / 2.0);
        }

    }

    private static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(li.get(i - 1).get(j - 1) + li.get(i - 1).get(j));
                }
            }
            li.add(row);
        }

        return li;
    }

    private static int pascalTraingle1(int n) {
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(li.get(i - 1).get(j - 1) + li.get(i - 1).get(j));
                }
            }
            li.add(row);
        }

        int r = 4, c = 2;
        int val = li.get(r - 1).get(c - 1);
        return val;
    }

    private static List<Integer> pascalTraingle2(int n) {
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(li.get(i - 1).get(j - 1) + li.get(i - 1).get(j));
                }
            }
            li.add(row);
        }

        int r = 4;
        List<Integer> val = li.get(r - 1);
        return val;
    }

    private static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /* int m = in.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        } */

        //101. rotate matrix by 90 degree
        /* rotate90(matrix);
        printArray(matrix); */
        //102. Transpose a matrix
        /* int[][] res2 = transpose(matrix);
        printArray(res2); */
        //103. search in 2D matrix.
        /* boolean res3 = search(matrix);
        System.out.println(res3); */
        //104. set matrix zeros 3 3  1 2 3 4 0 6 7 8 9
        /* setMatrixZeros(matrix);
        printArray(matrix); */
        //105. median of two sorted array
        /* median(); */
        // 106. maximum sum rectangle in 2D matrix
        // Generate pascal traingle 
        List<List<Integer>> res = generatePascalTriangle(n);
        System.out.println(res);

        //107. pascal traingle 1.
        int res7 = pascalTraingle1(n);
        System.out.println(res7);

        //108. pascal traingle 2.
        List<Integer> res8 = pascalTraingle2(n);
        System.out.println(res8);

    }
}
/* 3 3
1 2 3 4 0 6 7 8 9 */
