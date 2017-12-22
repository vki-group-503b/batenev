package ru.nsu.hci.batenev.javalabs.lab9;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private Node<E> firstElement;
    private Node<E> lastElement;
    private int size;

    public LinkedList() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    public void addFirst(E e) {
        if (firstElement == null) {
            Node<E> node = new Node<>(null, e, null);
            firstElement = node;
            lastElement = node;
        } else {
            Node<E> node = firstElement;
            firstElement = new Node<>(null, e, node);
            node.setPreviousElement(firstElement);
        }
        size++;
    }

    public void addLast(E e) {
        if (lastElement == null) {
            Node<E> node = new Node<>(null, e, null);
            lastElement = node;
            firstElement = node;
        } else {
            Node<E> node = lastElement;
            lastElement = new Node<>(node, e, null);
            node.setNextElement(lastElement);
        }
        size++;
    }

    public void removeFirst() {
        if (size > 0) {
            switch (size) {
                case 1:
                    firstElement = null;
                    lastElement = null;
                    size--;
                    break;
                case 2:
                    Node<E> replaceNode = new Node<>(null, firstElement.getNextElement().getCurrentElement(), null);
                    firstElement = replaceNode;
                    lastElement = replaceNode;
                    size--;
                    break;
                default:
                    Node<E> node = firstElement;
                    firstElement = node.getNextElement();
                    size--;
                    break;
            }
        }
    }

    public void removeLast() {
        if (size > 0) {
            switch (size) {
                case 1:
                    firstElement = null;
                    lastElement = null;
                    size--;
                    break;
                case 2:
                    Node<E> replaceNode = new Node<>(null, lastElement.getPreviousElement().getCurrentElement(), null);
                    lastElement = replaceNode;
                    firstElement = replaceNode;
                    size--;
                    break;
                default:
                    Node<E> node = lastElement;
                    lastElement = node.getPreviousElement();
                    size--;
                    break;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public E getElement(int index) {
        Node<E> node = firstElement;
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