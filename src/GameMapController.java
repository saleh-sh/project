import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class GameMapController implements ActionListener {


}*/

class PutTheBeadController implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equalsIgnoreCase("getting soldier")){
           // sourceButton.setBorder(BorderFactory.createLineBorder(Color.RED));
           // sourceButton.setEnabled(false);
            System.out.println("takingSoldierButton button");
        }else if (e.getActionCommand().equalsIgnoreCase("undo")){
            
        }

    }
}