public  class Dozenten  {
    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozenten(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }
    public String getName() {
        return name;
    }
    public void frageBeantworten(String frage, Studierender studierender) {
        System.out.println("Antwort von " + this.name + " an " + studierender.getName() + ": " + frage);
    }    
}
