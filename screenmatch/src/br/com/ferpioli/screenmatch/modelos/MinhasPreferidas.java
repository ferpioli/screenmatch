package br.com.ferpioli.screenmatch.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
       if(audio.getClassificacao() >=9) {
           System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
       }else{
           System.out.println(audio.getTitulo() + "é um album muito ouvido");
       }
    }
}
