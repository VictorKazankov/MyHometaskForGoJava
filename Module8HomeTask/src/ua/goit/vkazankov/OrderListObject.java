package ua.goit.vkazankov;

import ua.goit.vkazankov.ClassForCollection.*;

import java.util.*;


public class OrderListObject {
    public static void main(String[] args) {

        Set<Flower> sortSet = new TreeSet<Flower>(new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        sortSet.add(new Chamomile("Astra"));
        sortSet.add(new Astra("Chamomile"));
        sortSet.add(new Tulip("Rose"));
        sortSet.add(new Rose("Tulip"));


        for (Flower c : sortSet) {
            System.out.println(c);
        }

    }
}
