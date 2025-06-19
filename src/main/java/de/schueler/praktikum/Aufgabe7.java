package de.schueler.praktikum;

/*
Nutze if-else (google und lese dich ein, wie man if-else nutzt) um
folgendes zu erfüllen

Zufallszahl < 30         ---->  Ausgabe "Zufallszahl < 30"
30 <= Zufallszahl < 50  ---->  Ausgabe "30 <= Zufallszahl < 50"
50 <= Zufallszahl < 75  ---->  Ausgabe "50 <= Zufallszahl < 75"
sonst      ---->  Ausgabe "Sonstige Zahl"
*/

import java.util.Random;

public class Aufgabe7 {

    public static void main(String[] args) {
        var random = new Random();
        int zufallsZahl = random.nextInt(100);
        System.out.println("Zufallszahl = " + zufallsZahl);



    }
}
