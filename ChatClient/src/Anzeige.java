public class Anzeige implements IChatBeobachter{


    @Override
    public void aktualisieren(Nachricht nachricht) {
        System.out.println("Der Text kam um: " + nachricht.getUhrzeit() + ". Von: " + nachricht.getSender() + ". An: " + nachricht.getEmpfaenger() + ".");
        System.out.println("Der Text lautet: \n" + nachricht.getText());
    }

}
