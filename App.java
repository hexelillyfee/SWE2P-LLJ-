//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class App {
    public static void main(String[] args) {
        Studierender moritz = new Studierender("Moritz", "00175252", "WINF-B");
        Dozierender kroeninger = new Dozierender("Jutta Kröninger", "I", "B203", 16);


        moritz.frageStellen(kroeninger, "Wo ist ihr Büro?");
        kroeninger.frageBeantworten(moritz, "Raum B203");

        moritz.sprechstundeAnfrage(kroeninger, 16);

        moritz.feedbackAbgeben(kroeninger, 9);
        moritz.feedbackAbgeben(kroeninger, 4);
        moritz.feedbackAbgeben(kroeninger, 7);

        kroeninger.printFeedbackDurchschnitt();

    }
}
