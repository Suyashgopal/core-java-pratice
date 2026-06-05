// Java Networking - using the HttpClient to make an HTTP GET request
// also shows InetAddress to get ip of a website

import java.net.InetAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NetworkingDemo {
    public static void main(String[] args) {

        // part 1 - find ip address of a host
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("could not resolve host (maybe no internet)");
        }

        // part 2 - make an HTTP GET request (java 11+ HttpClient)
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.example.com"))
                    .build();

            // send request and get response
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode());
            // just print first 200 chars of body so its not too long
            String body = response.body();
            System.out.println("Body starts with:");
            System.out.println(body.substring(0, Math.min(200, body.length())));
        } catch (Exception e) {
            System.out.println("request failed: " + e.getMessage());
        }
    }
}
