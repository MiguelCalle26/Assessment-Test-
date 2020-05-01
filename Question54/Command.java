public class Command extends BasicCommand implements SoftDeleting{


    //Emplenado metodo deleteMethod del Trait SoftDeleting
    public void mensajeEliminado(){

        deleteMethod();
    }

    public Command(String command) {
        super(command);
    }
}
