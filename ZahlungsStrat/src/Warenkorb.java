public class Warenkorb {
    private ZahlungsStrategie zahlungsStrategie;


    public Warenkorb(ZahlungsStrategie zahlungsStrategie){
        this.zahlungsStrategie = zahlungsStrategie;
    }

    public void zahle(int preis){
        zahlungsStrategie.zahle(preis);
    }
}
