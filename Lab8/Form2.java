import java.awt.*;
import javax.swing.*;

public class Form2 {
   public Form2(){
      JFrame f = new JFrame("Calculator");
      Container cp = f.getContentPane();
      cp.setLayout(new BorderLayout());
      
      JTextField t = new JTextField("",20);
      t.setPreferredSize(new Dimension(250,30));
      cp.add(t,BorderLayout.NORTH);

      JPanel p = new JPanel();
      p.setLayout(new GridLayout(4,4));
      p.add(new JButton("7"));
      p.add(new JButton("8"));
      p.add(new JButton("9"));
      p.add(new JButton("/"));
      p.add(new JButton("4"));
      p.add(new JButton("5"));
      p.add(new JButton("6"));
      p.add(new JButton("*"));
      p.add(new JButton("1"));
      p.add(new JButton("2"));
      p.add(new JButton("3"));
      p.add(new JButton("-"));
      p.add(new JButton("="));
      p.add(new JButton("0"));
      p.add(new JButton("."));
      p.add(new JButton("+"));

      cp.add(p,BorderLayout.SOUTH);

      f.setSize(250,170);
      f.setResizable(false);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   }   
}

      //cp.add(new JTextField("",20),BorderLayout.NORTH); เขียนเเบบนี้ได้