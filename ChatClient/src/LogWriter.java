import java.io.FileWriter;
import java.io.IOException;

public class LogWriter implements IChatBeobachter{

    @Override
    public void aktualisieren(Nachricht nachricht) {
        String dateiname = nachricht.getEmpfaenger() + ".txt";
        try {
            FileWriter fw = new FileWriter(dateiname);
            fw.append("Von: " + nachricht.getSender() + " um " + nachricht.getUhrzeit() + ". Text: \n" + nachricht.getText() + "\n");
            fw.close();
        }
        catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
