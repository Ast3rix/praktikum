package de.schueler.praktikum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PraktikumApplicationTests {

	@Autowired
	private PraktikumApplication praktikumApplication;

	@Test
	void contextLoads() {
		Assertions.assertThat(praktikumApplication).isNotNull();
	}

}
