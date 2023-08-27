import java.io.File;
import java.io.FileNotFoundException;

public abstract class DatenHandler {
    public File file;

    public DatenHandler(File file) {
        this.file = file;
    }

    public Aktienkurs einlesen() throws FileNotFoundException {
        if(!validiereDateipfad()){
            System.out.println(this.file + " wurde nicht gefunden!");
            return null;
        }
        if (!validiereDateityp()){
            System.out.println(this.file + " hat den falschen Datentyp!");
            return null;
        }
        return transformiereDatei();
    }

    public boolean validiereDateipfad(){
        return file.exists();
    }

    public abstract boolean validiereDateityp();

    public abstract Aktienkurs transformiereDatei() throws FileNotFoundException;

}
