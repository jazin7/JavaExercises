public class TextEditor {
    private String text;
    public TextEditor(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public void aendereText(String text){
        this.text = text;
        System.out.println("Text geändert: \n " + this.text);
    }
}
