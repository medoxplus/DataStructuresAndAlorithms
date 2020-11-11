package com.gotechplus;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int[] myArray = new int[7];
    private static int[] myArray2 = new int[7];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        fillMyArray(myArray);
        printMyArray(myArray);
        ArraysDS.shellInsertionSort(myArray);
        printMyArray(myArray);
    }
    public static void printMyArray(int[] myArray) {
        System.out.println("myArray");
        for (int k : myArray) {
            System.out.print("  " + k);
        }
//        System.out.println("\n myArray2; ");
//        for (int j : myArray2) {
//            System.out.print("  " + j);
//        }
        System.out.println("");
    }




    public static void fillMyArray(int[] myArray) {
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print("Enter an Integer: ");
//            myArray[i] = scan.nextInt();
//            scan.nextLine();
//        }
        Random random = new Random();
        for (int i = 0; myArray.length > i; i++) {
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
}
