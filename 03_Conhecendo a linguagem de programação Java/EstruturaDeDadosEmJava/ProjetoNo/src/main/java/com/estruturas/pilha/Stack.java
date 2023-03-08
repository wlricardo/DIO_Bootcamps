package com.estruturas.pilha;

public class Stack<T> {
    private Cell<T> content;
    private int size;

    public Stack() {
        this.content = new Cell<>();
        this.size = 0;
    }

    public Stack(T content) {
        this.content.setContent(content);
    }

    public T getContent() {
        return content.getContent();
    }

    public void setContent(T content) {
        this.content.setContent(content);
    }

    public int getSize() {
        return size;
    }

    public T top() {
        return content.getContent();
    }

    public void push(Cell<T> newContent) {
        newContent.setNext(this.content);
        this.content = newContent;
        this.size++;
    }

    public Cell<T> pop() {
        if (!this.content.isEmpty()) {
            Cell<T> aux = this.content;
            content = content.getNext();
            aux = null;
            this.size--;
            return content;
        }
        return null;
    }

    @Override
    public String toString() {
        Cell<T> aux = this.content;
        int itemNumber = 0;
        StringBuilder itens = new StringBuilder();

        itens.append("-----------\n");
        itens.append("   STACK   \n");
        itens.append("-----------\n");

        while (true) {
            if (aux.getNext() != null) {
                itens.append("Cell #").append(++itemNumber).append(" content: ").append(aux.getContent());
                aux = aux.getNext();
            } else {
                break;
            }
        }
        return itens.toString();
    }
}
