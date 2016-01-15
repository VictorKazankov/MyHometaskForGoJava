package ua.goit.vkazankov;

import java.util.Scanner;

public class SearchMinAndMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter elements of array");

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter: " + i +"th element");
            array[i] = scanner.nextInt();
        }

        int MinElement = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] < MinElement){
                MinElement = array[i];
            }
        }

        int MaxElement = array[0];

        for (int i = 1; i < array.length; i++){
            if(array[i] > MaxElement){
                MaxElement = array[i];
            }
        }

        System.out.println("Maximum element: " + MaxElement);
        System.out.println("Minimum element: " + MinElement);




    }
}
