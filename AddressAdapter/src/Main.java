public class Main {
    public static void main(String[] args) {
    AddressValidator validator = new DEAdresse();
    System.out.println(validator.istGueltig("12345678900", "12345","123"));


    AddressValidator validator2 = new USAddressAdapter();

    System.out.println(validator2.istGueltig("1234567890ß","12345","12"));

    }
}