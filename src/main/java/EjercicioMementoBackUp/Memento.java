package EjercicioMementoBackUp;

public class Memento {
    private BackUp state;

    public Memento(BackUp stateSaved){
        this.state=stateSaved;
    }

    public BackUp getState() {
        return state;
    }
}
