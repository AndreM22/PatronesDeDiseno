package EjercicioMementoYObserverGit;

import java.util.ArrayList;
import java.util.List;

public class Commits {
    private List<Memento> list= new ArrayList<>();

    public void addMemento(Memento m){
        list.add(m);
    }

    public Memento getVersion(int position){
        return list.get(position);
    }
}
