public class TrankDesBarbaren extends TrankEffektDecorator {

    private static final String beschreibung = "Trank des Barbaren";
    public TrankDesBarbaren(Charakter c) {
        super(c, beschreibung);
    }

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert() - 5;
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte() + 5;
    }

    @Override
    public String getBeschreibung() {
        return c.getBeschreibung() + " : Trank des Barbaren";
    }
}
