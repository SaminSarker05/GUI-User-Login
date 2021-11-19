import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
import java.applet.Applet;

public class GUI implements ActionListener{

  int tries = 3;
  JLabel label01, label02, label;
  JFrame frame;
  JPanel panel;
  JButton button;
  JTextField user, pass;

  public GUI() {

    frame = new JFrame();
    panel = new JPanel();
    frame.setSize(350,200);

    label01 = new JLabel("Username:");
    label01.setBounds(10,50,80,25);
    panel.add(label01);

    user = new JTextField(20);
    user.setBounds(100,20,165,25);
    panel.add(user);

    label02 = new JLabel("Password:");
    label02.setBounds(10,50,80,25);
    panel.add(label02);

    pass = new JPasswordField(10);
    pass.setBounds(100,50,165,25);
    panel.add(pass);

    button = new JButton("Enter");
    panel.add(button);
    button.addActionListener(this);

    label = new JLabel("3 attempts left");
    panel.add(label);

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new GUI();
  }

  public void actionPerformed(ActionEvent e) {

    if (user.getText().equals("admin") && pass.getText().equals("123")) {
      label.setText("login sucessful");
    } else {
      tries--;
      if (tries == 0) {
        System.exit(0);
      }
      label.setText(tries + " attempts left");
    }
  }
  
}
