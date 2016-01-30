package ua.goit.vkazankov;

import ua.goit.vkazankov.ClassForCollection.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class OrderListObject {
    public static void main(String[] args) {

        Queue<Flower> queue = new LinkedList<>();

        queue.add(new Astra("Astra"));
        queue.add(new Chamomile("Chamomile"));
        queue.add(new Rose("Rose"));
        queue.add(new Tulip("Tulip"));


        for (Flower c : queue) {
            System.out.println(c.toString());
        }

    }
}
