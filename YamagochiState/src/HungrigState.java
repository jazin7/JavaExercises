public class HungrigState extends YamaState{
    public HungrigState(Haustier haustier) {
        super(haustier);
    }

    @Override
    public void spielen() {
        System.out.println("Nicht möglich, da es hungrig ist!");
    }

    @Override
    public void fuettern() {
        haustier.setHunger(0);
        haustier.changeState(new FroehlichState(haustier));
    }

    @Override
    public void trainieren() {
        System.out.println("Nicht möglich, da es hungrig ist!");
    }

    @Override
    public void nichtsTun() {
        haustier.changeState(new HungrigState(haustier));
    }

    @Override
    public void onEntry() {
        System.out.println("Dein Yamagochi ist hungrig!");
        System.out.println("Energie: " + haustier.getEnergie() + ", Hungerlevel: " + haustier.getHunger() + ", Trainingslevel: " + haustier.getTraining());
        haustier.setHunger(haustier.getHunger()+1);
        haustier.setEnergie(haustier.getEnergie()-1);
    }
}
