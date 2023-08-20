public class Magier implements Charakter{

    private int tp = 8;
    private int rw = 3;
    private String klasse = "Magier";

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
