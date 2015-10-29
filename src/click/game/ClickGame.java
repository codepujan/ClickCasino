/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package click.game;

import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author Pujan Paudel
 */
public class ClickGame {

    /**
     * @param args the command line arguments
     */
    private static GameScreen gameInstance;
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
               gameInstance = new GameScreen();
                gameInstance.setVisible(true);
            }
        });
    
        
    }
    
   
}
