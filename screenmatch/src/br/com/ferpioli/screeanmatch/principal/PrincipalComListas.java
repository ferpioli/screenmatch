package br.com.ferpioli.screeanmatch.principal;

import br.com.ferpioli.screeanmatch.modelos.Filme;
import br.com.ferpioli.screeanmatch.modelos.Serie;
import br.com.ferpioli.screeanmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeDoFernando= new Filme("Dodville", 2003);
        filmeDoFernando.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFernando);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item; //cast
            System.out.println("classificação " + filme.getClassificacao());
        }
    }
}
