package br.com.ferpioli.buscador;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep){
        URI enderco = URI.create("https://viacep.com.br/ws/"+cep+"/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderco)
                .build();


        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Endereço não encontrado");
        }

    }
}
