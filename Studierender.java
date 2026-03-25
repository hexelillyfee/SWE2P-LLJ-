public  class Studierender {
    private String name;
    private String matrikelnummer;
    private String studiengang;

    public Studierender(String name, String matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    public String getName() {
        return name;
    }
    public void frageStellen(String frage, Dozenten dozent) {
        System.out.println("Frage von " + this.name + " an " + dozent.getName() + ": " + frage);
    }
    
}
