package com.example.projectping.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PingController {
    @GetMapping(value = "/pings", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> getPing() {
        log.info("enterd succesfull");
        return ResponseEntity.ok().build();
    }

}
