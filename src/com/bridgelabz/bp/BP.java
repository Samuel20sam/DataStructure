package com.bridgelabz.bp;

public class BP<T> {
    private final T t;
    static int size;
    Node head;

    public BP(T t) {
        this.t = t;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        // System.out.println(head.element);
        deleteFirst();
    }

    private void deleteFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        size--;
    }

    public void peek() {
        if (isEmpty()) {
            return;
        }
        System.out.println(head.element);
    }

    public int getSize() {
        System.out.println();
        return size;
    }

    public boolean checkP() {
        String expression = (String) t;
        String[] s = expression.split("(?!^)");
        for (String element : s) {
            if (element.hashCode() == "(".hashCode()) {
                push(element);
            } else if (element.hashCode() == ")".hashCode()) {
                pop();
            }
        }
        return isEmpty();
    }
}
