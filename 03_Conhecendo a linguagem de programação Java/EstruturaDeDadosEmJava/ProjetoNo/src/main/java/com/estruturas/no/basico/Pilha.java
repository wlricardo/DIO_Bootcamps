package com.estruturas.no.basico;

public class Pilha {

    private No noInicial;

    public Pilha() {
        this.noInicial = null;
    }

    public No Top() {
        return noInicial;
    }

    public void Push(No novo) {
        No aux = noInicial;
        noInicial = novo;
        noInicial.setProximo(aux);
    }

    public No Pop() {
        if (!this.isEmpty()) {
            No aux = noInicial;
            noInicial = noInicial.getProximo();
            return aux;
        }
        return null;
    }

    public boolean isEmpty() {
        return (noInicial == null ? true : false);
    }


}
