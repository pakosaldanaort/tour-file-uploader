package com.nearsoft.acedemy.tourfileuploader.controller;


import com.nearsoft.acedemy.tourfileuploader.service.TourTransformationObjectService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@RestController
@RequestMapping("/tours/uploads")
public class TourFilesController {

    private String UPLOAD_DIR = "/Users/francisco_saldana/Documents/Nearsoft/tour-file-uploader/TourFiles/";
    private TourTransformationObjectService tourTransformationObjectService;

    public TourFilesController(TourTransformationObjectService tourTransformationObjectService) {
        this.tourTransformationObjectService = tourTransformationObjectService;
    }

    @PostMapping
    public ResponseEntity<String> uploadTourFile (@RequestParam("file") MultipartFile multipartFile) throws IOException {
        saveUploadedTourFile(multipartFile);
        return ResponseEntity.ok().body("Sucessful File Upload");
    }

    private void saveUploadedTourFile(MultipartFile multipartFile) throws IOException {
       tourTransformationObjectService.processFile(multipartFile);
        /*byte[] fileBytes = multipartFile.
        Path path = Paths.get(UPLOAD_DIR + multipartFile.getOriginalFilename());
        Files.write(path,fileBytes);*/
    }

    @ExceptionHandler(FileUploadException.class)
    public ResponseEntity<String> handleFileUploadException(FileUploadException fileUploadException) {
        return  ResponseEntity.badRequest().body("Fail File Upload" + fileUploadException.getLocalizedMessage());
    }

    @Autowired
    public void setTourTransformationObjectService(TourTransformationObjectService tourTransformationObjectService) {
        this.tourTransformationObjectService = tourTransformationObjectService;
    }

    //agregar conf para subir el archivo, como agregar la dependencia commons-csv


    /*@RequestMapping(value="/method8/{id:[\\d]+}/{name}")
    public String method8(@PathVariable("id") long id, @PathVariable("name") String name){
        return "method8 with id= "+id+" and name="+name;
    }

http://miservico/tours/uploads/method8/8/pako
    public String method9(@RequestParam("id") int id){
        return "method9 with id= "+id;
    }*/
}
