//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;
    private int sprechstundeUhrzeit;
    int[] feedback = new int[20];
    double feedbackDurchschnitt;


    public Dozierender(String name, String fakultaet, String bueronummer, int sprechstundeUhrzeit){
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.sprechstundeUhrzeit = sprechstundeUhrzeit;
        for(int i = 0; i < this.feedback.length; i++){
            this.feedback[i] = -1;
        }
    }

    public String getName(){
        return name;
    }

    public void printFeedbackDurchschnitt(){
        System.out.println("\nAktueller Durschnitt der Bewertungen \nVon: " + this.name + "\nDurschnitt: " + this.feedbackDurchschnitt);
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
            System.out.println("Sprechstunde angenommen. \nRaum: " + this.bueronummer);
        }
    }

    public void feedbackBekommen(int bewertung){
        for(int i = 0; i < this.feedback.length; i++){
            if(this.feedback[i] == -1){
                this.feedback[i] = bewertung;
                feedbackDurchschnittBerechnen();
                break;
            }
            else if(i == ((this.feedback.length) -1)){
                System.out.println("Es kann kein weiteres Feedback aufgenommen werden;");
            }
        }
    }

    public void feedbackDurchschnittBerechnen(){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < this.feedback.length; i++){
            if(this.feedback[i] != -1){
                sum += feedback[i];
                count++;
            }
        }
        this.feedbackDurchschnitt = sum/count;
    }
}
