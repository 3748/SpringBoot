package com.gp6.springboot32.service;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestClientException;

import java.net.URI;
import java.util.Map;

/**
 * RestTemplate接口
 *
 * @author gp6
 * @date 2019-01-16
 */
public interface RestTemplateService {

    /**
     * GET----获取对象
     *
     * @param uri 请求uri
     * @param t   返回值的类型
     * @param <T> 泛型
     * @return 获取的对象
     */
    <T> T getForObject(URI uri, Class<T> t);

    /**
     * GET----获取数组
     *
     * @param url     请求url
     * @param responseType       返回值的类型
     * @param <T>     泛型
     * @param uriVariables 参数数组
     * @return 获取的对象
     */
    <T> T getForObject(String url, Class<T> responseType, Object... uriVariables);

    /**
     * GET----请求带有参数
     */
    <T> T getForObject(String url, Class<T> responseType, Map<String, ?> uriVariables);

    <T> ResponseEntity<T> getForEntity(URI uri, Class<T> responseType);

    <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Object... uriVariables);

    <T> ResponseEntity<T> getForEntity(String url, Class<T> responseType, Map<String, ?> uriVariables);


    // POST
    <T> T postForObject(String url, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException;

    <T> T postForObject(String url, @Nullable Object request, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException;

    <T> T postForObject(URI url, @Nullable Object request, Class<T> responseType) throws RestClientException;

    <T> ResponseEntity<T> postForEntity(String url, @Nullable Object request, Class<T> responseType, Object... uriVariables) throws RestClientException;

    <T> ResponseEntity<T> postForEntity(String url, @Nullable Object request, Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException;

    <T> ResponseEntity<T> postForEntity(URI url, @Nullable Object request, Class<T> responseType) throws RestClientException;

    // PUT
    void put(String url, @Nullable Object request, Object... uriVariables);

    void put(String url, @Nullable Object request, Map<String, ?> uriVariables);

    void put(URI url, @Nullable Object request) throws RestClientException;

    // DELETE
    void delete(String url, Object... uriVariables) throws RestClientException;

    void delete(String url, Map<String, ?> uriVariables) throws RestClientException;

    void delete(URI url) throws RestClientException;

}
