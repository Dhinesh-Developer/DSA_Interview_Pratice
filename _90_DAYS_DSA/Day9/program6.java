package Day9;

public class program6 {
    public static void main(String[] args) {

        // linear search in unsorted array
        int[] arr = {1,5,4,23,4,3,2,6,7};
        int target = 23;
        int index = findSearchElement(arr,target);
        System.out.println(index);
    }

    static int findSearchElement(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
