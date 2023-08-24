public class SchlechtGelauntState extends YamaState{
    public SchlechtGelauntState(Haustier haustier) {
        super(haustier);
    }

    @Override
    public void spielen() {
        if (haustier.getHunger() > 10){
            haustier.changeState(new HungrigState(haustier));
        }
        else{
            if (haustier.getEnergie() <= 0){
                haustier.changeState(new SchlafendState(haustier));
            }
            else{
                haustier.changeState(new FroehlichState(haustier));
            }
        }
    }

    @Override
    public void fuettern() {
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void trainieren() {
        System.out.println("Nicht möglich, da es schlecht gelaunt ist!");
    }

    @Override
    public void nichtsTun() {
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void onEntry() {
        System.out.println("Dein Yamagochi ist schlecht gelaunt!");
        System.out.println("Energie: " + haustier.getEnergie() + ", Hungerlevel: " + haustier.getHunger() + ", Trainingslevel: " + haustier.getTraining());
        haustier.setHunger(haustier.getHunger()+1);
        haustier.setEnergie(haustier.getEnergie()-2);
    }
}
