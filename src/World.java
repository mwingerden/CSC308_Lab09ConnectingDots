import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class World extends JFrame implements ActionListener {
    private Source source;
    private PlotPanel top, mid, bot;

    public World() {
        super("Design Patterns");

        WorkerStandard worker1 = new WorkerStandard();
        WorkerToolLine toolLine = new WorkerToolLine();
        WorkerToolSquare toolSquare = new WorkerToolSquare();
        toolLine.add(toolSquare);
        toolSquare.add(worker1);
        top = new PlotPanel(toolLine);
        top.setBackground(Color.WHITE);

        WorkerStandard worker2 = new WorkerStandard();
        WorkerToolSquare toolSquare2 = new WorkerToolSquare();
        toolSquare2.add(worker2);
        mid = new PlotPanel(toolSquare2);
        mid.setBackground(Color.LIGHT_GRAY);

        WorkerStandard worker3 = new WorkerStandard();
        bot = new PlotPanel(worker3);
        bot.setBackground(Color.GRAY);

        JButton button = new JButton("Run");
        button.addActionListener(this);

        setLayout(new GridLayout(4,1));
        add(top);
        add(mid);
        add(bot);
        add(button);

        source = new Source();
        source.addObserver(top);
        source.addObserver(mid);
        source.addObserver(bot);
    }

    public static void main(String[] args) {
        World world = new World();
        world.setSize(500,500);
        world.setVisible(true);
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        source.create();
    }
}