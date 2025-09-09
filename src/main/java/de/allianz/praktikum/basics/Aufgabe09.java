package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass ein eigegebenes Passwort auf folgende Kriterien prüft:
 * - mindestens 4 Zeichen,
 * - höchstens 10 Zeichen
 * Hilfe: Die Passwortlänge ist in der Variablen "passwordLenght" gespeichert.
 * Gib aus, ob das Passwort den Kriterien entspricht oder nicht.
 */
public class Aufgabe09 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gib ein Passwort ein: ");
        var password = scanner.next();
        var passwordLength = password.length();

    }
}