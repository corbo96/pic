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

        JPanel originalImage = new JPanel();
        originalImage.setLayout(new GridBagLayout());
        originalImage.setSize(100,100);
        originalImage.setBackground(Color.BLUE);

        gb.gridy = 0;
        gb.gridx = 0;

        frame.add(originalImage, gb);
        frame.pack();
        frame.setSize(250,250);
        frame.setVisible(true);


    }
}
