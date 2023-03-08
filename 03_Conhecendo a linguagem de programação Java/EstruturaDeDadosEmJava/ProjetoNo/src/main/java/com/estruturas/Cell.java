package com.estruturas;

public class Cell {
    private Object content;
    private Cell next;

    public Cell() {
        this.content = null;
        this.next = null;
    }

    public Cell(Object newContent) {
        this.content = newContent;
        this.next = null;
    }

    public boolean isEmpty() {
        return this.content == null;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Conteúdo: " + this.getContent();
    }
}
