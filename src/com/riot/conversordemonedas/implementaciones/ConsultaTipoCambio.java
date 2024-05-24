package com.riot.conversordemonedas.implementaciones;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaTipoCambio {
    public double conversionMoneda(String monedaOriginal, String monedaDestino) {
        String apiKey = "bed781ebf376e6603a6f820e";
        String urlString = "https://v6.exchangerate-api.com/v6/" + apiKey +
                "/latest/" + monedaOriginal;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            connection.disconnect();

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(content.toString(), JsonObject.class);

            JsonObject conversionRates = json.getAsJsonObject("conversion_rates");
            double rate = conversionRates.get(monedaDestino).getAsDouble();

            return rate;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
