package com.keyin;

import java.util.LinkedList;


public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked List створення початкового вузла зв'язаного списку
    public Node createLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insert into a linked list
    //0. If link list doesn't
    //1. inserting at the begining
    //2. Inserting at the ending
    //3. Insert anywhere

    // create new node / новий вузол
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) { // якщо список порожній
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) { // вставка в початок списку
            node.next = head;
            head = node;
        } else if (location >= size) { // вставка в кінець
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) { // вставка посередині списку
                tempNode = tempNode.next;
                index++;
            }
//            Node nextNode = node;    old version
//            node.next = nextNode;    old version

            node.next = tempNode.next; // new version
            tempNode.next = node;      // new version
        }
        size++;
    }

    //Traverse a Linked List / виведення списку на екран
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //Search for a Node

    public boolean searchNode (int nodeValue ){
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }



    // Deleting a node from a single linked list

    public void deleteFromLinkedList(int location) {
        if (head == null) { // if the list is empty
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) { // delete the first node
            head = head.next;
            size--;
            if (size == 0) { // if the list becomes empty after deletion
                tail = null;
            }
        } else if (location >= size - 1) { // delete the last node
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // if there is only one node
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // delete a node in the middle
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}

