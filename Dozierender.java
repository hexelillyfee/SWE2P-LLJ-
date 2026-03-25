public class Dozierender {
    private String name;
    private String fakultaet;
    private int bueronummer; 

    public Dozierender (String name, String fakultaet, int bueronummer){
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer; 
    } 

    public void frageBeantworten (Studierender studierender, String antwort){
        System.out.println(antwort);
    };

}
