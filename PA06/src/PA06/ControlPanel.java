package PA06;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    //create all buttons (Load, Reset, Exit)
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        //add all buttons
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);

    }
    private void save(ActionEvent e) {
        JFileChooser saver = new JFileChooser();
        saver.setDialogTitle("Select a location to save the image");
        int userSelection = saver.showSaveDialog(frame.canvas);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File savedFile = saver.getSelectedFile();
            try {
                ImageIO.write(frame.canvas.image, "PNG", savedFile);
            } catch (IOException ex) { System.err.println(ex); }
        }
    }

    private void load(ActionEvent e) {
        JFileChooser loader = new JFileChooser();
        loader.setDialogTitle("Select an image to load");
        int userSelection = loader.showOpenDialog(frame.canvas);
        if (userSelection == JFileChooser.APPROVE_OPTION) {

            try {
                File file = loader.getSelectedFile();
                frame.canvas.image = ImageIO.read(new File(file.getAbsolutePath()));
                frame.canvas.graphics = frame.canvas.image.createGraphics();
                frame.canvas.repaint();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }

    private void reset(ActionEvent e) {
        frame.canvas.image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        frame.canvas.graphics = frame.canvas.image.createGraphics();
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, 800, 600);
        frame.canvas.repaint();
    }

    private void exit(ActionEvent e) {
        System.exit(0);
    }

}