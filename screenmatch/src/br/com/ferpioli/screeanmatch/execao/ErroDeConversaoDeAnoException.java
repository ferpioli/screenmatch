package br.com.ferpioli.screeanmatch.execao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage(){
        return this.mensagem;
    }
}
