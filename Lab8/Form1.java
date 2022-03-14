import java.awt.*;
import javax.swing.*;

public class Form1 {
    public Form1(){
        JFrame f = new JFrame("login");
        Container cp = f.getContentPane();
        cp.setLayout(new GridBagLayout());
    
        JLabel user = new JLabel("USER : ");
        JLabel pass = new JLabel("Password : ");
        JTextField t1 = new JTextField("",10);
        JPasswordField t2 = new JPasswordField("",10);
        JButton b = new JButton("Login");
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);
    
        c.gridx = 0 ; c.gridy = 0 ;
        cp.add(user,c);
    
        c.gridx = 1 ; c.gridy = 0 ;
        cp.add(t1,c);
    
        c.gridx = 0 ; c.gridy = 1 ;
        cp.add(pass,c);
    
        c.gridx = 1 ; c.gridy = 1 ;
        cp.add(t2,c);
    
        c.gridx = 1 ; c.gridy = 2 ; c.anchor = GridBagConstraints.WEST;
        cp.add(b,c);
    
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     }
}
