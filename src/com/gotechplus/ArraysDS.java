package com.gotechplus;

import java.util.Random;
import java.util.Scanner;

public class ArraysDS {


    public static void swap(int i, int j) {
        int temp;
        temp = i; // swap the two elements
        i = j;
        j = temp;
    }

    public static void bubbleSort(int[] myArray) {
        int unsortedPartitionIndex = myArray.length - 1;
        while (unsortedPartitionIndex > 0) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    swap(myArray[i], myArray[i + 1]);
                }
            }
            unsortedPartitionIndex--;
        }
    }

    public static void selectionSort(int[] myArray) {
        int unsortedPartitionIndex = myArray.length - 1;

        while (unsortedPartitionIndex > 0) {
            int largest = 0;
            for (int i = 1; i <= unsortedPartitionIndex; i++) {
                if (myArray[i] > myArray[largest]) {
                    largest = i;
                }
            }
            swap(unsortedPartitionIndex, largest);
            unsortedPartitionIndex--;
        }
    }

    public static void insertionSort(int[] myArray) {
        int temp;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) {
            temp = myArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && temp < myArray[i - 1]; i--) {
                myArray[i] = myArray[i - 1];
            }
            myArray[i] = temp;
        }
    }

    //my implementation of insertion sort algorithm.
    public static void myInsertionSort(int[] myArray2) {
        int sortedPartIndex = 0;
        int unsortedPartIndex = 1;
        int temp;
        while (unsortedPartIndex < myArray2.length) {
            temp = myArray2[unsortedPartIndex];
            for (int i = sortedPartIndex; i >= 0; i--) {
                if (temp >= myArray2[i]) {
                    myArray2[i + 1] = temp;
                    break;
                } else {
                    myArray2[i + 1] = myArray2[i];
                }
                if (i == 0) {
                    myArray2[0] = temp;
                }
            }
            sortedPartIndex++;
            unsortedPartIndex++;
        }
    }


    public static void shellInsertionSort(int[] myArray) {      // ⟲
        int gap = myArray.length / 2;
        while (gap >= 1) {
            int temp;
            for (int firstUnsortedIndex = gap; firstUnsortedIndex < myArray.length && firstUnsortedIndex + gap >= 0; firstUnsortedIndex += gap) {
                temp = myArray[firstUnsortedIndex];
                int i;
                for (i = firstUnsortedIndex; i > 0 && temp < myArray[i - gap]; i -= gap) {
                    myArray[i] = myArray[i - gap];
                    if (i - gap < 0) {
                        break;
                    }
                }
                myArray[i] = temp;
            }
            System.out.println("the gap value is: " + gap);
            gap /= 2;
        }
        System.out.println(gap);
    }

    // the king of implementing algorithms
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}


