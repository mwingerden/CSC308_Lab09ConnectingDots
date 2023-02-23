import java.awt.*;
import java.util.List;

public class WorkerTool implements Worker{
    protected Worker worker;

    public void add(Worker d){
        worker = d;
    }

    @Override
    public void draw(Graphics g, List<Integer> values) {
        worker.draw(g, values);
    }
}
