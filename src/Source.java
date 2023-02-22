import java.util.Observable;

public class Source extends Observable {
    private int value;
    private static final int MAX_VALUE = 250;

    public void create() {
        value = (int) Math.ceil(Math.random() * MAX_VALUE);
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return value;
    }
}
