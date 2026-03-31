//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class Studierender {
    private String name;
    private String matrikelnummer;
    private String studiengang;

    public Studierender(String name, String matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }


    public String getName(){
        return name;
    }

    public void frageStellen(Dozierender dozent, String frage){
        System.out.println("Frage an " + dozent.getName() + ": " + frage);
    }

    public void sprechstundeAnfrage(Dozierender dozent, int sprechstundeUhrzeit){
        System.out.println("\nSprechstundenanfrage \nVon: " + this.name + "\nAn: " + dozent.getName() + "\nUm: " + sprechstundeUhrzeit + " Uhr");
        dozent.sprechstundeAntwort(sprechstundeUhrzeit);
    }

    public void feedbackAbgeben(Dozierender dozent, int bewertung){
        System.out.println("\nAbgegebene Bewertung: " + bewertung + "/10 \nVon: " + this.name + "\nAn: " + dozent.getName());
        dozent.feedbackBekommen(bewertung);
    }

}
