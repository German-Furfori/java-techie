package com.paygoal.techie.controller;

import com.paygoal.techie.dto.DataDto;
import com.paygoal.techie.service.EvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EvaluationController {

    private final EvaluationService evaluationService;

    @PostMapping("/evaluate")
    public DataDto evaluate(@RequestBody DataDto data) {
        return evaluationService.evaluate(data);
    }

}
