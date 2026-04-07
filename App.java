public class App {
    public static void main(String[] args) {
        Studierender paul = new Studierender("Paul", "00000001", "UXD");
        Studierender max = new Studierender("Max", "00000002", "UXD");
        Studierender anna = new Studierender("Anna", "00000003", "UXD");
    
        Dozierender bauer = new Dozierender("Prof. Bauer", "Informatik", "Büro 001", 10);

    System.out.println("--Frage Stellen--------------------------------------\n---\n");
        paul.frageStellen(bauer, "Sind Sie Fußballfan?");
        bauer.frageBeantworten(anna, "Ja");

        max.frageStellen(bauer, "Was ist Prüfungsrelevant?");
        bauer.frageBeantworten(max, "Prüfungsrelevant sind alle Vorlesungen und Übungsblätter.");

     System.out.println("\n---\n--Sprechstunden--------------------------------------\n---");
        max.sprechstundeAnfrage(bauer, 10);

    //Abgabe von Feedback
        System.out.println("\n---\n--Feedback-------------------------------------------\n---");
        max.feedbackAbgeben(bauer, 9);
        paul.feedbackAbgeben(bauer, 5);
        anna.feedbackAbgeben(bauer, 7);

        //Durschnitt des Feedbacks abfragen
        bauer.printFeedbackDurchschnitt();

        //erstellen einer lehrveranstaltung
        System.out.println("\n---\n--Lehrveranstaltungen--------------------------------\n---");
        Lehrveranstaltung gestaltung = new Lehrveranstaltung("Gestaltung", bauer, 2); 
        
        anna.lehrveranstaltungAnmeldung(gestaltung);
        max.lehrveranstaltungAnmeldung(gestaltung);
        paul.lehrveranstaltungAnmeldung(gestaltung);

       
        anna.lehrveranstaltungAbmeldung(gestaltung);
        paul.lehrveranstaltungAnmeldung(gestaltung);

        gestaltung.addVorlesungsstunde("Gestaltgesetze", "20.04.2026", "9:15", "G116");
        gestaltung.addVorlesungsstunde("Icons", "27.04.2026", "9:15", "G116");
        
        
        String[] praktikumsaufgaben ={"UI Beispiele für Gestaltgesetze finden" , "Moodboard erstellen"};
        gestaltung.addPraktikumsstunde("Gestaltgesetze", "21.04.2026", "9:00", "G116", praktikumsaufgaben);
        
        
        gestaltung.showDetails();
    }
}

    
    
