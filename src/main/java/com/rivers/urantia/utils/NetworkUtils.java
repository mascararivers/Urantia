package com.rivers.urantia.utils;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.*;

public class NetworkUtils {

    private static String APIKey;
    private static CloseableHttpClient client = HttpClientBuilder.create().build();

    public static void getAuctionDetails(String auctionID) throws IOException {
        HttpGet request = new HttpGet("https://sky.coflnet.com/api/auction/" + auctionID);
        request.addHeader("API-Key", APIKey);

        client.execute(request, httpResponse -> {
            return EntityUtils.toString(httpResponse.getEntity());
        });
    }

    public static boolean isWebhookValid(String webhookURL) throws IOException {
        HttpGet request = new HttpGet(webhookURL);
        client.execute(request, httpResponse -> {
            String response = EntityUtils.toString(httpResponse.getEntity());

            if(response.contains("50027")) { // error code for invalid webhook token
                return false;
            }
            return EntityUtils.toString(httpResponse.getEntity());
        });
        return true;
    }
}
