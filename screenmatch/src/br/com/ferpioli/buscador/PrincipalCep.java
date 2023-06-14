package br.com.ferpioli.buscador;

import java.util.Scanner;

public class PrincipalCep {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        try {
            Endereco novoEmdereco = consultaCep.buscaEndereco("0");
            System.out.println(novoEmdereco);
        }catch (RuntimeException e ){
            System.out.println(e.getMessage());
            System.out.println("Finalisando a aplicação");
        }

    }
}
