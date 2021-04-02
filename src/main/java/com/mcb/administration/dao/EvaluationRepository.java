package com.mcb.administration.dao;

import com.mcb.administration.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository  extends JpaRepository<Evaluation, String> {
    Evaluation findByName(String name);
}
