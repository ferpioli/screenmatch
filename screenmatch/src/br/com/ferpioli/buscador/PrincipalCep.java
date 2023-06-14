package br.com.ferpioli.buscador;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalCep {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite o numero de CEP para consulta: ");
        var cep = leitura.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e ){
            System.out.println(e.getMessage());
            System.out.println("encerra a aplicação");
        }

    }
}
