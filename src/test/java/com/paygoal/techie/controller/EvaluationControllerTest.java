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
                Arguments.of("request_1.json", "Thi i a tring tet", 4),
                Arguments.of("request_2.json", "Another tring teting", 61),
                Arguments.of("request_3.json", "Yez, thiz ztring tezt containz more than 5 z", 25),
                Arguments.of("request_4.json", "Hello", 5350)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTests")
    @SneakyThrows
    public void evaluation_withGroupOfData_evaluateResponse(String file, String stringResult, Integer integerResult) {
        String body = getContentFromFile(file);

        mockMvc.perform(post("/evaluate")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.stringToEvaluate").exists())
                .andExpect(jsonPath("$.integerToEvaluate").exists())
                .andExpect(jsonPath("$.stringToEvaluate").value(stringResult))
                .andExpect(jsonPath("$.integerToEvaluate").value(integerResult));

    }

}
