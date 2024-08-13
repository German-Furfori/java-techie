package com.paygoal.techie.controller;

import com.paygoal.techie.dto.DataRequestDto;
import com.paygoal.techie.service.EvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class EvaluationController {

    private final EvaluationService evaluationService;

    @PostMapping("/evaluate")
    public String evaluate(@RequestBody @Valid DataRequestDto data) {
        return evaluationService.evaluate(data);
    }

}
