public class BasicCommand implements SoftDeleting{

    private String command;

    public BasicCommand(String command) {
        this.command = command;
    }

    // Emplenado metodo deleteMethod del Trait SoftDeleting
    public void usinDeletMethod(){

        deleteMethod();
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
