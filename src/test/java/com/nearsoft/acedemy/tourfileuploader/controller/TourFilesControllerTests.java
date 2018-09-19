package com.nearsoft.acedemy.tourfileuploader.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TourFilesControllerTests {
    private TourFilesController tourFilesController;
    private MockMvc mockMvc;

    @Before
    public void init() {
        tourFilesController = new TourFilesController();

        mockMvc = MockMvcBuilders
                .standaloneSetup(tourFilesController)
                .build();


    }


    @Test
    public void uploadTourFile_shouldReturnBadRequestDueToFileIsNotAttach() throws Exception {
        mockMvc.perform(post("/tours/uploads")
                .contentType("multipart/form-data"))
                .andExpect(status().isBadRequest())
                .andDo(print());


    }


}
