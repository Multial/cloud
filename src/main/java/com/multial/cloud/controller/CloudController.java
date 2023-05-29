package com.multial.cloud.controller;

import org.springframework.stereotype.Controller;

import java.util.stream.IntStream;

@Controller
public class CloudController {

    public static void main(String[] args) {

        IntStream.range(0,10).forEach(n-> {
            String[] strings = new String[1000000000];
        });

        while(true){

        }
    }

}
