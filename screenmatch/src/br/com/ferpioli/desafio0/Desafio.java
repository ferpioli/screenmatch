package br.com.ferpioli.desafio0;

import javax.sound.midi.Soundbank;
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
            if(opcao == 1 ){
                System.out.println("O Saldo atualizado é " + saldo);

            }else if (opcao == 2 ){
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if(valor > saldo){
                    System.out.println("Não a saldo suficiente");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            }else if (opcao == 3 ){
                System.out.println("Valor recebido " );
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4 ) {
                System.out.println("Opção invalida");

            }

        }

    }
}
