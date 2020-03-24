package PA06;

import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel; //north
    ControlPanel controlPanel; //south
    DrawingPanel canvas; // center

    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);

        //arrange the components in the container (frame)
        //JFrame uses a BorderLayout by default

        add(configPanel, NORTH);
        add(controlPanel, SOUTH);
        add(canvas, CENTER); //this is BorderLayout.CENTER

        //invoke the layout manager
        pack();
    }
}