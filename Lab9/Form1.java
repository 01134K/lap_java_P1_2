import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Form1 implements ActionListener{
    private JTextField t1 ;
    private JPasswordField t2 ;
    public Form1(){
        JFrame f = new JFrame("login");
        Container cp = f.getContentPane();
        cp.setLayout(new GridBagLayout());
    
        JLabel user = new JLabel("USER : ");
        JLabel pass = new JLabel("Password : ");
        t1 = new JTextField("",10);
        t2 = new JPasswordField("",10);
        JButton b = new JButton("Login");
        b.addActionListener(this);
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
        f.setLocationRelativeTo(null);
    }
    public void openDialog(String s){
        JDialog d = new JDialog();
            JLabel l = new JLabel(s);
            d.setLayout(new FlowLayout());
            d.add(l);
            d.pack();
            d.setVisible(true);
            d.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(t1.getText().equals("admin") && String.valueOf(t2.getPassword()).equals("abc123"))
        {
            openDialog("Login Complete!!");
        }
        else if(t1.getText().trim().equals("") || String.valueOf(t2.getPassword()).trim().equals(""))
        {
            openDialog("Please input User and Pass");
        }
        else if(!t1.getText().equals("admin") || !String.valueOf(t2.getPassword()).equals("abc123"))
        {
            openDialog("User Pass incorrect");
        }
        
    }
}

//.trim() เอาเว้นวรรคออก
