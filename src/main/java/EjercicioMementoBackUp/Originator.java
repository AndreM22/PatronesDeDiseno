package EjercicioMementoBackUp;


public class Originator {
    private BackUp state;

    public void setState(BackUp state) {
        System.out.println("**** Set State *****");
        state.mostrarInfo();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("**** Create State *****");
        state.mostrarInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.mostrarInfo();
    }
}
