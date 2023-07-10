package com.bridgelabz.stackandqueue;
import java.util.*;
public class StackAndQueue {
    List lists = new List();
    public void push(Object data) {
        lists.peakLast(data);
    }
    public void display() {
        lists.display();
    }
    public static void main(String[] args) {
        System.out.println("welcome to stack program");
        StackAndQueue stack = new StackAndQueue();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.display();
    }
}

