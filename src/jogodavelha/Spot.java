package jogodavelha;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

  public class Spot extends JButton{
      int player = 0;
        public Spot(){
            setBackground(Color.WHITE);
            addActionListener((ActionEvent e) -> {
                if(playerTurn == 0){
                  ((JButton)e.getSource()).setText("X");

                }
                if(playerTurn == 1){
                    ((JButton)e.getSource()).setText("O");

                }
            }
        }
       public void clicked(){
       this.setText("ola mundo");
       }
  }