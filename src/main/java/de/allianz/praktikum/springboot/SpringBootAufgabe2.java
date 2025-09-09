package de.allianz.praktikum.springboot;

/**
 * Erweitere den HelloController um folgendes:
 * - POST /hello gibt "Hello {vorname} {name}!" zurück
 * - Die Daten (Vor- und Nachname) sollen aber im Post-Body, in einem JSON, übergeben werden.
 *      Beispiel:
 *      {
 *          "nachname": "Mustermann",
 *          "vorname": "Hans"
 *      }
 * - Erstelle für die Daten eine Klasse "Person", die als fields Vorname und Nachname enthält.
 * - Nutze die Person als RequestBody.
 * - Erstelle eine strukturierte Anwort (einen ResponseBody),
 *   der auch ein JSON zurück gibt und das Feld "greetings" enthält und als Wert die Nachricht "Hello {vorname} {name}!" zurück gibt.
 *   Test mit dem IntelliJ internen Tool "HTTP Client" (siehe https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html)
 *   siehe auch hello.http in src/test/resources/de/allianz/praktikum/springboot/hello.http
 *
 */
public class SpringBootAufgabe2 {

}
