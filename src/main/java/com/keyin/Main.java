package com.keyin;



import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);

        singleLinkedList.insertInLinkedList(5, 1); // insert in the middle
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(3);
        singleLinkedList.searchNode(2);


        //  delete from the beginning
        singleLinkedList.deleteFromLinkedList(0);
        System.out.println("After deleting from the beginning:");
        singleLinkedList.traverseLinkedList();

        //  delete from the end
        singleLinkedList.deleteFromLinkedList(singleLinkedList.size - 1);
        System.out.println("After deleting from the end:");
        singleLinkedList.traverseLinkedList();

        // delete from the middle
        singleLinkedList.insertInLinkedList(4, 2); // Re-inserting to test middle deletion
        singleLinkedList.traverseLinkedList();
        singleLinkedList.deleteFromLinkedList(1);
        System.out.println("After deleting from the middle:");
        singleLinkedList.traverseLinkedList();


    }}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.