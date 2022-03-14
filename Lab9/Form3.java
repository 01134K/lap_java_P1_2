import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Form3 implements ActionListener,MouseListener{

    private JLabel L;
    private JButton[] B;
    String T ;
    String tmp ;
    int count ;
    boolean HaveWinner ;

    public Form3(){
        T = "X";
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        L = new JLabel("X Turn");
        L.addMouseListener(this);
        L.setPreferredSize( new Dimension(200, 30));
        L.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(L,BorderLayout.NORTH);
        JPanel p =new JPanel();
        p.setLayout(new GridLayout(3,3));
        B = new JButton[9];
        for(int i=0 ; i<B.length ; i++)
        {
            B[i] = new JButton();
            B[i].addActionListener(this);
            B[i].setActionCommand(String.valueOf(i));
            p.add(B[i]);
        }
        f.add(p,BorderLayout.CENTER);
        f.pack();
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    
    public boolean CheckWinner(){
        tmp = "X";
        if(
            (B[0].getText().equals(tmp)&&B[1].getText().equals(tmp)&&B[2].getText().equals(tmp))
          ||(B[3].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[5].getText().equals(tmp))
          ||(B[6].getText().equals(tmp)&&B[7].getText().equals(tmp)&&B[8].getText().equals(tmp))

          ||(B[0].getText().equals(tmp)&&B[3].getText().equals(tmp)&&B[6].getText().equals(tmp))
          ||(B[1].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[7].getText().equals(tmp))
          ||(B[2].getText().equals(tmp)&&B[5].getText().equals(tmp)&&B[8].getText().equals(tmp))

          ||(B[0].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[8].getText().equals(tmp))
          ||(B[2].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[6].getText().equals(tmp))
            
        ){
            L.setText("X Win! Click Here to play again");
            HaveWinner = true;
        }
        tmp = "O";
        if(
            (B[0].getText().equals(tmp)&&B[1].getText().equals(tmp)&&B[2].getText().equals(tmp))
          ||(B[3].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[5].getText().equals(tmp))
          ||(B[6].getText().equals(tmp)&&B[7].getText().equals(tmp)&&B[8].getText().equals(tmp))

          ||(B[0].getText().equals(tmp)&&B[3].getText().equals(tmp)&&B[6].getText().equals(tmp))
          ||(B[1].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[7].getText().equals(tmp))
          ||(B[2].getText().equals(tmp)&&B[5].getText().equals(tmp)&&B[8].getText().equals(tmp))

          ||(B[0].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[8].getText().equals(tmp))
          ||(B[2].getText().equals(tmp)&&B[4].getText().equals(tmp)&&B[6].getText().equals(tmp))
            
        ){
            L.setText("O Win! Click Here to play again");
            HaveWinner = true;
        }
        if(count == 9 && HaveWinner == false ){
        L.setText("Draw! Click Here to play again");
        HaveWinner = true;
        }
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s = e.getActionCommand();

        switch (s) {
            case "0": case "1": case "2":
            case "3": case "4": case "5":
            case "6": case "7": case "8":
            if(B[Integer.parseInt(s)].getText().equals("")&&HaveWinner == false)
            {
                B[Integer.parseInt(s)].setText(T);
                if(T.equals("X")) 
                {
                    T = "O";
                    L.setText("O Turn");
                }
                else 
                {
                    T = "X";
                    L.setText("X Turn");
                }
                count++;
                CheckWinner();
                
            }
                break;
        }
    }

    private void Reset(){
        for(int i=0 ; i<B.length ; i++)
        {
            B[i].setText("");
        }
        L.setText("X Turn");
        T = "X";
        count = 0;
        HaveWinner = false ;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(HaveWinner){
            Reset();
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {      
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {    
    }
}
