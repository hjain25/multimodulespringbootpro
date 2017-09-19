package com.demo.multimodulepro.samplemodule.demomodule.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping(value = "/get/test", method = RequestMethod.GET)
    public ResponseEntity test(){

        return new ResponseEntity("{  \n" +
                "   \"status\":\"demo success\"\n" +
                "}", HttpStatus.OK);
    }
}