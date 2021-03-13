package com.dataStructures.lists;

 class DoubleLinkedList {


    DoubleLinkedList.Node head;
    DoubleLinkedList.Node tail;



    int length;

    class Node {

        int value;
        DoubleLinkedList.Node next ;
        DoubleLinkedList.Node previous ;

        Node(int value) {
            this.value = value;
            this.previous= new Node(0);
            this.next = new Node(0);

        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", previous=" + previous +
                    '}';
        }
    }

    DoubleLinkedList(int value) {
        this.head = new DoubleLinkedList.Node(value);

        this.tail = this.head;
        this.length = 1;
    }

    DoubleLinkedList insert(int index, int value) {



        if(index>this.length)
        {
            append(value);
        }
        else {
            DoubleLinkedList.Node node = new DoubleLinkedList.Node(value);

            DoubleLinkedList.Node iterator = this.head;

            for (int i = 0; i < index - 1; i++) {

                iterator = iterator.next;


            }

            DoubleLinkedList.Node temp = iterator;
            node.next = iterator.next;
            temp.next = node;
            this.length++;

        }
        return this;


    }


    DoubleLinkedList remove(int index) {

        if(index>this.length)
        {
            return this;
        }


        DoubleLinkedList.Node iterator = this.head;

        for (int i = 0; i < index-1; i++) {

            iterator = iterator.next;



        }
        // - - -
        iterator.next =iterator.next.next;
        return this;
    }


    DoubleLinkedList append(int value) {
        Node node = new Node(value);
        this.tail.next = node;
       node.previous=this.tail;

        this.tail = this.tail.next;

        length++;
        return this;

    }

    DoubleLinkedList prepend(int value) {
        DoubleLinkedList.Node newHead = new DoubleLinkedList.Node(value);
        newHead.next = this.head;
        this.head = newHead;
        length++;
        return this;

    }

     @Override
     public String toString() {
         return "DoubleLinkedList{" +
                 "head=" + head +
                 ", tail=" + tail +
                 ", length=" + length +
                 '}';
     }

     public static void main(String[] args) {
        DoubleLinkedList DoubleLinkedList = new DoubleLinkedList(1);
        System.out.println(DoubleLinkedList);
        System.out.println(DoubleLinkedList.append(3));
        System.out.println(DoubleLinkedList.append(4));
//		System.out.println(DoubleLinkedList.prepend(3));
//		System.out.println(DoubleLinkedList.prepend(4));
   //     System.out.println(DoubleLinkedList.insert(10, 2));
 //       System.out.println(DoubleLinkedList.remove(10));
    }


}
