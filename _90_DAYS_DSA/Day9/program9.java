package Day9;

public class program9 {
    public static void main(String[] args) {

        // count occurences of a number
        int target = 10;
        int[] arr = {1,1,10,10,10,1232,1232,32,532,10,12,32,10};
        int count = countOccurences(arr,target);
        System.out.println(count);
    }

    static int countOccurences(int[] arr,int target){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                cnt++;
            }
        }

        return cnt;
    }
}
