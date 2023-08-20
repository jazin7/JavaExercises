public class AppendTextCommand implements EditorCommand{

    private String textAlt;
    private String textToAppend;
    private TextEditor textEditor;

    public AppendTextCommand(TextEditor textEditor, String text){
        this.textEditor = textEditor;
        this.textAlt = textEditor.getText();
        textToAppend = text;
    }

    @Override
    public void execute() {
        textAlt = textEditor.getText();
        this.textEditor.aendereText(textEditor.getText() + textToAppend);
    }

    @Override
    public void undo() {
        textEditor.aendereText(textAlt);
    }
}
