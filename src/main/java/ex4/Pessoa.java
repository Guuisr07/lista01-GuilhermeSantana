package ex4;

public class Pessoa {
    String nomeFilho;
    int idadeFilho;
    int idadePai;
    int idadeMae;
    String pai;
    String mae;

    public void mostrarArvore(String pai, int idadePai, String mae, int idadeMae, String nomeFilho, int idadeFilho) {
        System.out.println("Pai: " + pai);
        System.out.println("Idade do pai: " + idadePai);
        System.out.println("Mae: " + mae);
        System.out.println("Idade do mae: " + idadeMae);
        System.out.println("Filho(a): " + nomeFilho);
        System.out.println("Idade do filho: " + idadeFilho);
    }
}
