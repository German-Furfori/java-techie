package com.paygoal.techie.controller;

import com.paygoal.techie.TechieApplicationTests;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HealthRestControllerTest extends TechieApplicationTests {

    @Test
    void healthCheck() throws Exception {
        mockMvc
                .perform(get("/actuator/health"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/vnd.spring-boot.actuator.v3+json"))
                .andReturn();
    }
}