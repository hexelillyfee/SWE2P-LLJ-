public class Lehrveranstaltung {
    
    private String titel;
    private Dozierender dozent;
    private Studierender[] teilnehmerliste;
    private Vorlesungsstunde[] vorlesungsstunden = new Vorlesungsstunde[5]; 
    private Praktikumsstunde[] praktikumsstunden = new Praktikumsstunde[5]; 
    Lehrveranstaltung(String titel, Dozierender dozent, int teilnehmeranzahl){
        this.titel = titel;
        this.dozent = dozent;
        this.teilnehmerliste = new Studierender[teilnehmeranzahl];
    }

    public void addTeilnehmer(Studierender teilnehmer){
        System.out.println("\nKursname: " + this.titel);
        for(int i = 0; i < this.teilnehmerliste.length; i++){
            if(teilnehmerliste[i] == null){
                teilnehmerliste[i] = teilnehmer;
                System.out.println("Hinzugefügter Teilnehmer: " + teilnehmer.getName());
                return;
            }
        }
        System.out.println("Der Kurs ist bereits voll. Es können keine weiteren Teilnehmer hinzugefügt werden.");
    }

    public void removeTeilnehmer(Studierender teilnehmer){
        System.out.println("\nKursname: " + this.titel);
        for(int i = 0; i < this.teilnehmerliste.length; i++){
            if(teilnehmerliste[i].getName().equals(teilnehmer.getName())){
                teilnehmerliste[i] = null;
                System.out.println("Entfernter Teilnehmer: " + teilnehmer.getName());
            }
        }
    }

    public void addVorlesungsstunde(String thema, String datum, String uhrzeit, String raum){
        for(int i = 0; i < this.vorlesungsstunden.length; i++){
            if(this.vorlesungsstunden[i] == null){
                vorlesungsstunden[i] = new Vorlesungsstunde(thema, datum, uhrzeit, raum); 
                System.out.println("\nNeue Vorlesungsstunde hinzugefügt für: \nKursname: " + this.titel);
                vorlesungsstunden[i].showDetails();
                return;
            }
        }
    }

    public void addPraktikumsstunde(String thema, String datum, String uhrzeit, String raum, String[] aufgaben){
        for(int i = 0; i < this.praktikumsstunden.length; i++){
            if(this.praktikumsstunden[i] == null){
                praktikumsstunden[i] = new Praktikumsstunde(thema, datum, uhrzeit, raum, aufgaben);
                System.out.println("\nNeue Praktikumsstunde hinzugefügt für: \nKursname: " + this.titel);
                praktikumsstunden[i].showDetails();
                return;
            }
        }
    }

    public void showDetails(){
        System.out.println("\nKursname: " + this.titel);
        System.out.println("Dozent: " + this.dozent.getName());
        System.out.print("Teilnehmer: ");
        for(int i = 0; i < this.teilnehmerliste.length; i++){
            if(teilnehmerliste[i] != null){
                System.out.print(this.teilnehmerliste[i].getName());
            }
        }
        System.out.println("\nVorlesungsstunden: ");
        for(int i = 0; i < this.vorlesungsstunden.length; i++){
            if(vorlesungsstunden[i] != null){
                System.out.println("\tVorlesungsstunde " + (i+1) +": ");
                vorlesungsstunden[i].showDetails();
            }
        }

        System.out.println("Praktikumsstunden: ");
        for(int i = 0; i < this.praktikumsstunden.length; i++){
            if(praktikumsstunden[i] != null){
                System.out.println("\tPraktikumsstunde " + (i+1) + ": ");
                praktikumsstunden[i].showDetails();
            }
        }
    }

}
