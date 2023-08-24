public class SchlafendState extends YamaState{
    public SchlafendState(Haustier haustier) {
        super(haustier);
    }

    @Override
    public void spielen() {
        //TBD
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
        System.out.println("Dein Yamagochi ist am Schlafen!");
        System.out.println("Energie: " + haustier.getEnergie() + ", Hungerlevel: " + haustier.getHunger() + ", Trainingslevel: " + haustier.getTraining());
        haustier.setHunger(haustier.getHunger()+1);
        haustier.setEnergie(haustier.getEnergie()+4);
    }
}
