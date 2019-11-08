/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author joswi
 */
 public class Game extends JFrame{
     JPanel table = new JPanel(new GridLayout(3,3,10,10));
     JLabel alert = new JLabel();
     Spot2 spots[] = new Spot2[9];
     int player1 = 1;
     int player2= 2;
     
     public int playerTurn = 0;
     public void Game(){}
     public void initBackground(){
        add(BorderLayout.CENTER,table);
        add(BorderLayout.NORTH,alert);
        Data();

    }
     public void configWindow(){
     setTitle("Granma Game");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(600,600);
     setLocationRelativeTo(null);
     setVisible(true);
    }
     public void Data(){
      for(int i=0; i<9 ;i++){
            Spot2 spot = new Spot2();
            spots[i] = spot;
            table.add(spot);   
      }
    }
   
  public class Spot2 extends JButton{
      int who = 0;
        public Spot2(){
            setBackground(Color.WHITE);
            addActionListener((ActionEvent e) -> {
            if(who == 0){
                    if(playerTurn == 1){
                  ((JButton)e.getSource()).setText("X");
                  who = 1;

                }
                    else{
                    ((JButton)e.getSource()).setText("O");
                       who = 2;
                }
                changeTurn();
                
                if(checkWinner(who)){
                    JOptionPane.showMessageDialog(null, "player: "+ who + " GANHOU");
                    System.exit(0);
                }
            }
            }
        }
       public void clicked(){
       this.setText("ola mundo");
       }
  }
     
    public void changeTurn(){
     if(playerTurn == 1){
         playerTurn=2;
     }else{
         playerTurn =1;
     }
     }
    public boolean checkWinner(int jog) {
		if(spots[0].who==jog && spots[1].who==jog && spots[2].who==jog) {
			return true;
		}
		if(spots[3].who==jog && spots[4].who==jog && spots[5].who==jog) {
			return true;
		}
		if(spots[6].who==jog && spots[7].who==jog && spots[8].who==jog) {
			return true;
		}
		if(spots[0].who==jog && spots[3].who==jog && spots[6].who==jog) {
			return true;
		}
		if(spots[1].who==jog && spots[4].who==jog && spots[7].who==jog) {
			return true;
		}
		if(spots[2].who==jog && spots[5].who==jog && spots[8].who==jog) {
			return true;
		}
		if(spots[0].who==jog && spots[4].who==jog && spots[8].who==jog) {
			return true;
		}
		if(spots[2].who==jog && spots[4].who==jog && spots[6].who==jog) {
			return true;
		}
		return false;
	}
  
   }