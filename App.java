//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class App {
    public static void main(String[] args) {
        Studierender linus = new Studierender("Linus-Paul-Jasper", "00175252", "UXD-B");
        Dozierender nestler = new Dozierender("Prof. Dr. Simon Nester", "I", "B203", 16);

        linus.frageStellen(nestler, "Wo ist ihr Büro?");
        nestler.frageBeantworten(linus, "Raum B203");

        linus.sprechstundeAnfrage(nestler, 16);

        linus.feedbackAbgeben(nestler, 8);
        linus.feedbackAbgeben(nestler, 4);
        linus.feedbackAbgeben(nestler, 7);

    }
}
