package com.gp6.springboot32.service.impl;

import com.gp6.springboot32.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

/**
 * RestTemplate实现类
 *
 * @author gp6
 * @date 2019-01-16
 */
@Service
public class RestTemplateServiceImpl implements RestTemplateService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public <T> T getForObject(URI uri, Class<T> t) {
        return restTemplate.getForObject(uri, t);
    }

    @Override
    public <T> T getForObject(String url, Class<T> t, Object... object) {
        return restTemplate.getForObject(url, t, object);
    }

    @Override
    public <T> T getForObject(String url, Class<T> t, Map<String, ?> map) {
        return restTemplate.getForObject(url, t, map);
    }

    @Override
    public <T> ResponseEntity<T> getForEntity(URI uri, Class<T> t) {
        return restTemplate.getForEntity(uri, t);
    }

    @Override
    public <T> ResponseEntity<T> getForEntity(String url, Class<T> t, Object... object) {
        return restTemplate.getForEntity(url, t, object);
    }

    @Override
    public <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Map<String, ?> uriVariables) {
        return restTemplate.getForEntity(url, responseType, uriVariables);
    }

    @Override
    @Nullable
    public <T> T postForObject(String url, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return restTemplate.postForObject(url, request, responseType, uriVariables);
    }

    @Override
    @Nullable
    public <T> T postForObject(String url, @Nullable Object request, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        return restTemplate.postForObject(url, request, responseType, uriVariables);
    }

    @Override
    @Nullable
    public <T> T postForObject(URI url, @Nullable Object request, Class<T> responseType) throws RestClientException {
        return restTemplate.postForObject(url, request, responseType);
    }

    @Override
    public <T> ResponseEntity<T> postForEntity(String url, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return restTemplate.postForEntity(url, request, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> postForEntity(String url, @Nullable Object request, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        return restTemplate.postForEntity(url, request, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> postForEntity(URI url, @Nullable Object request, Class<T> responseType) throws RestClientException {
        return restTemplate.postForEntity(url, request, responseType);
    }

    // PUT
    @Override
    public void put(String url, @Nullable Object request, Object... uriVariables)
            throws RestClientException {
        restTemplate.put(url, request, uriVariables);
    }

    @Override
    public void put(String url, @Nullable Object request, Map<String, ?> uriVariables)
            throws RestClientException {

        restTemplate.put(url, request, uriVariables);
    }

    @Override
    public void put(URI url, @Nullable Object request) throws RestClientException {
        restTemplate.put(url, request);
    }

    // DELETE
    @Override
    public void delete(String url, Object... uriVariables) throws RestClientException {
        restTemplate.delete(url, uriVariables);
    }

    @Override
    public void delete(String url, Map<String, ?> uriVariables) throws RestClientException {
        restTemplate.delete(url, uriVariables);
    }

    @Override
    public void delete(URI url) throws RestClientException {
        restTemplate.delete(url);
    }
}
