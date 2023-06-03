package br.com.ferpioli.screenmatch.modelos;

import br.com.ferpioli.screeanmatch.calculos.Classificavel;

public class Filme extends  Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
