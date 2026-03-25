public class Dozierender {
    private String name;
    private String fakultaet;
    private String bueronummer;


    public Dozierender(String name, String fakultaet, String bueronummer){
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public String getName(){
        return name;
    }


    public void frageBeantworten(Studierender studierender, String antwort){
        System.out.println("Antwort an " + studierender.getName() + ": " + antwort);
    }
}
