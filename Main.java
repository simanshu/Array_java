import java.util.*;
class Main{
    public static void all(int array[]) {
        
        // Use Arrays.fill to clear all elements in the array
        Arrays.fill(array, 0);
        
        // The elements in the 'array' are now all set to 0
        System.out.println("Array is empty: " + (array[0] == 0));
    }

    //delete array of last index
    public static void last(int[] arr) {
         
        int newArr[] = Arrays.copyOf(arr, arr.length-1);
 
        System.out.println("Original  : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(newArr));
    }

 //delete first element in  array
    public static int[] removeFirstElement(int[] arr) {
        int newArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }
 
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8};
         last(arr);
         
        int newArr[] = removeFirstElement(arr);
        
        System.out.println("Original  : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(newArr));
        all(arr);
    }
 
}
