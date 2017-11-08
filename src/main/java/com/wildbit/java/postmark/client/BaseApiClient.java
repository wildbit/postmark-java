package com.wildbit.java.postmark.client;

import javax.ws.rs.core.MultivaluedHashMap;

/**
 * Class that handles on very high level API requests. All Postmark public endpoints which
 * are reachable can be accessible by classes extending this class.
 *
 */
public class BaseApiClient extends HttpClientHandler {

    private final String baseUrl;
    protected String getEndpointUrl(String endpoint) {
        return baseUrl + endpoint;
    }

    public BaseApiClient(String baseUrl, MultivaluedHashMap<String,Object> headers) {
        super(headers);
        this.baseUrl = baseUrl;
    }

    public BaseApiClient(String baseUrl, MultivaluedHashMap<String,Object> headers, boolean secureConnection) {
        this(baseUrl, headers);
        setSecureConnection(secureConnection);
    }

}
