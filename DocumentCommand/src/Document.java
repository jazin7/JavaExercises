import java.io.File;

public class Document {
    private File file;

    public Document(String path){
        this.file = new File(path);
    }

    public void open(){
        System.out.println("File opened!");
    }

    public void save(){
        System.out.println("File saved!");
    }

    public String getFilePath(){
        return file.toString();
    }
}
