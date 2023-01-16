package com.company;

public class BubbleSort extends Main{
    //Basic and not very good sorting algorithm.
    //O(n^2)
    //Bubble sort starts with very first two elements, comparing them to check which one is greater.
    //If the left value is greater, then they are swapped

    //If the given array is already sorted, O(n).

    //Dikkat edersen her saga kadırmada en buyuk sayiyi en saga atiyor.
    //Bu algoritmada her i + 1 yaptigimizda length - 1 de yapilirsa algoritma iyilestirilebilir.



    public void bubbleSort(int arr[])
    {

        for (int i = 0; i < arr.length - 1; i++)

            for (int j = 0; j < arr.length - i - 1; j++)

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }


    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    // Driver method to test above
    public static void bubbleSortTestDrive()
    {

        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8 };


        System.out.println("Given array:");
        ob.printArray(arr);

        //After bubble sort
        ob.bubbleSort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
    }


}
