import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        //basic frame
        JFrame frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        //set up grid bag values
        GridBagConstraints gb = new GridBagConstraints();
        gb.fill = GridBagConstraints.BOTH;
        gb.weighty = 1;
        gb.weightx = 1;

        //create originalImage  panel
        JPanel originalImage = new JPanel();
        originalImage.setLayout(new GridBagLayout());
        originalImage.setSize(100,100);
        originalImage.setBackground(Color.BLUE);

        //add originalImage to the frame
        gb.gridy = 0;
        gb.gridx = 0;
        gb.gridwidth = 2;
        frame.add(originalImage, gb);

        //create controlPanel  panel
        JPanel controlPanel = controls();
        controlPanel.setBackground(Color.yellow);

        //add controlPanel to the frame
        gb.gridy = 0;
        gb.gridx = 2;
        gb.gridwidth = 1;
        gb.weighty = 0;
        gb.weightx = 0;
        frame.add(controlPanel, gb);

        //create newImage  panel
        JPanel newImage = new JPanel();
        newImage.setLayout(new GridBagLayout());
        newImage.setSize(100,100);
        newImage.setBackground(Color.RED);

        //add originalImage to the frame
        gb.gridy = 0;
        gb.gridx = 3;
        gb.gridwidth = 2;
        gb.weighty = 1;
        gb.weightx = 1;
        frame.add(newImage, gb);


        //show the frame
        //frame.pack();
        //frame.setSize(250,250);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static JPanel controls() {

        //set up grid bag values
        GridBagConstraints gb = new GridBagConstraints();
        gb.fill = GridBagConstraints.BOTH;
        gb.weighty = 0;
        gb.weightx = 0;

        JPanel controls = new JPanel();
        controls.setLayout(new GridBagLayout());
        controls.setSize(100,100);
        controls.setBackground(Color.yellow);


        JButton startStopButton = new JButton("Start/Stop");

        gb.gridy = 0;
        gb.gridx = 0;
        controls.add(startStopButton, gb);

        return  controls;

    }
}
