package de.schueler.praktikum;

import java.util.Scanner;

/*
Schreibe ein Programm, dass eine Zahl einließt.
Ist die eingelesen Zahl 0-5, dann gib "kleine zahl" aus.
Ist die eingelesen Zahl 5-10, dann gib "mittelgroße zahl" aus.
Ist die eingelesen Zahl 10 oder höher, dann gib "hohe zahl" aus.

Nutze dazu eine Switch-Anweisung mit nur 2 "case" und einer "default" Anweisung!
Beispiel für den Input und output des Programms:
================================================
Gebe eine einstellige Zahl ein:
7
mittelgroße zahl


 */
public class Aufgabe15 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gebe eine einstellige Zahl ein: ");
        int zahl = scanner.nextInt();

    }
}
