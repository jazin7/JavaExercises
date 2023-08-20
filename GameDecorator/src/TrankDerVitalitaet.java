public class TrankDerVitalitaet extends TrankEffektDecorator{

    private static final String beschreibung = "Trank der Vitalitaet";

    public TrankDerVitalitaet(Charakter c) {
        super(c, beschreibung);
    }


    public int getRuestungswert(){
        return c.getRuestungswert() + 10;
    }

    public int getTrefferpunkte(){
        return c.getTrefferpunkte();
    }

    @Override
    public String getBeschreibung() {
        return c.getBeschreibung() + " : Trank der Vitalitaet";
    }
}
