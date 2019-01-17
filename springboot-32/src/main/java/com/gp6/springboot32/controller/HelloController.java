package com.gp6.springboot32.controller;

import com.gp6.springboot32.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.net.URISyntaxException;

@Controller
@RequestMapping({"test"})
public class HelloController {

    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping(value = "{id}")
    public void selectFbaOutApplyById(@PathVariable("id") Integer id) throws URISyntaxException {
        URI uri = new URI("http://192.168.8.36:8081/rest/item/cat?id=2");
        ResponseEntity<String> a = restTemplateService.getForEntity(uri, String.class);
        System.out.println(a);
    }
}
