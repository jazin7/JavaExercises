public class Waldlaeufer implements Charakter{
    private int tp = 20;
    private int rw = 10;
    private String klasse = "Waldlaeufer";


    @Override
    public int getRuestungswert() {
        return this.tp;
    }

    @Override
    public int getTrefferpunkte() {
        return this.rw;
    }

    @Override
    public String getBeschreibung() {
        return this.klasse;
    }
}
