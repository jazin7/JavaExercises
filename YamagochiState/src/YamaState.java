public abstract class YamaState {
    protected Haustier haustier;
    public YamaState(Haustier haustier) {
        this.haustier = haustier;
    }

    public abstract void spielen();
    public abstract void fuettern();
    public abstract void trainieren();
    public abstract void nichtsTun();
    public abstract void onEntry();
}
