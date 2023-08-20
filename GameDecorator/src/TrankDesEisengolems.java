public class TrankDesEisengolems extends TrankEffektDecorator{

    private static final String beschreibung = "Trank des Eisengolem";
    public TrankDesEisengolems(Charakter c) {
        super(c, beschreibung);
    }

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert() * 2;
    }

    @Override
    public int getTrefferpunkte() {
        return c.getTrefferpunkte();
    }

    @Override
    public String getBeschreibung() {
        return c.getBeschreibung() + " : Trank des Eisengolem";
    }
}
