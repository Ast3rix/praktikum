package de.schueler.praktikum.springboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTest {

    @Autowired
    private Application application;

    @Test
    void contextLoads() {
        Assertions.assertThat(application).isNotNull();
    }
}