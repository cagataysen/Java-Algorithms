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
    public int binarySearch(int nums[], int target)
    {
        // Set the left and right boundaries
        int left = 0, right = nums.length - 1;

        // Under this condition
        while (left <= right) {
            // Get the middle index and the middle value.
            int mid = left + (right - left) / 2;

            // Case 1, return the middle index.
            if (nums[mid] == target) {
                return mid;
            }
            // Case 2, discard the smaller half.
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Case 3, discard the larger half.
            else {
                right = mid - 1;
            }
        }

        // If we finish the search without finding target, return -1.
        return -1;
    }

    public static void BinarySearchTestDrive(){
        //Driver to Test the Binary Search:
        BinarySearch ob = new BinarySearch();
        int nums[] = { 2, 3, 4, 10, 40 };
        int n = nums.length;
        int x = 10;
        int result = ob.binarySearch(nums, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
