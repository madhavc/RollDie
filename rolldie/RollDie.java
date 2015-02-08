package rolldie;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RollDie  {
    JLabel label;
    JFrame frame;
    JTextField textField;
    final String [] sequences = new String[]{".","..","...","::",":..:",":::"};
    Timer timer;
    RollDie(){
        frame = new JFrame("Die_Roll");
        frame.setSize(150,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField("");
        textField.setHorizontalAlignment(JTextField.CENTER);
        Random random = new Random();
        
        timer = new Timer(300, new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                int randomDice = random.nextInt(6);
                textField.setText(sequences[randomDice]);
            }
        });
        frame.add(textField);
        frame.setVisible(true);
        timer.start();  
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new RollDie();
            }
        } );
    }
    
}
