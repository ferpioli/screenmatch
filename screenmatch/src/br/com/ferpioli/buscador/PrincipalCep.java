package br.com.ferpioli.buscador;

public class PrincipalCep {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEmdereco = consultaCep.buscaEndereco("32341300");
        System.out.println(novoEmdereco);
    }
}
