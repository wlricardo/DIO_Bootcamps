package listasencadeadassimples;

public class No<T> {

    T conteudo;
    No proximo;

    public No() {
        this.conteudo = null;
        this.proximo = null;
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }

    public No(T conteudo, No proximo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Conteudo: " + this.conteudo;
    }
}
