package com.bridgelabz.stackandqueue;
import java.util.*;
public class StackAndQueue {
    List lists = new List();
    public void enQueue(Object data) {
        lists.addFirst(data);
    }
    public void deQueue() {
        lists.deleteFirst();
    }
    public void display() {
        lists.display();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue Data structure");
        StackAndQueue queue = new StackAndQueue();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        queue.display();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();
    }
}

