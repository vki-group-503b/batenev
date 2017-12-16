package ru.nsu.hci.batenev.javalabs.lab9;

public class Node<E> {
    private Node<E> previousElement;
    private E currentElement;
    private Node<E> nextElement;

    public Node(Node<E> previousElement, E currentElement, Node<E> nextElement) {
        this.previousElement = previousElement;
        this.currentElement = currentElement;
        this.nextElement = nextElement;
    }

    public Node<E> getPreviousElement() {
        return previousElement;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setPreviousElement(Node<E> previousElement) {
        this.previousElement = previousElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }
}