package br.com.ferpioli.desafio0;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Maria Bethania";
        String tipoConta = "Corrente";
        double saldo = 1566.99;
        int opcao =0;

        System.out.println("************************************************");
        System.out.println("\n Nome do Cliente " + nome);
        System.out.println(("Tipo conta " + tipoConta));
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n*************************************************");
    String menu = """
            ** Digite sua opção **
            1 - Consultar saldo
            2 - Transferir Valor
            3 - Receber Valor
            4 - Sair
            """;
        Scanner leitura = new Scanner(System.in);

        while(opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();


        }

    }
}
