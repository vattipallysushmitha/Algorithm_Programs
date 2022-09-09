package com.bridzelab.BubbleSort;

/*
 * Purpose==>a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
 *           b. I/P -> read in the list ints
 *           c. O/P -> Print the Sorted List
 * @Author==>Sushmitha
 * @Since==>09-10-2022
 */

import java.util.Arrays;
class BubbleSort
{
    // method  bubblesort this is parameterized method
    static void bubbleSort(int array[])
    {
        int size = array.length;
        
        //  loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String args[])
    {
        System.out.println("**********************************************");
        System.out.println("Welcome to Algorithm Programs of BubbleSort");
        System.out.println("**********************************************");

        int[] data = { 99,8,-99,-1,45,-341,-76 };
        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(data));
        BubbleSort.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}