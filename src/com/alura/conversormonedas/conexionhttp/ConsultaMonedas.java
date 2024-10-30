package com.alura.conversormonedas.conexionhttp;

import com.alura.conversormonedas.modelos.MonedasAPI;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {

    public MonedasAPI buscarMoneda(String monedaBase, String monedaObjetivo){

        String apiKey = "ce9d8dcf01e2c243c3ea68ab";

        URI uriDeApi = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+monedaBase+"/"+monedaObjetivo+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uriDeApi)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json, MonedasAPI.class);

        } catch (Exception e) {

            throw new RuntimeException("No se encontró ningún tipo de moneda.");

        }

    }

}
