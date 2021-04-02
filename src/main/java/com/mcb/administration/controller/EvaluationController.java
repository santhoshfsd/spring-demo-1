package com.mcb.administration.controller;

import com.mcb.administration.dto.EvaluationValueObject;
import com.mcb.administration.model.Evaluation;
import com.mcb.administration.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/evaluation")
public class EvaluationController {

    @Autowired
    EvaluationService evaluationService;

    @PostMapping(value = "")
    @ResponseStatus( HttpStatus.CREATED )
    public Evaluation createCourse(@RequestBody EvaluationValueObject courseDto) {
        Evaluation evaluation = evaluationService.createAssets(courseDto);
        return evaluation;
    }

    @GetMapping(value = "")
    public String validateRoute() {
        return "Hello, World";
    }

}
