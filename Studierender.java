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

    public void sprechstundeAnfrage(){
        
    }
}
