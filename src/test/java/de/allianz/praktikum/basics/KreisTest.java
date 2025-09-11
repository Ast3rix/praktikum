package de.allianz.praktikum.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest {

    private Kreis kreis = new Kreis(10);

    @Test
    void testBerechneFlaeche() {
        double flaeche = kreis.berechneFlaeche();
        assertEquals(314.0, flaeche, 0.01);
    }

    @Test
    void testBerechneUmfang() {
        double umfang = kreis.berechneUmfang();
        assertEquals(62.8, umfang, 0.01);
    }
}