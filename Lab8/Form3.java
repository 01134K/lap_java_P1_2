import java.awt.*;
import javax.swing.*;

public class Form3 {
    public Form3(){
        JFrame f = new JFrame("Register");
        Container cp = f.getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(new Panel1() , BorderLayout.NORTH);
        cp.add(new Panel2(), BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
      
}

class Panel1 extends JPanel{
    public Panel1(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);
    
        c.gridx = 0 ; c.gridy = 0 ;
        add(new JLabel("Title : "),c);
        
        c.gridx = 0 ; c.gridy = 1 ;
        add(new JLabel("First name : "),c);

        c.gridx = 0 ; c.gridy = 2 ;
        add(new JLabel("TEL : "),c);

        c.gridx = 0 ; c.gridy = 3 ;
        add(new JLabel("Address : "),c);

        c.gridx = 2 ; c.gridy = 1 ;
        add(new JLabel("Last Name : "),c);

        c.gridx = 2 ; c.gridy = 0 ;
        add(new JLabel("Sex : "),c);


        String[] arr = {"Prof.","Dr.","Miss","Mr."};
        JComboBox<String> cd = new JComboBox<>(arr);
        c.gridx = 1 ; c.gridy = 0 ; c.anchor = GridBagConstraints.WEST;
        add(cd,c);

        c.gridx = 1 ; c.gridy = 1 ;
        add(new JTextField("",15),c);

        c.gridx = 1 ; c.gridy = 2 ;
        add(new JTextField("",15),c);

        c.gridx = 1 ; c.gridy = 3 ; c.gridwidth = 3; c.fill = GridBagConstraints.HORIZONTAL;
        add(new JTextField("",30),c);

        c.gridx = 3 ; c.gridy = 1 ; c.gridwidth = 1; c.fill = GridBagConstraints.NONE;
        add(new JTextField("",15),c);

        JRadioButton r1 = new JRadioButton("Male",false);
        JRadioButton r2 = new JRadioButton("Female",true);

        ButtonGroup bt = new ButtonGroup();
        bt.add(r1); bt.add(r2);
        JPanel tmp = new JPanel();
        tmp.add(r1);
        tmp.add(r2);
    
        c.gridx = 3 ; c.gridy = 0 ;
        add(tmp,c);

    }
}

class Panel2 extends JPanel{
    public Panel2(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);

        JButton b = new JButton("Select File");
        JTextField f = new JTextField("",20);
        JPanel tmp1 = new JPanel();
        tmp1.add(b); tmp1.add(f);
        c.gridx = 0 ; c.gridy = 0 ; c.gridwidth = 3; c.anchor = GridBagConstraints.CENTER;
        add(tmp1,c);


        c.gridx = 0 ; c.gridy = 1 ; c.gridwidth = 1; c.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Note : "),c);
        c.gridx = 1 ; c.gridy = 1 ; c.anchor = GridBagConstraints.WEST;
        add(new JTextArea(10,25),c);

        JButton b1 = new JButton("Regis");
        JButton b2 = new JButton("Cancel");
        JPanel tmp2 = new JPanel();
        tmp2.add(b1); tmp2.add(b2);
        c.gridx = 0 ; c.gridy = 2 ; c.gridwidth = 3; c.anchor = GridBagConstraints.CENTER;
        add(tmp2,c);


        

    }

}


