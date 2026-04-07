public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void showDetails(){
        System.out.println("\t\tThema: " + this.thema);
        System.out.println("\t\tDatum: " + this.datum);
        System.out.println("\t\tUhrzeit: " + uhrzeit + "Uhr");
        System.out.println("\t\tRaum: " + raum);
    }
}

