package org.example.fourth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.fourth.dto.response.IpAddress;

import java.io.PrintStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class FourthTask {
    private final PrintStream out;
    private final HttpClient client;
    private final ObjectMapper objectMapper;

    public FourthTask(PrintStream out) {
        this.out = out;
        this.client = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public void fourthTaskSync() {
        out.println("===== Fourth Task Sync =====");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            IpAddress ipAddress = objectMapper.readValue(response.body(), IpAddress.class);
            out.println("Ваш IP-адрес: " + ipAddress.origin());
        } catch (Exception e) {
            out.println("Ошибка запроса: " + e.getMessage());
        }
    }

    public void fourthTaskAsync() {
        out.println("===== Fourth Task Async =====");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .build();

        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        response.thenAccept(resp -> {
            try {
                IpAddress ipAddress = objectMapper.readValue(resp.body(), IpAddress.class);
                out.println("Ваш IP-адрес: " + ipAddress.origin());
            } catch (Exception e) {
                out.println("Ошибка обработки JSON: " + e.getMessage());
            }
        }).exceptionally(e -> {
            out.println("Ошибка запроса: " + e.getMessage());
            return null;
        }).join();
    }
}
