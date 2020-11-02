package com.gotechplus;

import java.util.Random;
import java.util.Scanner;

public class ArraysDS {


    private int[] myArray = new int[7];
    private int[] myArray2 = new int[7];
    Scanner scan = new Scanner(System.in);

    public void fillMyArray() {
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print("Enter an Integer: ");
//            myArray[i] = scan.nextInt();
//            scan.nextLine();
//        }
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            int n = (int) (random.nextFloat() * 100);
            myArray[i] = n;
            myArray2[i] = n;
        }
//        myArray[0] = 20;
//        myArray[1] = 35;
//        myArray[2] = -15;
//        myArray[3] = 7;
//        myArray[4] = 55;
//        myArray[5] = 1;
//        myArray[6] = -22;
        scan.close();
    }

    public void printMyArray() {
        System.out.println("myArray 1");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("  " + myArray[i]);
        }
        System.out.println("\n myArray2; ");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print("  " + myArray2[i]);
        }
        System.out.println("");
    }

    public void swap(int i, int j) {
        int temp;
        temp = myArray[i]; // swap the two elements
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    public void bubbleSort() {
        int unsortedPartitionIndex = myArray.length - 1;
        while (unsortedPartitionIndex > 0) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    swap(i, i + 1);
                }
            }
            unsortedPartitionIndex--;
        }
    }

    public void selectionSort() {
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

    public void insertionSort() {
        int temp = -1;
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
    public void myInsertionSort() {
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


    public void myShellInsertionSort(){

    }

}