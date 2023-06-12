package br.com.ferpioli.screeanmatch.principal;

import br.com.ferpioli.screeanmatch.execao.ErroDeConversaoDeAnoException;
import br.com.ferpioli.screeanmatch.modelos.Titulo;
import br.com.ferpioli.screeanmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();
        String endereco = "https://omdbapi.com/?t="+busca.replace(" ","+")+"&apiKey=73ba8dae";

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);


            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();// build para variaveis em maiusculo no json

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo ja convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e ){
            System.out.println("Aconteceu um erro");
            System.out.println((e.getMessage()));
        }catch (IllegalArgumentException e) {
            System.out.println("Erro na URL");
        } catch (ErroDeConversaoDeAnoException e ){
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizou corretamente");


    }

}