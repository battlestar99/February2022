package samplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String[] str = {"me", "myself", "another", "me"};
		int[] arr = {1, 8, 4, 9, 3, 7};
		
		Arrays.sort(arr);
		  // Finding the length of array 'arr'
        int length = arr.length;
 
        // Sorting using a single loop
        for (int j = 0; j < length - 1; j++) {
 
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] < arr[j + 1]) {
 
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
 
                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
		
		System.out.println(Arrays.toString(arr));
		
	}

}
