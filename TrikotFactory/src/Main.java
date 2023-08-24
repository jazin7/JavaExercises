public class Main {
    public static void main(String[] args) {
        AbstractTrikotFactory trikotFactory = new PORTrikotFactory();

        Trikot t = trikotFactory.erstelleTrikot("test", 7);
        t.drucke();

    }
}