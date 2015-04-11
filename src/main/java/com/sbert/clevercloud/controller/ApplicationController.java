package com.sbert.clevercloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sbert on 11/04/15.
 */
@RestController
@RequestMapping("/api")
public class ApplicationController {

    @RequestMapping
    public String index() {
        return "toto";
    }
}
