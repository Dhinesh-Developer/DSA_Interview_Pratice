package Day1;

/*
🧩 Problem 4: Search in a String Array
Statement:
Given an array of strings, check if a target string exists.

input:
n = 5
arr = ["apple", "banana", "grape", "mango", "orange"]
key = "mango"

output:
String found at index 3

* */
public class program4 {
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "grape", "mango", "orange"};
        String key = "mango";
        int res = searchKeyInString(arr,key);
        System.out.println("String element found at index: "+res);
    }

    public static int searchKeyInString(String[] arr,String key){

        // case 1: what if the arr is empty or null;
        if(arr.length == 0 || arr == null){
            return -1;
        }

        // case 2: what if the key is in uppercase
        key = key.toLowerCase();


        // case 3: what if the array contains the duplicates
        // in that case we need to return the first occurenced index

        //case 3: search in the array contains the element
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }

        // case 4: if the search key is not present in the array
        return -1;

    }
}
