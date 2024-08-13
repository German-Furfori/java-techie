package com.paygoal.techie.service.impl;

import com.paygoal.techie.dto.DataRequestDto;
import com.paygoal.techie.service.EvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EvaluationServiceImpl implements EvaluationService {

    @Override
    public String evaluate(DataRequestDto data) {
        //TODO logic
        return "All attributes are ok";
    }

}
