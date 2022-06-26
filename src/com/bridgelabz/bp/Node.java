package com.bridgelabz.bp;

public class Node {
    String element;
    Node next;
    public Node(String element) {
        this.element = element;
        this.next = null;
        BP.size++;
    }

}
