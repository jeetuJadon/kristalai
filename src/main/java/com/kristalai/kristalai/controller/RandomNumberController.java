package com.kristalai.kristalai.controller;

import com.kristalai.kristalai.model.RandomNumberResponse;
import com.kristalai.kristalai.service.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RandomNumberController {

@Autowired
RandomNumberService randomNumberService;



    @GetMapping(path = "/getRandomlyGeneratedNumbers")
    public ResponseEntity getDiscountedAmount() {

        HttpHeaders responseHeaders = new HttpHeaders();
        RandomNumberResponse randomNumberResponse = null;
        responseHeaders.add("content-type", "application/json");
        String errorMessage = "";
        try {
             randomNumberResponse = randomNumberService.generateRandomNumberResponse();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            errorMessage = e.toString();
        }
        if (!errorMessage.equalsIgnoreCase("")) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        } else {
            return ResponseEntity.ok().headers(responseHeaders).body(randomNumberResponse);
        }

    }




}
