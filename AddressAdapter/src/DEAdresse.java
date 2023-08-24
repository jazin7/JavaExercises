import org.w3c.dom.ls.LSOutput;

public class DEAdresse implements AddressValidator{
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        if (adresse.length() < 10){
            return false;
        }
        if (plz.length() != 5){
            return false;
        }
        if (bundesland.length() != 2 && bundesland.length() != 3){
            return false;
        }
        return true;
    }
}