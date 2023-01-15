package com.company;

public class BinarySearch extends Main {
    //Divide and conquer
    // O(log n)
    //Array must be sorted to be able to apply this algorithm

    //Find the mid index
    //If the index that you are looking for is equal to middle index, return the code.
    //If its not equal to middle index check the bigger values and vice versa.
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
}
