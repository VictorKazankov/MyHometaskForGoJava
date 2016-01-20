package ua.goit.vkazankov;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter elements of array");
        // Enter number to array by user
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter: " + i + "th element");
            array[i] = scanner.nextInt();
        }

        // Make sorting of number in array
        int key = 0;
        int j = 0;
        for(int i = 0; i < array.length; i++){
            key = array[i];
            for (j = i - 1; j >= 0 && array[j] > key; j-- ){
                array[j + 1] = array[j];
            }
            array[j+1] = key;
        }

        // Print number to screen
        for (int element:array) {
            System.out.println(element);
        }
    }
}
