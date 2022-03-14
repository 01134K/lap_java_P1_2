import javax.swing.*;
import java.awt.event.*;
public class Form2 implements KeyListener{
    private JButton b ;
    private int x ;
    private int y ;
    private JFrame f ;
    public Form2(){
        x = 0 ; y = 0 ;
        f = new JFrame("");
        f.setLayout(null);
        b = new JButton ("Hello");
        b.setBounds(x,y,80,50);
        b.addKeyListener(this);
        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            y += 10;
            if(y>f.getHeight()-90) y = f.getHeight()-90 ;
            b.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        { 
            y -= 10;
            if(y<f.getHeight()-300) y = f.getHeight()-300 ;
            b.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            x += 10;
            if(x>f.getWidth()-90) x = f.getWidth()-90 ;
            b.setBounds(x, y, 80, 50);
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            x -= 10;
            if(x<f.getWidth()-300) x = f.getWidth()-300;
            b.setBounds(x, y, 80, 50);
        }
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub  
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub   
    }  
}
