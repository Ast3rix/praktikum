package de.schueler.praktikum.basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    void testSumme() {
        int summe = 1 + 1;
        Assertions.assertThat(summe).isEqualTo(2);
    }

    @Test
    void testProdukt() {
        int produkt = 3 * 5;
        Assertions.assertThat(produkt).isEqualTo(15);
    }
}
