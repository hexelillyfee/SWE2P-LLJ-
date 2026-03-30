//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;
    private int sprechstundeUhrzeit;


    public Dozierender(String name, String fakultaet, String bueronummer, int sprechstundeUhrzeit){
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.sprechstundeUhrzeit = sprechstundeUhrzeit;
    }

    public String getName(){
        return name;
    }


    public void frageBeantworten(Studierender studierender, String antwort){
        System.out.println("Antwort an " + studierender.getName() + ": " + antwort);
    }

    public void sprechstundeAntwort(int uhrzeit){
        System.out.print("Antwort: ");
        if (uhrzeit != this.sprechstundeUhrzeit){
            System.out.println("Anfrage außerhalb der Sprechstundenzeiten");
            return;
        }
        else{
            System.out.println("Sprechstunde angenommen.");
        }

    }
}
