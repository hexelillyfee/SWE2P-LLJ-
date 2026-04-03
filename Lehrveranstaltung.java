public class Lehrveranstaltung {
    String titel;
    Dozierender dozent;
    Studierender[] teilnehmerliste;
    Vorlesungsstunde[] vorlesungsstunden;
    Praktikumsstunde[] praktikumsstunden;

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

}
