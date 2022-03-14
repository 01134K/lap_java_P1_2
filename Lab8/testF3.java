import java.awt.*;
import javax.swing.*;

public class testF3 {
    public testF3(){
        JFrame f = new JFrame("Register");
        Container cp = f.getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(new Panel3() , BorderLayout.NORTH);
        cp.add(new Panel4(), BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
      
}

class Panel3 extends JPanel{
    public Panel3(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        c.insets = new Insets(5,5,5,5);
    
        c.gridx = 0 ; c.gridy = 0 ;
        add(new JLabel("Title : "),c);
        String[] arr = {"Prof.","Dr.","Miss","Mr."};
        JComboBox<String> cd = new JComboBox<>(arr);
        c.gridx = 1 ; c.gridy = 0 ; c.anchor = GridBagConstraints.WEST;
        add(cd,c);
        c.anchor = GridBagConstraints.EAST;
        
        c.gridx = 0 ; c.gridy = 1 ;
        add(new JLabel("First name : "),c);
        c.gridx = 1 ; c.gridy = 1 ;
        add(new JTextField("",15),c);

        c.gridx = 0 ; c.gridy = 2 ;
        add(new JLabel("TEL: "),c);
        c.gridx = 1 ; c.gridy = 2 ;
        add(new JTextField("",15),c);

        c.gridx = 0 ; c.gridy = 3 ;
        add(new JLabel("Address : "),c);
        c.gridx = 1 ; c.gridy = 3 ; 
        add(new JTextField("",30),c);

        c.gridx = 2 ; c.gridy = 1 ;
        add(new JLabel("Last Name : "),c);
        c.gridx = 3 ; c.gridy = 1 ; 
        add(new JTextField("",15),c);

        c.gridx = 2 ; c.gridy = 0 ;
        add(new JLabel("Sex : "),c);
        JRadioButton r1 = new JRadioButton("Male",false);
        JRadioButton r2 = new JRadioButton("Female",true);
        ButtonGroup bt = new ButtonGroup();
        bt.add(r1); bt.add(r2);
        JPanel tmp = new JPanel();
        tmp.add(r1); tmp.add(r2);
        c.gridx = 3 ; c.gridy = 0 ;
        add(tmp,c);

    }
}

class Panel4 extends JPanel{
    public Panel4(){

    }

}

