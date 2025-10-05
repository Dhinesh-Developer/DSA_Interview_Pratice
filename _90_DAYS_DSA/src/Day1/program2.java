package Day1;

//Given an array, count how many times a particular element appears.
/*
input:
n = 6
arr = [4, 2, 4, 4, 3, 1]
key = 4

output:
Element occurs 3 times

* */
public class program2 {
    public static void main(String[] args) {
        int[] arr = {4,2,4,4,3,1};
        int key = 4;

        int res = countElement(arr,key);
        System.out.println("element occures at : "+res);
    }

    public static int countElement(int[] arr,int key){

        // case 1: if the arr is empty
        if(arr.length == 0){
            return -1;
        }

        // case 2: count the number if key is present in the array
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                cnt++;
            }
        }

        return cnt;


    }
}
