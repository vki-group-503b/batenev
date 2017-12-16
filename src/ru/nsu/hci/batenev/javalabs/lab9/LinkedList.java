package ru.nsu.hci.batenev.javalabs.lab9;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>{
    private Node<E> firstElement;
    private Node<E> lastElement;
    private int size;

    public LinkedList() {
        lastElement = new Node<>(firstElement, null, null);
        firstElement = new Node<>(null, null, lastElement);
        size = 0;
    }

    public void addFirst(E e) {
        Node<E> node = firstElement;
        node.setCurrentElement(e);
        firstElement = new Node<>(null, null, node);
        node.setPreviousElement(firstElement);
        size++;
    }

    public void addLast(E e) {
        Node<E> node = lastElement;
        node.setCurrentElement(e);
        lastElement = new Node<>(node, null, null);
        node.setNextElement(lastElement);
        size++;
    }

    public void removeFirst() {
        Node<E> node = firstElement;
        firstElement = node.getNextElement();
        size--;
    }

    public void removeLast() {
        Node<E> node = lastElement;
        lastElement = node.getPreviousElement();
        size--;
    }

    public int getSize() {
        return size;
    }

    public E getElement(int index) {
        Node<E> node = firstElement.getNextElement();
        for (int i = 0; i < index; i++) {
            node = node.getNextElement();
        }
        return node.getCurrentElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElement(counter++);
            }
        };
    }
}