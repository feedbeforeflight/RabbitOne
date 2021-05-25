package com.feedbeforeflight.RabbitOne;

import com.feedbeforeflight.RabbitOne.RabbitOneController.RabbitOneController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RabbitOneApplicationTests {

	@Autowired
	private RabbitOneController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
