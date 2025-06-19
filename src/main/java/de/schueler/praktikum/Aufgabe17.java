package de.schueler.praktikum;

import java.util.Random;
import java.util.Scanner;

/*
Schreibe ein Programm, dass zunächst eine Zahl einliest. Mit der eingelesen Zahl soll ein Array mit dieser Größe erstellt werden.
Dann soll das Array mit zufälligen Zahlen (maximalwerte 20) gefüllt werde. Eine Zufallszahl mit einem max. Wert 20 kann wie in Aufgabe 8 erzeugt werdem:
var random = new Random();
var zufallsZahl = random.nextInt(20);

Dann soll der Nutzer versuchen eine beliebige Zahl aus dem Array zu erraten.
Wenn er falsch rät, bekommt er einen Hinweis, dass er falsch lag und darf er nochmal raten.
Wenn er richtig rät, bekommt er einen Hinweis, dass er richtig lag.
Zusätzlich wird ausgegeben, wieviele Versuche er benötigt hat um eine Zahl zu erraten und welche Zahlen im Array waren.


Beispiel für den Input und output des Programms:
================================================

Wieviele Zahlen bis 20 soll das Array beinhalten?
3
Versuchen Sie eine Zahl zu erraten:
8
Leider falsch.
Versuchen Sie eine Zahl zu erraten:
9
Leider falsch.
Versuchen Sie eine Zahl zu erraten:
13
Richtig geraten!
Folgende Zahlen waren im Array: 1 5 9 13 18
Sie haben 3 Versuche benötigt.


 */
public class Aufgabe17 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Wieviele Zahlen bis 20 soll das Array beinhalten?");
        int groesseArray = scanner.nextInt();

    }
}
