package listasencadeadassimples;

public class ListaEncadeada<T> {

    private No<T> referencia;

    public ListaEncadeada() {
        this.referencia = null;
    }

    public ListaEncadeada(No<T> referencia) {
        this.referencia = referencia;
    }

    public No<T> getReferencia() {
        return referencia;
    }

    public void setReferencia(No<T> referencia) {
        this.referencia = referencia;
    }

    public boolean listaVazia() {
        return this.referencia == null;
    }

    public int tamanhoDaLista() {
        int tamanho = 0;
        No<T> aux = referencia;
        while (true) {
            if (aux != null) {
                tamanho++;
                if (aux.getProximo() != null) {
                    aux = aux.getProximo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanho;
    }

    public void adicionarElementoNoInicio(T novoElemento) {
        No<T> novoNo = new No<>(novoElemento);
        novoNo.setProximo(referencia);
        referencia = novoNo;
    }

    public void adicionarElementoNoFinal(T novoElemento) {
        No<T> novoNo = new No<>(novoElemento);
        No<T> aux = referencia;

        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        aux.setProximo(novoNo);
    }

    public void adicionarElementoNaPosicao(T novoElmento, int posicao) {
        No<T> novoNo = new No<>(novoElmento);
        No<T> inicio = this.referencia;
        No<T> fim = this.referencia;

        if (posicao < 1 || posicao > this.tamanhoDaLista()) {
            System.out.println("\n** POSICAO INVALIDA **\n");
            return;
        } else {
            for (int i = 0; i <= posicao - 1; i++) {
                inicio = inicio.getProximo();
            }
            fim = inicio.getProximo();
            novoNo.setProximo(fim);
            inicio.setProximo(novoNo);
        }
    }

    public T procurarConteudoNo(T conteudo) {
        int indice = 0;
        No<T> aux = this.referencia;

        if (listaVazia()) {
            System.out.println("\n ** A lista esta vazia **\n");
            return null;
        } else {
            while (aux.getConteudo() != conteudo) {
                indice++;
                aux = aux.getProximo();
                if (aux == null) {
                    System.out.println("\n ** Elemento nao encontrado **\n");
                    return null;
                }
            }
        }
        return aux.getConteudo();
    }

    public void removerElementoDoInicio() {
        if (this.listaVazia()) {
            System.out.println("\n** A lista está vazia ** \n");
        } else {
            No<T> aux = this.referencia;
            referencia = referencia.getProximo();
            aux.setProximo(null);
        }
    }

    public void removerElementoDoFinal() {

        if (this.listaVazia()) {
            System.out.println("\n** A lista está vazia ** \n");
        } else {
            No<T> aux = this.referencia;
            No<T> anterior = this.referencia;

            while (aux.getProximo() != null) {
                anterior = aux;
                aux = aux.getProximo();
            }
            anterior.setProximo(null);
        }
    }

    public void removerElementoDaPosicao(int posicao) {

        if (posicao < 1 || posicao > this.tamanhoDaLista()) {
            System.out.println("\n** POSICAO INVALIDA **\n");
        } else {
            if (this.listaVazia()) {
                System.out.println("\n** A lista está vazia ** \n");
            } else {
                No<T> aux = referencia;
                No<T> proximo = referencia;
                for (int i = 0; i < posicao - 1; i++) {
                    proximo = aux;
                    aux = aux.getProximo();
                }
                proximo.setProximo(aux.getProximo());
            }
        }
    }

    @Override
    public String toString() {
        No<T> aux = referencia;
        String msg = "";

        if (this.listaVazia()) {
            msg += "\n** A lista está vazia ** \n";
        }else{
        for (int i = 0; i < this.tamanhoDaLista(); i++) {
                msg += "\nConteudo No #" + (i + 1) + ": " + aux.getConteudo();
                aux = aux.getProximo();
            }            
        }
        return msg;
    }
}
