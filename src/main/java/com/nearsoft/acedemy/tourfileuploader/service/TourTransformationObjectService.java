package com.nearsoft.acedemy.tourfileuploader.service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

@Service
public class TourTransformationObjectService {

    @Autowired
    private ApplicationContext context;

    public void processFile(MultipartFile multipartFile) throws IOException {
        InputStream fileInputStream = multipartFile.getInputStream();
        Reader fileReader = new InputStreamReader(fileInputStream);
        CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);
        for(CSVRecord csvRecord : csvParser.getRecords()) {
            TourDetails tourDetails = context.getBean(TourDetails.class);
            tourDetails.setNumberOfFlight(Integer.parseInt(csvRecord.get(0)));
            tourDetails.setDestination(csvRecord.get(0));


        }

    }
}
