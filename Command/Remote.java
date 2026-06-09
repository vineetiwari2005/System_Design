package Command;

public class Remote {
    Command command;
    public Remote(Command command){
        this.command=command;
    }
    public void ExecuteTheRemote(){
        command.execute();
    }
    public void RevertBackTheChanges(){
        command.undo();
    }
    
}
