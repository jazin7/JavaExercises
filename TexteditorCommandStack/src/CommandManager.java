import java.util.Stack;

public class CommandManager {
    private Stack<EditorCommand> undoItems = new Stack<>();

    public void executeCommand(EditorCommand cmd){
        undoItems.push(cmd);
        cmd.execute();
    }
    public void undo(){
        EditorCommand cmd = undoItems.pop();
        cmd.undo();
    }
}
