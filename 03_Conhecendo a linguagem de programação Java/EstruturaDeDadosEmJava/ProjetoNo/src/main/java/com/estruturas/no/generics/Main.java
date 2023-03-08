package com.estruturas.no.generics;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Nó 1");
        No<String> no2 = new No<>("Nó 2");

        no1.setProximo(no2);

        System.out.println(no1);
        System.out.println(no1.getProximo());
    }
}