package unit.java.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;


public class TestSimulations {

    private static HttpURLConnection con;

    public static HttpResponse<String> SimulateAchPayment(String account_id) throws IOException {
        var url = "payments";

        try {
            var attributes = new HashMap<String, Object>() {{
                put("amount", 100000);
                put("direction", "Credit");
                put("description", "Sandbox Transaction");
            }};

            var account = new HashMap<String, Object>() {{
                put("type", "depositAccount");
                put("id", account_id);
            }};
            var relationshipData = new HashMap<String, Object>() {{
                put("data", account);
            }};

            var relationships = new HashMap<String, Object>() {{
                put("account", relationshipData);
            }};

            var values = new HashMap<String, Object>() {{
                put("type", "achPayment");
                put("attributes", attributes);
                put("relationships", relationships);
            }};

            var requestBodyData = new HashMap<String, Object>() {{
                put("data", values);
            }};

            var objectMapper = new ObjectMapper();
            String requestBody = objectMapper
                    .writeValueAsString(requestBodyData);

            return PostRequest(url, requestBody);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static HttpResponse<String> PostRequest(String url, String requestBody) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.s.unit.sh/sandbox/" + url))
                .header("Authorization", "Bearer " + System.getenv("access_token"))
                .header("Content-Type", "application/vnd.api+json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
