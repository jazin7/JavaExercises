public class FroehlichState extends YamaState{
    public FroehlichState(Haustier haustier) {
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
        haustier.setTraining(haustier.getTraining()+1);
        haustier.changeState(new SchlechtGelauntState(haustier));
    }

    @Override
    public void nichtsTun() {
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
    public void onEntry() {
        System.out.println("Dein Yamagochi ist froehlich!");
        System.out.println("Energie: " + haustier.getEnergie() + ", Hungerlevel: " + haustier.getHunger() + ", Trainingslevel: " + haustier.getTraining());
        haustier.setHunger(haustier.getHunger()+1);
        haustier.setEnergie(haustier.getEnergie()-1);
    }
}
