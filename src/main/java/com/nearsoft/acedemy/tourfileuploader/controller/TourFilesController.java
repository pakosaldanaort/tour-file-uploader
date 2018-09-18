package com.nearsoft.acedemy.tourfileuploader.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tours/uploads")
public class TourFilesController {
    @GetMapping
    public ResponseEntity<String> uploadTourFile() {

        return ResponseEntity.ok("Hola Mundo");
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
