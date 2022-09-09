/*
 *Purpose==> a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
 *           b. I/P -> read in the list words
 *           c. Logic -> Use Insertion Sort to sort the words in the String array
 *           d. O/P -> Print the Sorted List
 *@Author==>Sushmitha
 *@Since==>09-10-2022
 */
package com.bridzelab.InsertionSort;

import java.util.Scanner;

public class InsertionSort
{
    // function to sort the array
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************");
        System.out.println("Welcome to Algorithm Programs of InsertionSort");
        System.out.println("**********************************************");


        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort obj = new InsertionSort();
        obj.sort(arr);
        printArray(arr);

    }

}