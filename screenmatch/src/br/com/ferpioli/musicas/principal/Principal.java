package br.com.ferpioli.musicas.principal;

import br.com.ferpioli.screenmatch.modelos.MinhasPreferidas;
import br.com.ferpioli.screenmatch.modelos.Musica;
import br.com.ferpioli.screenmatch.modelos.PodCast;

import javax.xml.stream.XMLInputFactory;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i <1000 ; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("BolhaQA");
        meuPodCast.setApresentador("Fernando");

        for (int i = 0; i < 5000; i++) {
            meuPodCast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodCast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);
    }
}
