package com.nearsoft.acedemy.tourfileuploader.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tours/uploads")
public class TourFilesController {
    @GetMapping
    public ResponseEntity<String> uploadTourFile() {
        return ResponseEntity.ok("Hola Mundo");
    }
}
