package br.com.ferpioli.screeanmatch.principal;

import br.com.ferpioli.screeanmatch.modelos.Filme;
import br.com.ferpioli.screeanmatch.modelos.Serie;
import br.com.ferpioli.screeanmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
            if (item instanceof Filme filme && filme.getClassificacao()  > 2 ){
                System.out.println("classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adan Sandler");
        buscaPorArtista.add("Fernanda Montengro");
        buscaPorArtista.add("Brad Pitt");
        System.out.println((buscaPorArtista));

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenção: " + buscaPorArtista);
        System.out.println("Lista de tilulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);
    }
}
