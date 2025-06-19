package de.schueler.praktikum;

import java.util.Scanner;

/*
Ich mag '#' - Zeichen.
Schreibe ein Programm, bei dem zwei Zahlen (Höhe und Breite) einliest wird und dann ein Viereck aus # anzeigt.

Beispiel:

Eingabe Höhe 2, Breite 4 -> Ausgabe:
####
####


Eingabe Höhe 3, Breite 6 -> Ausgabe:
######
######
######

Nutze dafür zwei verschaltelte for-Schleifen --> Google nutzen und einlesen
for(....) {
  for(....) {
  }
}
 */
public class Aufgabe10 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gib die Höhe des Vierecks ein?");
        int hoehe = Integer.valueOf(scanner.next());
        System.out.println("Gib die Breite des Vierecks ein?");
        int breite = Integer.valueOf(scanner.next());

    }
}
