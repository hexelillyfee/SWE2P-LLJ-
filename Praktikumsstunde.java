public class Praktikumsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String[] aufgaben;

    Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String[] aufgaben){
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }


    public void showDetails(){
        System.out.println("\t\tThema: " + this.thema);
        System.out.println("\t\tDatum: " + this.datum);
        System.out.println("\t\tUhrzeit: " + this.uhrzeit + "Uhr");
        System.out.println("\t\tRaum: " + this.raum);
        System.out.println("\t\tAufgaben: ");
        for(int i = 0; i < this.aufgaben.length; i++){
            if(this.aufgaben[i] != null){
                System.out.println("\t\t\tAufgabe " + (i+1) + ": " + aufgaben[i]);
            }
        }
    }
}
