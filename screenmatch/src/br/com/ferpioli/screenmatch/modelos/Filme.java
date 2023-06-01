package br.com.ferpioli.screenmatch.modelos;

public class Filme {
    public String nome;
   public int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
   private int totalDeAvaliacoes;
    int duracaoEmMinutos;

   public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

   public void exibeFichaTecnica(){
        System.out.println("nome do filme: "  + nome);
        System.out.println("ano de lançamento:" + anoDeLancamento);
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
