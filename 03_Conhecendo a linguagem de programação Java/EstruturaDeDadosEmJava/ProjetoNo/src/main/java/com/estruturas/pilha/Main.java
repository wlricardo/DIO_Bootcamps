package com.estruturas.pilha;

public class Main {
    public static void main(String[] args) {
        Stack<Cell<String>> myStack = new Stack<>();

        myStack.push(new Cell("Monday\n"));
        myStack.push(new Cell("Thursday\n"));
        myStack.push(new Cell("Wednesday\n"));
        myStack.push(new Cell("Tuesday\n"));
        myStack.push(new Cell("Friday\n"));

        System.out.println(myStack.toString());

        System.out.println("Topo da PILHA: " + myStack.top());

        System.out.println("Retirando elemento do topo...\n");
        myStack.pop();

        System.out.println(myStack.toString());
    }
}
