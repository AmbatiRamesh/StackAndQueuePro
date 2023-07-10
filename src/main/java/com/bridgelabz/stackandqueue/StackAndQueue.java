package com.bridgelabz.stackandqueue;
import java.util.*;
public class StackAndQueue {
    List lists = new List();
    public void enQueue(Object data) {
        lists.addFirst(data);
    }
    public void display() {
        lists.display();
    }
    public static void main(String[] args) {
        System.out.println("welcome to Queue program");
        StackAndQueue queue = new StackAndQueue();
        queue.enQueue(70);
        queue.enQueue(30);
        queue.enQueue(56);
        queue.display();
    }
}

