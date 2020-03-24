package PA06;

import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label; // we’re drawing regular polygons
    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    JLabel sidesLabel; // no. of sides text
    JLabel sizeLabel; // size text
    JSpinner sizeField; // input size

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(3, 3, 100, 1)); //min 3 sides
        sidesField.setValue(6); //default number of sides
        sizeLabel = new JLabel("Size:");
        sizeField = new JSpinner(new SpinnerNumberModel(0,0,150,1));
        sizeField.setValue(20);

        //create the colorCombo, containing the values: Random and Black
        String[] colors = {"Random", "Black", "Blue"};
        colorCombo = new JComboBox(colors);

        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(sizeLabel);
        add(sizeField);
        add(colorCombo);
    }
}
