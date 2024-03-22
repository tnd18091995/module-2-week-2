package Temp;

import javax.management.NotificationEmitter;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
        numNodes++;
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    public void add (int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index && temp.next != null ;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
    }
}
