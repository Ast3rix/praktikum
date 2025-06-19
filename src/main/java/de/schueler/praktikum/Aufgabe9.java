package de.schueler.praktikum;

import java.util.Scanner;

/*
Ich mag '#' - Zeichen.
Schreibe ein Programm, bei dem eine Zahl eingelesen wird und dann so viele # ausgegeben werden, wie die eingegeben Zahl ist.

Beispiel:
Eingabe ist 3 -> Ausgabe: ###
Eingabe ist 5 -> Ausgabe ist #####

Nutze dafür eine for-Schleife --> Google nutzen und einlesen
 */
public class Aufgabe9 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Wie viele # soll ich anzeigen?");
        int anzahl = Integer.valueOf(scanner.next());



    }
}
