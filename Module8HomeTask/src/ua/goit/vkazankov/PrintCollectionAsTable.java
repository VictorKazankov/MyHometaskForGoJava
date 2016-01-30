package ua.goit.vkazankov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintCollectionAsTable {
    public static void main(String[] args) {
        Integer[] intArray = {};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));
        int count = 0;
        int elementOfArray;
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter number of elements in list");
        count = scanner.nextInt();

        System.out.println("Please, add every element to list");

        for (int i = 0; i < count; i++) {
            System.out.println("Enter element: ");
            elementOfArray = scanner.nextInt();
            arrayList.add(elementOfArray);
        }


        for (Integer element:arrayList) {

            System.out.println("|" + " " + arrayList.indexOf(element) + " " + "|" + " " + element + " " + "|");

        }


    }
}
