package Memento;

/**
 * @author Kübra VARICI
 * Memento nesnesini saklayan yapı
 */
public class AngryBirdsCareTaker {
    public AngryBirdsMemento memento;

    public AngryBirdsMemento getMemento() {
        return memento;
    }

    public void setMemento(AngryBirdsMemento memento) {
        this.memento = memento;
    }
}
