public class App {
    public static void main(String[] args) {
        Studierender studierender1 = new Studierender("Linus Vogelsang", "123456", "UXD");
        Dozenten dozent1 = new Dozenten("Prof. Nestler", "Informatik", "Büro 001");


        studierender1.frageStellen("Was ist Prüfungsrelevant?", dozent1);
        dozent1.frageBeantworten("Prüfungsrelevant sind alle Vorlesungen und Übungsblätter.", studierender1);
    }
    // moin
}