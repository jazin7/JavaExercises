import java.util.Date;

public class Nachricht {
    private Date uhrzeit;
    private String text;
    private String empfaenger;
    private String sender;


    public Nachricht(String text, String empfaenger, String sender){
        this.text = text;
        this.empfaenger = empfaenger;
        this.sender = sender;
        this.uhrzeit = new Date();
    }

    public Date getUhrzeit(){
        return this.uhrzeit;
    }
    public String getText(){
        return this.text;
    }

    public String getEmpfaenger(){
        return this.empfaenger;
    }

    public String getSender(){
        return this.sender;
    }

}
