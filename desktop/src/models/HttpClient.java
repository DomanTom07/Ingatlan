package models;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpClient {
    int responseCode;
    public HttpClient() {
    }
    public String get(String urlStr) {
        String result;
        try {
            result = tryGet(urlStr);
        } catch (IOException e) {
            String msg = "Hiba! A GET kérés sikertelen!";
            System.err.println(msg);
            result = msg;
        }
        return result;
    }
    public String tryGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        this.responseCode = http.getResponseCode();
        InputStream inputStream = http.getInputStream();
        String text = convertInputStreamToString(inputStream);        
        return text;
    }
    private String convertInputStreamToString(InputStream inputStream) {
        String text;
        try {
            text = this.tryConvertInputStreamToString(inputStream);
        } catch (UnsupportedEncodingException e) {
            String msg = "Hiba! Nem támogatott kódolás!";
            System.err.println(msg);
            text = msg;
        }
        return text;
    }
    private String tryConvertInputStreamToString(InputStream inputStream) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        final Reader reader = new InputStreamReader(inputStream, "UTF-8");
        Scanner scanner = new Scanner(reader);
        while(scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        scanner.close();
        return stringBuilder.toString();
    }

    public int getResponseCode() {
        return responseCode;
    }
}
