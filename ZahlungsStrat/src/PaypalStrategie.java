public class PaypalStrategie implements ZahlungsStrategie{
    private String email;
    private String password;

    public PaypalStrategie(String email, String password){
        this.email = email;
        this.password = password;
    }
    @Override
    public void zahle(int preis) {
        System.out.println("Preis: " + preis + " € von: " + email + ".");
    }
}
