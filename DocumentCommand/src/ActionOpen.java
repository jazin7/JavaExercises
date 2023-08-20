public class ActionOpen implements ActionListenerCommand{
    private Document document;

    public ActionOpen(Document document){
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("Dokument wurde geöffnet!" + this.document.getFilePath());
        document.open();
    }
}
