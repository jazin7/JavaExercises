import java.util.ArrayList;

public class Directory implements FileSystemComponent{
    private String name;
    private ArrayList<FileSystemComponent> dirContents = new ArrayList<FileSystemComponent>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name + ":");
        for (FileSystemComponent component : dirContents){
            component.print();
        }
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystemComponent component : dirContents){
            size += component.getSize();
        }
        return size;
    }

    public void add(FileSystemComponent component){
        dirContents.add(component);
    }

    public void remove(FileSystemComponent component){
        dirContents.remove(component);
    }

}
