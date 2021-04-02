package com.mcb.administration.dao;

import com.mcb.administration.dto.EvaluationValueObject;
import com.mcb.administration.model.Evaluation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

//@ExtendWith(SpringExtension.class)
@DataJpaTest
@ActiveProfiles("test")
public class EvaluationDaoTest {

    @Autowired
    private EvaluationRepository userRepository;


    @Autowired
    private TestEntityManager entityManager;

    @Test
    void injectedComponentsAreNotNull(){
        Assertions.assertThat(userRepository).isNotNull();
    }
    @Test
    void shouldCreateAssets(){
        Evaluation  evaluations = new Evaluation();
        evaluations.setId("sdf");
        evaluations.setDescription("sdf");
        evaluations.setName("asset1");

        Evaluation updatedEvaluation = userRepository.save(evaluations);
        Assertions.assertThat(updatedEvaluation).isNotNull();
    }

    @Test
    void findByName(){
        Evaluation  evaluations = new Evaluation();
        evaluations.setId("sdf");
        evaluations.setDescription("sdf");
        evaluations.setName("E1200031");
        entityManager.persist(evaluations);
        Evaluation  evaluation = userRepository.findByName("E1200031");
        Assertions.assertThat(evaluation).isNotNull();
    }

}

