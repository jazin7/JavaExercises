public class Main {
    public static void main(String[] args) {
        Haustier haustier = new Haustier();

        haustier.getCurrentState().trainieren();
        haustier.getCurrentState().spielen();
    }
}