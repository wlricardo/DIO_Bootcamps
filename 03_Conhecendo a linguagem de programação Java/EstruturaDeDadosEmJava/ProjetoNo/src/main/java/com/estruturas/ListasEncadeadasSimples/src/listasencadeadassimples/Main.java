package listasencadeadassimples;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> listaDeNomes = new ListaEncadeada<>();

        listaDeNomes.adicionarElementoNoInicio("Willem");
        listaDeNomes.adicionarElementoNoInicio("Viviane");
        listaDeNomes.adicionarElementoNoFinal("Isabela");
        listaDeNomes.adicionarElementoNoFinal("Giovanna");
        listaDeNomes.adicionarElementoNoInicio("Bimbo");
        listaDeNomes.adicionarElementoNaPosicao("Chico", 3);
        listaDeNomes.adicionarElementoNaPosicao("Clovis", 1);

        System.out.println(listaDeNomes.toString());
        listaDeNomes.procurarConteudoNo("Bereleu");
        listaDeNomes.removerElementoDoInicio();
        System.out.println(listaDeNomes.toString());
        listaDeNomes.removerElementoDoFinal();
        System.out.println(listaDeNomes.toString());
        listaDeNomes.adicionarElementoNaPosicao("Curruleps", 200);
        listaDeNomes.removerElementoDaPosicao(5);
        System.out.println(listaDeNomes.toString());
        listaDeNomes.removerElementoDaPosicao(5);
    }
}
