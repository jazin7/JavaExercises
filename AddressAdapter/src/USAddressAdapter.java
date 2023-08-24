public class USAddressAdapter extends USAddress implements AddressValidator{

    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return isValidUSAddress(adresse, plz, bundesland);
    }
}
