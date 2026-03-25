public class App {
    public static void main(String[] args) {
        Studierender linus = new Studierender("Linus-Paul-Jasper", "00175252", "UXD-B");
        Dozierender nestler = new Dozierender("Prof. Dr. Simon Nester", "I", "B203");

        linus.frageStellen(nestler, "Wo ist ihr Büro?");
        nestler.frageBeantworten(linus, "Raum B203");
    }
}
