package Day11;

public class program2 {
    public static void main(String[] args) {

        // Equilibrium index (left sum = right sum)
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 }; // 3 -> index
        int res  = equilibriumIndex(arr);
        System.out.println(res);
    }

    static int equilibriumIndex(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int x : arr){
            totalSum += x;
        }

        int leftSum = 0;
        for(int i=0;i<n;i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

}
