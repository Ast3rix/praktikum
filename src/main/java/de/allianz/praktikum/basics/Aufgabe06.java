package de.allianz.praktikum.basics;

import java.util.Random;

/**
 * Schreibe ein Programm, dass den Umfang und die Fläche eines Kreises berechnen kann.
 * Der Radius wird bei jedem Durchlauf zufällig generiert
 * und hat somit bei jedem Durchlauf einen anderen Wert.
 * Der zufällig generierte Wert wird in der Variblen 'radius' gespeichert.
 *
 * Die berechnete Fläche und der berechnete Umfang sollen anschließend ausgegeben werden.
 * Formel für den Kreisumfang: U = 2 * PI * radius
 * Formel für die Kreisfläche: F = PI * radius * radius
 *
 * Gehe wie folgt vor:
 * 1. Definiere eine Variable 'pi' mit dem Wert 3.14159
 *      => Nutze den Datentyp "double" (analog zu int) um Gleitkommazahlen zu speichern
 * 2. Berechne sowohl den Umfang, als auch die Fläche und speichere die Werte in Variablen
 * 3. Gebe die Variablen mit System.out.println. Beispiel siehe bei der Ausgabe des Radius.
 */
public class Aufgabe06 {

    public static void main(String[] args) {
        var random = new Random();
        int radius = random.nextInt(100);
        System.out.println("Radius = " + radius);
        double pi = 3.14159;
        double umfang = 2 * pi * radius;
        double flaeche = pi * radius * radius;
        System.out.println("umfang = " + umfang + "\nfläche = " + flaeche);

    }
}
