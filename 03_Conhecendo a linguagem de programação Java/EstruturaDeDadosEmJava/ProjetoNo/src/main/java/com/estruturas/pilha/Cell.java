package com.estruturas.pilha;

public class Cell<T> {
    private T content;
    private Cell<T> next = null;

    public Cell() {
        this.content = null;
        this.next = null;
    }

    public boolean isEmpty() {
        return this.content == null;
    }

    public Cell(T newContent) {
        this.content = newContent;
        this.next = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Cell<T> getNext() {
        return next;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Conteúdo: ";
    }
}
