package br.com.ferpioli.screeanmatch.calculos;

import br.com.ferpioli.screeanmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    public int getTempoTotal(){
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adcionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
