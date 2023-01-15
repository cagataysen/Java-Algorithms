package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Trying to write down hello world and push this to gitHub by intellij");


        //Driver to Test the Binary Search:
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}


