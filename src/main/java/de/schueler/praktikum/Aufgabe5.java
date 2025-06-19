package de.schueler.praktikum;

import java.util.Random;
import java.util.Scanner;

/**
 * Schreibe ein Programm, welches den Umfang und die Fläche eines Kreises berechnen kann.
 * Der radius wird bei jedem durchlauf zufällig generiert
 * und hat immer einen anderen Wert und ist in der Variablen "radius" gespeichert.
 * Die berechneten Werte sollen anschließend ausgegeben werden.
 * • Formel für den Kreisumfang: U = 2 * PI * radius
 * • Formel für die Kreisfläche: F = PI * radius * radius
 * Gehe wie folgt vor:
 * 1. Definiere eine Variable PI mit dem Wert 3.14159 => nutze den Datentyp "double" (analog zu int)
 * um Kommazahlen speichern zu können.
 * 2. Berechne sowohl den Umfang, als auch die Fläche und speichere die Werte in Variablen
 * 3. Gebe die variablen mit system.out aus
 */
public class Aufgabe5 {

    public static void main(String[] args) {
        var random = new Random();
        int radius = random.nextInt(100);
        System.out.println("Radius = " + radius);

    }
}
