package com.yangyakun.javaTool.algorithm.linkedlist;

public class LinkedList<E> {

    Node<E> first;
    Node<E> last;
    int size;

    public LinkedList() {
    }

    public boolean add(E e){
        linkLast(e);
        return true;
    }

    private void linkLast(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(e,l,null);
        last = newNode;
        if(l==null){
            first = newNode;
        }else{
            l.next = newNode;
        }
        size++;

    }

    private static class Node<E>{
        E item;
        Node<E> pre;
        Node<E> next;

        public Node(E item, Node<E> pre, Node<E> next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
}
