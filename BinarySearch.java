import java.util.*;
import java.io.*;

public class BinarySearch {
    public static void main (String [] args) {
        // Take input using string builder
        
    }

    private boolean isAvailable (int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        int mid = (start+end)/2;

        while (start <= end){

            if(arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        
    }
}

// arr = [3]