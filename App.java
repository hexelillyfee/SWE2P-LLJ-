//gemeinsam erarbeitet von Lilly Tischler, Joshua Merz und Lisa Müller

public class App {
    public static void main(String[] args) {
        Studierender moritz = new Studierender("Moritz", "00175252", "WINF-B");
        Studierender antonia = new Studierender("Antonia", "00175253", "INFO-B");
        Studierender sophia = new Studierender("Sophia", "006767", "WINF-B");
        Dozierender kroeninger = new Dozierender("Jutta Kröninger", "I", "B203", 16);


        sophia.frageStellen(kroeninger, "Was ist ihr Lieblingstier?");
        kroeninger.frageBeantworten(sophia, "Hasen");

        moritz.sprechstundeAnfrage(kroeninger, 16);

        moritz.feedbackAbgeben(kroeninger, 9);
        antonia.feedbackAbgeben(kroeninger, 5);
        sophia.feedbackAbgeben(kroeninger, 7);

        kroeninger.printFeedbackDurchschnitt();

    }
}
