//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class App {
    public static void main(String[] args) {
        //Erstellen von Studierenden
        Studierender moritz = new Studierender("Moritz", "00000001", "UXD-B");
        Studierender antonia = new Studierender("Antonia", "00000002", "UXD-B");
        Studierender sophia = new Studierender("Sophia", "00000003", "UXD-B");
        //Erstellen von Studenten
        Dozierender kroeninger = new Dozierender("Jutta Kröninger", "I", "B203", 16);

        //Frage stellen und Antwort bekommen
        System.out.println("--Frage Stellen--------------------------------------\n---\n");
        sophia.frageStellen(kroeninger, "Was ist ihr Lieblingstier?");
        kroeninger.frageBeantworten(sophia, "Hasen");

        //senden einer Sprechstundenanfrage
        System.out.println("\n---\n--Sprechstunden--------------------------------------\n---");
        moritz.sprechstundeAnfrage(kroeninger, 16);

        //Abgabe von Feedback
        System.out.println("\n---\n--Feedback-------------------------------------------\n---");
        moritz.feedbackAbgeben(kroeninger, 9);
        antonia.feedbackAbgeben(kroeninger, 5);
        sophia.feedbackAbgeben(kroeninger, 7);

        //Durschnitt des Feedbacks abfragen
        kroeninger.printFeedbackDurchschnitt();

        //erstellen einer lehrveranstaltung
        System.out.println("\n---\n--Lehrveranstaltungen--------------------------------\n---");
        Lehrveranstaltung gestaltung = new Lehrveranstaltung("Gestaltung", kroeninger, 2); //Maximale Teilnehmeranzahl aktuell nur 2 (demonstrationszwecke)
        //für Lehrveranstaltung anmelden
        sophia.lehrveranstaltungAnmeldung(gestaltung);
        moritz.lehrveranstaltungAnmeldung(gestaltung);
        antonia.lehrveranstaltungAnmeldung(gestaltung);

        //entfernen von Teilnehmern
        sophia.lehrveranstaltungAbmeldung(gestaltung);
        antonia.lehrveranstaltungAnmeldung(gestaltung);

        //erstellen von Vorlesungsstunden
        gestaltung.addVorlesungsstunde("Gestaltgesetze", "20.04.2026", "9:15", "G116");
        gestaltung.addVorlesungsstunde("Icons", "27.04.2026", "9:15", "G116");
        
        //erstellen von Praktikumsstunden
        String[] praktikumsaufgaben ={"UI Beispiele für Gestaltgesetze finden" , "Moodboard erstellen"};
        gestaltung.addPraktikumsstunde("Gestaltgesetze", "21.04.2026", "9:00", "G116", praktikumsaufgaben);
        
        //Details einer Lehrveranstaltung abfragen
        gestaltung.showDetails();
    }
}
