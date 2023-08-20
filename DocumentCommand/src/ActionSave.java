public class ActionSave implements ActionListenerCommand{
    private Document document;

    public ActionSave(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("Dokument wurde gespeichert! " + this.document.getFilePath());
        this.document.save();
    }
}
