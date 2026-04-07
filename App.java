public class App {
    public static void main(String[] args) {
        Studierender paul = new Studierender("Paul", "00000001", "UXD");
        Studierender max = new Studierender("Max", "00000002", "UXD");
        Studierender anna = new Studierender("Anna", "00000003", "UXD");
    
        Dozierender bauer = new Dozierender("Prof. Bauer", "Informatik", "Büro 001", 10);

    System.out.println("- Frage Stellen -------------------------------------\n---\n");
        paul.frageStellen(bauer, "Ist an Ostern Vorlesungsfrei?");
        bauer.frageBeantworten(anna, "Ja");

        max.frageStellen(bauer, "Was ist Prüfungsrelevant?");
        bauer.frageBeantworten(max, "Prüfungsrelevant sind alle Vorlesungen und Übungsblätter.");

     System.out.println("\n---\n- Sprechstunden -------------------------------------\n---");
        max.sprechstundeAnfrage(bauer, 10);

    
        System.out.println("\n---\n- Feedback -------------------------------------------\n---");
        max.feedbackAbgeben(bauer, 10);
        paul.feedbackAbgeben(bauer, 6);
        anna.feedbackAbgeben(bauer, 8);

       
        bauer.printFeedbackDurchschnitt();

        
        System.out.println("\n---\n- Lehrveranstaltungen --------------------------------\n---");
        Lehrveranstaltung gestaltung = new Lehrveranstaltung("Gestaltung", bauer, 2); 
        
        anna.lehrveranstaltungAnmeldung(gestaltung);
        max.lehrveranstaltungAnmeldung(gestaltung);
        paul.lehrveranstaltungAnmeldung(gestaltung);

       
        anna.lehrveranstaltungAbmeldung(gestaltung);
        paul.lehrveranstaltungAnmeldung(gestaltung);

        gestaltung.addVorlesungsstunde("Gestaltgesetze", "12.04.2026", "8:15", "G116");
        gestaltung.addVorlesungsstunde("Icons", "20.04.2026", "9:15", "G116");
        
        
        String[] praktikumsaufgaben ={"Gute unde schlechte UI Beispiele im mobile Design finden" , "Beispiele festhalten"};
        gestaltung.addPraktikumsstunde("UI Design", "21.04.2026", "9:00", "G116", praktikumsaufgaben);
        
        
        gestaltung.showDetails();
    }
}

    
    
