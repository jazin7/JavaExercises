public class Benutzer {
    public static void main(String[] args) {
        Document doc = new Document("test.txt");
        ActionListenerCommand commandOpen = new ActionOpen(doc);
        ActionListenerCommand commandSave = new ActionSave(doc);

        MenuOptionen options = new MenuOptionen(commandOpen,commandSave);

        options.clickOpen();
        options.clickSave();
    }
}