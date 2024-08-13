package com.paygoal.techie.controller;

import com.paygoal.techie.TechieApplicationTests;
import lombok.SneakyThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.MediaType;

import java.util.stream.Stream;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class EvaluationControllerTest extends TechieApplicationTests {

    private static Stream<Arguments> provideDataForTests() {
        return Stream.of(
                Arguments.of("request_1.json", "Cannot receive this String"),
                Arguments.of("request_2.json", "Cannot receive this Integer"),
                Arguments.of("request_3.json", "Cannot receive this List"),
                Arguments.of("request_4.json", "All attributes are ok")
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTests")
    @SneakyThrows
    public void evaluation_withGroupOfData_evaluateResponse(String file, String response) {
        String body = getContentFromFile(file);

        mockMvc.perform(post("/evaluate")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.response").exists())
                .andExpect(jsonPath("$.response").value(response));

    }

}
