package com.mcb.administration.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcb.administration.dto.EvaluationValueObject;
import com.mcb.administration.service.EvaluationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EvaluationController.class)
public class EvaluationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EvaluationService service;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/api/v1/evaluation")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World")));
    }

    @Test
    public void shouldCreateEvaluationAsset() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        EvaluationValueObject evaluation = new EvaluationValueObject.Builder()
                .setName("asset3").setDescription("sseet").build();
        mockMvc.perform(post("/api/v1/evaluation")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(evaluation)))
                .andExpect(status().isCreated());
//        this.mockMvc.perform(post("/api/v1/evaluation")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello, World")));
    }
}

