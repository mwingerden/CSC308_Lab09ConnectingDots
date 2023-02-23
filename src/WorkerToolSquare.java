import java.awt.*;
import java.util.List;

public class WorkerToolSquare extends WorkerTool {
    private static final int POINT_HEIGHT = 10;
    private static final int POINT_WIDTH = 10;
    public final int MAX_NUMBER_OF_VALUES = 20;

    public void draw(Graphics g, List<Integer> values) {
        g.setColor(Color.BLACK);
        for(int index = 0; index < values.size(); index += 1) {
            g.fillRect(
                    (500 / MAX_NUMBER_OF_VALUES * index) - (POINT_WIDTH / 2),
                    (int) values.get(index) - (POINT_HEIGHT / 2),
                    POINT_WIDTH,
                    POINT_HEIGHT

            );
        }
        super.draw(g, values);
    }
}
