import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;
import java.applet.Applet;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.*;


public class GUI implements ActionListener{

  int count = 0;
  JLabel label;
  JFrame frame;
  JPanel panel;


  public GUI() {
    frame = new JFrame();

    JButton button = new JButton("Click");
    button.addActionListener(this);


    label = new JLabel("Clicks: 0");



    panel = new JPanel();

    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);

    frame.add(panel );
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("name");
    frame.pack();
    frame.setVisible(true);


  }



  public static void main(String[] args) {
    new GUI();
  }

  public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of clicks " + count);

  }

}
