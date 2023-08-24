public class SchlechtGelauntState extends YamaState{
    public SchlechtGelauntState(Haustier haustier) {
        super(haustier);
    }

    @Override
    public void spielen() {
        haustier.changeState(new FroehlichState(haustier));
    }

    @Override
    public void fuettern() {
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void trainieren() {
        //TBD
    }

    @Override
    public void nichtsTun() {
        //TBD
    }

    @Override
    public void onEntry() {
        System.out.println("Dein Yamagochi ist schlecht gelaunt!");
        System.out.println("Energie: " + haustier.getEnergie() + ", Hungerlevel: " + haustier.getHunger() + ", Trainingslevel: " + haustier.getTraining());
        haustier.setHunger(haustier.getHunger()+1);
        haustier.setEnergie(haustier.getEnergie()-2);
    }
}
