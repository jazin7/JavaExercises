public class WarenkorbTest {
    public static void main(String[] args) {


        Warenkorb test = new Warenkorb(new PaypalStrategie("testmail.com", "1234"));
        Warenkorb test2 = new Warenkorb(new KreditkartenStrategie("max mustermann", "123", "987", "1.1.2011"));

        test.zahle(50);
        test2.zahle(30);



    }
}