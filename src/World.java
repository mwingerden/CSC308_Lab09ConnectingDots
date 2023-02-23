import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class World extends JFrame implements ActionListener {
    private Source source;


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