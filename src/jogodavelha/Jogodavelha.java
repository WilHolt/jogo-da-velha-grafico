/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author joswi
 */
public class Jogodavelha extends JFrame {
   
    public static void main(String[] args) {
      Game game = new Game();
              game.initBackground();

        game.configWindow();
    }
  
}
