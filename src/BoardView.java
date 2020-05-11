import javax.swing.*;
import java.awt.*;

public class BoardView extends JFrame {

    private LandButton[][] landButtons;


    private JPanel stageOfGamePanel;
    private JLabel reinforceLabel;
    private JLabel attackLabel;
    private JLabel fortifyLabel;
    private JButton nextButton;


    private JPanel numberOfSoldiersPanel;
    private JLabel numberOfReadySoldiers;
    private JButton takingSoldierButton;
    private JButton undoButton;


    public BoardView() {

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(false);
        this.setLayout(null);

        this.add(gameMap());
        this.add(showStageOfGamePanel());
        this.add(showNumberOfReadySoldiers());
        this.setVisible(true);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public JButton getTakingSoldierButton() {
        return takingSoldierButton;
    }

    public JButton getUndoButton() {
        return undoButton;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////\
    public JPanel gameMap() {

        JPanel gameMap = new JPanel();
        gameMap.setBounds(350, 150, 1300, 500);
        landButtons = new LandButton[Map.getMapLength()][Map.getMapWidth()];
        int i, j;
        int id = 1;
        for (i = 0; i < Map.getMapLength(); i++) {
            for (j = 0; j < Map.getMapWidth(); j++) {
                landButtons[i][j] = new LandButton(id);
                landButtons[i][j].setActionCommand("land:" + id);
                // landButtons[i][j].addActionListener();
                if (Map.getAsia().getLands().contains(id)) {
                    landButtons[i][j].setBackground(Color.green);
                } else if (Map.getAfrica().getLands().contains(id)) {
                    landButtons[i][j].setBackground(Color.YELLOW);
                } else if (Map.getAmerica().getLands().contains(id)) {
                    landButtons[i][j].setBackground(Color.BLACK);
                } else if (Map.getEurope().getLands().contains(id)) {
                    landButtons[i][j].setBackground(Color.RED);
                } else {
                    landButtons[i][j].setBackground(Color.BLUE);
                    landButtons[i][j].setEnabled(false);
                }
                gameMap.add(landButtons[i][j]);
                id++;
            }
        }
        gameMap.setLayout(new GridLayout(7, 6));
        return gameMap;
    }


    public JPanel showStageOfGamePanel() {

        stageOfGamePanel = new JPanel();
        stageOfGamePanel.setBounds(600, 900, 700, 71);
        stageOfGamePanel.setBackground(Color.DARK_GRAY);

        reinforceLabel = new JLabel("reinforce");
        reinforceLabel.setFont(new Font("Algerian", Font.BOLD, 20));
        reinforceLabel.setPreferredSize(new Dimension(160, 60));

        attackLabel = new JLabel("attack");
        attackLabel.setFont(new Font("Algerian", Font.BOLD, 20));
        //attackLabel.setBorder(BorderFactory.);
        attackLabel.setPreferredSize(new Dimension(160, 60));

        fortifyLabel = new JLabel("fortify");
        fortifyLabel.setFont(new Font("Algerian", Font.BOLD, 20));
        fortifyLabel.setPreferredSize(new Dimension(160, 60));

        nextButton = new JButton("next stage");
        nextButton.setFont(new Font("Algerian", Font.BOLD, 20));
        nextButton.setPreferredSize(new Dimension(200, 60));
        nextButton.setActionCommand("nextStage");
        // nextButton.addActionListener();


        stageOfGamePanel.add(reinforceLabel);
        stageOfGamePanel.add(attackLabel);
        stageOfGamePanel.add(fortifyLabel);
        stageOfGamePanel.add(nextButton);

        stageOfGamePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        return stageOfGamePanel;
    }


    public JPanel showNumberOfReadySoldiers() {

        numberOfSoldiersPanel = new JPanel();
        numberOfSoldiersPanel.setBounds(1500, 750, 300, 190);
        numberOfSoldiersPanel.setBackground(Color.YELLOW);

        numberOfReadySoldiers = new JLabel("hello every body");
        numberOfReadySoldiers.setBounds(30,90,140,140);
numberOfSoldiersPanel.add(numberOfReadySoldiers);


/*
        takingSoldierButton = new JButton("ready soldier: ");
        takingSoldierButton.setActionCommand("getting soldier");
        takingSoldierButton.setFont(new Font("Algerian", Font.BOLD, 15));
        takingSoldierButton.setVerticalTextPosition(SwingConstants.CENTER);
        takingSoldierButton.setSize(140, 140);
        // takingSoldierButton.addActionListener(new PutTheBeadController());

        undoButton = new JButton("undo");
        undoButton.setActionCommand("undo");
        undoButton.setFont(new Font("Algerian", Font.BOLD, 15));
        undoButton.setVerticalTextPosition(SwingConstants.CENTER);
        undoButton.setSize(200, 140);
        //undoButton.addActionListener();

        numberOfSoldiersPanel.add(takingSoldierButton);
        numberOfSoldiersPanel.add(undoButton);


        numberOfSoldiersPanel.setLayout(new BoxLayout(numberOfSoldiersPanel, BoxLayout.Y_AXIS));
        */

        return numberOfSoldiersPanel;
    }

  /*  public JPanel showDicePanel() {

        JPanel dicePanel = new JPanel();
    }*/

}

class LandButton extends JButton {
    private final int id;

    public LandButton(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}



