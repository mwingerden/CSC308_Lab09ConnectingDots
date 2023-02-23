import java.awt.*;
import java.util.List;

public class WorkerToolLine extends WorkerTool{
    private static final int BAR_WIDTH = 10;
    public final int MAX_NUMBER_OF_VALUES = 20;

    public void draw(Graphics g, List<Integer> values){
        g.setColor(Color.gray);
        for (int i = 0; i <values.size(); i++){
            g.fillRect(
                    (500/ MAX_NUMBER_OF_VALUES *i )  - (BAR_WIDTH/2),
                    (int)values.get(i),
                    BAR_WIDTH,
                    200 - (int) values.get(i)
            );
        }
        super.draw(g,values);
    }
}
