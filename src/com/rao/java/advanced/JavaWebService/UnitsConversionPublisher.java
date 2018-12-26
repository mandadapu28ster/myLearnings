package com.rao.java.advanced.JavaWebService;

import javax.xml.ws.Endpoint;

public class UnitsConversionPublisher
{
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9901/UnitsConversion", new UnitsConversionImpl());
    }
}
