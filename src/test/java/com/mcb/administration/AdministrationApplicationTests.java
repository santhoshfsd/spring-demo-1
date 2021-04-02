package com.mcb.administration;

import com.mcb.administration.controller.EvaluationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class AdministrationApplicationTests {

	@Autowired
	private EvaluationController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
