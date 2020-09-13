package com.rest.optional.stream;

import com.rest.optional.stream.controller.PostComputerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private PostComputerController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
