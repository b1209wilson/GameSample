
package arcade.game;
import javax.swing.JOptionPane;

public class Presentation {
        

    public void Test(){
        
        IntroContext();
        
        CardIn();
        
        MainPg();
    }

    private void IntroContext() {
        

        JOptionPane.showMessageDialog(null,
            "Welcome!",
            "Intro",
        JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null,
            "Enter The Arcade",
            "Intro",
        JOptionPane.PLAIN_MESSAGE);
    }

    private void CardIn() {
        
        //Aj Insert Here
        
    }

    private void MainPg() {
        
        LoadPg();
        
        TransferPg();
        
        GamePg();
        
        ExitPg();
                
    }

    private void LoadPg() {
        
        //Visal terminal Code here 
        
        MainPg();
        
    }

    private void TransferPg() {
        
        Transfer();
        
        MainPg();
    }

    private void GamePg() {
        Game1();
        Game2();
        MainPg();
    }

    private void ExitPg() {
        PrizePg();
        MainPg();
    }

    private void Transfer() {
        TransferMethod();
        MainPg();
    }

    private void Game2() {
        //First Game Colby
        Game2();
        GamePg();
        
    }

    private void Game1() {
        //Second game Colby
        Game1();
        GamePg();
    }

    private void PrizePg() {
        PrizeSel();
        Exit();
    }

    private void TransferMethod() {
        // visal tran code
    }

    private void Exit() {
        ExitContext();
        //end Program
    }

    private void PrizeSel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ExitContext() {
        //conclusion statements
        
    }
    
    
}
