package com.nearsoft.acedemy.tourfileuploader.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/tours/uploads")
public class TourFilesController {
    @PostMapping
    public ResponseEntity<String> uploadTourFile(@RequestParam("file") MultipartFile multipartFile) {
        return ResponseEntity.badRequest().body("");
    }



    /*@RequestMapping(value="/method8/{id:[\\d]+}/{name}")
    public String method8(@PathVariable("id") long id, @PathVariable("name") String name){
        return "method8 with id= "+id+" and name="+name;
    }

http://miservico/tours/uploads/method8/8/pako
    public String method9(@RequestParam("id") int id){
        return "method9 with id= "+id;
    }*/
}
