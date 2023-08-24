public class Haustier {
    private int energie;
    private int hunger;
    private int training;

    private YamaState currentState;
    private String name = "Yamagochi";


    public Haustier() {
        changeState(new FroehlichState(this)); //mit dem FrohehlichState beginnen
    }

    public YamaState getCurrentState() {
        return currentState;
    }

    public void changeState(YamaState newState) {
        if (newState != null){
            this.currentState = newState;
            newState.onEntry();
        }
    }

    public int getEnergie() {
        return energie;
    }
    public void setEnergie(int energie) {
        this.energie = energie;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getTraining() {
        return training;
    }
    public void setTraining(int training) {
        this.training = training;
    }
}
