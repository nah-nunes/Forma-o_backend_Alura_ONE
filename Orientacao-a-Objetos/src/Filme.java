public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica (){
        System.out.println("Nome do filme" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);

    }
}




