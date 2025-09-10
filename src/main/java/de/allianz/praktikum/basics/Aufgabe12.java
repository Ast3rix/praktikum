package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, bei dem zwei Zahlen (Höhe und Breite) eingelesen werden
 * und dann für die Ausgabe eines Vierecks aus # genutzt werden.
 *
 * Beispiel:
 *
 * Eingabe Höhe 2, Breite 4 -> Ausgabe:
 * ####
 * ####
 *
 *
 * Eingabe Höhe 3, Breite 6 -> Ausgabe:
 * ######
 * ######
 * ######
 *
 * Nutze dafür zwei verschaltelte for-Schleifen --> ggfs. Google nutzen und einlesen
 * for(....) {
 *      for(....) {
 *    }
 * }
 */
public class Aufgabe12 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gib die Höhe des Vierecks ein?");
        int hoehe = Integer.valueOf(scanner.next());
        System.out.println("Gib die Breite des Vierecks ein?");
        int breite = Integer.valueOf(scanner.next());
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite ; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        }
    }
