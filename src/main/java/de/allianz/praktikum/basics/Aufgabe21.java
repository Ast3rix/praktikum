package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Google im Internet nach Java - "Klassen". Informiere dich, wozu sie da sind und wie sie verwendet werden.
 *
 * Schreibe ein Programm, dass einen Radius einliest. Berechne die Fläche, den Umfang und zeige die Werte an.
 *
 * Erstelle dafür eine Klasse "Kreis", die 2 Methoden ("berechenFlaeche" und "berechneUmfang") hat.
 * Nutze diese Klasse in deinem Hauptprogramn,
 *
 *
 * Ausbauschritt, wenn der erste Teil bereits funktioniert:
 * Informiere dich, was "jUnit"-Tests sind.
 * Erstelle eine Test-Klasse im test-Ordner für die Klasse "Kreis" und schreibe mindestens 2 Tests.
 *
 * Ein triviales Beispiel für einen Test findest du in der Klasse "Test123.java" im Test-Ordner unten.
 *
 */
public class Aufgabe21 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Gib einen Radius an?");
        int radius = scanner.nextInt();

    }
}
