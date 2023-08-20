import java.util.ArrayList;

public class ChatClient {

    ArrayList<IChatBeobachter> beobachter = new ArrayList<IChatBeobachter>();


    public void registriereBeobachter(IChatBeobachter beo){
        this.beobachter.add(beo);
    }
    public void entferneBeobachter(IChatBeobachter beo){
        beobachter.remove(beo);
    }

    public void benachrichtigeBeobachter(Nachricht nachricht){
        for (IChatBeobachter beo : this.beobachter){
            beo.aktualisieren(nachricht);
        }
    }

    public void schreibeNachricht(String text, String sender, String empfaenger){
        benachrichtigeBeobachter(new Nachricht(text, empfaenger, sender));
    }

}
