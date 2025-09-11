package de.allianz.praktikum.basics;

/**
 * Implementiere zwei Methoden, die genutz werden können, um in einem Array die kleinste und größte Zahl zu finden.
 * Google was in Java ein Methode ist und wie diese funktioniert.
 * Die Signatur der Methode soll wie folgt aussehen:
 *
 * public static double minimum(double[] numbers) { }
 * public static double maximum(double[] numbers) { }
 *
 * Rufe die Methoden mit den 3 Arrays "myNumbers1", "myNumbers2", "myNumbers3" (siehe unten) auf
 * und gebe das Ergebnis der Methode in der Konsole aus.
 *
 * Prüfe, ob das Ergebnis stimmt.
 * Diskutiere mit deinem Praktikumsbetreuer, welche Vorteile eine Methode hat.
 *
 */
public class Aufgabe19 {

    public static void main(String[] args) {
        int[] myNumbers = {9, 3, 2, 8, 11, 6, 7, 5, 4, 10};
        int[] myNumbers2 = {6, 10, 2, 5, 9, 3};
        int[] myNumbers3 = {1};
        int minimum1 =  minimum(myNumbers);
        int minimum2 =  minimum(myNumbers2);
        int minimum3 =  minimum(myNumbers3);
        System.out.println("Das Minimum von myNumbers ist: " + minimum1);
        System.out.println("Das Minimum von myNumbers2 ist: " + minimum2);
        System.out.println("Das Minimum von myNumbers3 ist: " + minimum3);


        int maximum1 =  maximum(myNumbers);
        int maximum2 =  maximum(myNumbers2);
        int maximum3 =  maximum(myNumbers3);
        System.out.println("Das Maximum von myNumbers ist: " + maximum1);
        System.out.println("Das Maximum von myNumbers2 ist: " + maximum2);
        System.out.println("Das Maximum von myNumbers3 ist: " + maximum3);
    }

    private static int minimum(int[] numbers) {
        int aktuellesMinimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (aktuellesMinimum > numbers[i]) {
                aktuellesMinimum = numbers[i];
            }
        }
        return aktuellesMinimum;
    }

    private static int maximum(int[] numbers) {
        int aktuellesMaximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (aktuellesMaximum < numbers[i]) {
                aktuellesMaximum = numbers[i];
            }
        }
        return aktuellesMaximum;
    }

}
