package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass eine Zahl einließt.
 * Ist die eingelesen Zahl 0-5, dann gib "kleine zahl" aus.
 * Ist die eingelesen Zahl 5-10, dann gib "mittelgroße zahl" aus.
 * Ist die eingelesen Zahl 10 oder höher, dann gib "hohe zahl" aus.
 *
 * Nutze dazu eine Switch-Anweisung mit nur 2 "case" und einer "default" Anweisung!
 * Beispiel für den Input und output des Programms:
 * ================================================
 * Gebe eine einstellige Zahl ein:
 * 7
 * mittelgroße zahl
 */
public class Aufgabe16 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gebe eine einstellige Zahl ein: ");
        int zahl = scanner.nextInt();
        switch (zahl) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("kleine zahl");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("mittelgroße zahl");
                break;
            default:
                System.out.println("hohe zahl");
        }
    }
}
