package de.allianz.praktikum.basics;

public class Kreis {

    private int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    public double berechneFlaeche() {
        return radius * radius * 3.14;
    }

    public double berechneUmfang() {
        return 2 * radius * 3.14;
    }

}
