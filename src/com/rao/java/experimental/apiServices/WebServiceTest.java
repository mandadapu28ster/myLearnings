package com.rao.java.experimental.apiServices;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WebServiceTest {

    public static void main(String args[]) throws IOException {


        File f = new File("Files/test.xml");
        String soapRequest = new String(Files.readAllBytes(Paths.get(f.getPath())));

//        String url = "http://localhost:9901/UC";
//        HttpPost httpPost = new HttpPost(url);
//        httpPost.addHeader("CONTENT_TYPE" , "text/xml");

        String Response = getResponse(soapRequest, "http://localhost:9901/UC");
        System.out.println(Response);
    }

    public static String getResponse(String soapRequest, String endpoint) {

        HttpResponse response = null;
        String result = "";
        try {
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(30 * 1000).build();
            HttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
            HttpPost request = new HttpPost(endpoint);
            request.addHeader("Content-Type" , "text/xml");
            StringEntity params = new StringEntity(soapRequest);
            request.setEntity(params);

            response = httpClient.execute(request);
            int status = response.getStatusLine().getStatusCode();
            System.out.println("Endpoint status === > "+status);
            result = EntityUtils.toString(response.getEntity());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
