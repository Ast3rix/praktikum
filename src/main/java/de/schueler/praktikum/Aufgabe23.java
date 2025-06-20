package de.schueler.praktikum;

/**
 * Rennschnecke:
 * 1. Erstelle eine Klasse "Rennschnecke"
 * 2. Rennschnecken sollen folgende Eigenschaften(Objektvariablen) besitzen:
 *      - einen Namen
 *      - die Schnecke soll wissen welchen Weg sie bereits zurückgelegt hat
 * 3. Erstelle für die Klasse Rennschnecke einen passenden Konstruktor.
 * 4. Lege in der Klasse "Rennschnecke" eine Methode "krieche()" an,
 *      zufällig einen Kriechweg zwischen 1 und 10 cm zurück legt.
 *      var random = new Random();
 *      int zufallsZahl = random.nextInt(10);
 * 5. Lege in der Klasse "Rennschnecke" eine Methode "public String toString()" an, welche die Daten der Schnecke mit return als String zurückgibt.
 *
 *
 * Rennen:
 * 1. Erstelle eine Klasse "Rennen"
 * 2. Ein Rennen hat folgende Eigenschaften:
 *      - einen Namen
 *      - die Anzahl der teilnehmenden Schnecken
 *      - die teilnehmenden Schnecken selbst, als:
 *          ArrayList: schönere Umsetzung mit variabler Teilnehmerzahl
 *          Tipps:
 *              Verwende als Datentyp ArrayList<Rennschnecke>
 *              Verwende beim Erstellen new ArrayList<Rennschnecke>() die Länge der zu kriechenden Strecke ist 1000 cm
 * 3. Überlege dir, welche dieser Werte bereits im Konstruktor gesetzt werden sollten.
 * 4. Lege in der Klasse "Rennen" eine Methode "void addRennschnecke(Rennschnecke neueSchnecke)" an, welche dem Rennen eine Schnecke hinzufügt.
 * 5. Lege in der Klasse "Rennen" eine Methode "public String toString()" an, welche die Daten des Rennens mit return als String zurückgibt.
 *      Tipp: Um die Daten der beteiligten Schnecken zurückzugeben, könnt ihr deren toString() Funktion benutzen.
 * 6. Schreibe ein Main-Programm, dass ein Rennen startet. (siehe unten)
 * 7. Lege in der Klasse "Rennen" eine Methode "Rennschnecke ermittleGewinner()" an, welche null zurückliefert, wenn noch keine der teilnehmenden Schnecken das Ziel erreicht hat und anderenfalls die Gewinnerschnecke zurückgibt.
 * 8. Lege in der Klasse "Rennen" eine Methode "void lasseSchneckenKriechen()" an, welche ALLE teilnehmenden Schnecken EINMAL kriechen lässt.
 * 9. Lege in der Klasse "Rennen" eine Methode "void durchfuehren()" an, welche so lange lasseSchneckenKriechen() aufruft, bis eine der Schnecken das Ziel erreicht hat.
 *      Tipp: Ob eine Schnecke im Ziel angekommen ist, kannst du mit deiner Methode ermittleGewinner() herausfinden.
 */
public class Aufgabe23 {

    public static void main(String[] args) {


    }
}