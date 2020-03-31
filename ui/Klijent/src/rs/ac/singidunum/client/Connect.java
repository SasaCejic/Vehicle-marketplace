package rs.ac.singidunum.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connect {

    public static String get(String urlToRead) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;
        while((line=rd.readLine()) != null){
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    public static String post(String urlToRead, String payload) throws IOException{
        try(CloseableHttpClient client = HttpClientBuilder.create().build()){
            HttpPost request = new HttpPost(urlToRead);
            request.setHeader("User-Agent","Java client");
            request.setHeader("Content-type","application/json");
            request.setEntity(new StringEntity(payload));

            HttpResponse response = client.execute(request);

            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

            StringBuilder builder = new StringBuilder();
            String line;

            while((line = br.readLine()) != null){
                builder.append(line);
                builder.append(System.lineSeparator());
            }
            return builder.toString();
        }
    }
}
