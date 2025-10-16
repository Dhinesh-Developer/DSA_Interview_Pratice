package Day10;

public class program1 {
    public static void main(String[] args) {

        // search in rotated sorted array
        int[] arr = {1,2,3,4,5,9,8,7,6};
        int target = 6;
        int index = searchElement(arr,target);
        System.out.println(index);
    }

    static int searchElement(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
