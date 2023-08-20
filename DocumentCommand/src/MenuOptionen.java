public class MenuOptionen {
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptionen(ActionListenerCommand openCommand, ActionListenerCommand saveCommand){
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen(){
        openCommand.execute();
    }

    public void clickSave(){
        saveCommand.execute();
    }

}
