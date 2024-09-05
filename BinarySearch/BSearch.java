package Searching.BinarySearch;

public class BSearch {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int n = arr.length;
        int target = 46;
        int lo = 0, hi = n-1;
        boolean flag = false;
        while (lo<=hi) {
            int mid = (lo+hi)/2;
            if(arr[mid]== target){
                flag = true; break;
            }
            else if (arr[mid]>target) {
                hi =mid-1;
            }
            else lo = mid +1;
        }
        if(flag==true) System.out.println("Target Found");
        else System.out.println("Target Not found");
    }
}