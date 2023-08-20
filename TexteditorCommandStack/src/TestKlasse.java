public class TestKlasse {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("test ");
        AppendTextCommand cmd1 = new AppendTextCommand(editor, "more text");
        AppendTextCommand cmd2 = new AppendTextCommand(editor, "...even more text!");

        CommandManager manager = new CommandManager();
        System.out.println(editor.getText());
        manager.executeCommand(cmd1);
        manager.executeCommand(cmd2);
        manager.undo();
    }
}