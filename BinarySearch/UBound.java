package Searching.BinarySearch;

public class UBound {
    public static void main(String[] args) {
    int arr[] = {10,23,35,45,67,67,77,89,94,147,167};
        int n = arr.length;
        int target = 68;
        int lb = n;
        int lo =0, hi = n-1;
        while (lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>target){
                lb = Math.min(lb, mid);
                hi = mid -1;
            }
            else lo = mid +1;
        }
        System.out.println(lb);
    }
}
