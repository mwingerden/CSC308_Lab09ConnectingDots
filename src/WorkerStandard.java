import java.awt.*;
import java.util.List;

public class WorkerStandard implements Worker{
    public final int MAXNUMBEROFVALUES = 20;

    @Override
    public void draw(Graphics g, List values) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < values.size(); i+=1){
            if(i == 0){
                g.fillRect(500 / MAXNUMBEROFVALUES * i,
                        (int)values.get(i),
                        1,
                        1);
            }
            else{
                g.drawLine(
                        500/ MAXNUMBEROFVALUES * (i -1),
                        (int)values.get(i-1),
                        500/ MAXNUMBEROFVALUES * i,
                        (int)values.get(i)
                );
            }
        }
    }
}
