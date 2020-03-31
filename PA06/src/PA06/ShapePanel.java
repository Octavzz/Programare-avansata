package PA06;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ShapePanel extends JPanel {
    final MainFrame frame;
    JLabel shapeLabel; // Shape text
    JComboBox shapeCombo;

    public ShapePanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        String[] shapes = {"Custom", "Circle", "Triangle", "Square"};
        shapeLabel = new JLabel("Shapes:");
        shapeCombo = new JComboBox(shapes);
        add(shapeLabel);
        add(shapeCombo);
    }
}
