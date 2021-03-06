package GUI;

/**
 * Created by Peter on 19/11/15.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// klassen oprettes
public class DeleteGame extends JPanel
{
    // deklarerer variabler for klassen
    private JLabel lblHeader;
    private JLabel lblDeleteGame;
    private JLabel lblOBS;
    private JLabel lblInfo;
    private JTextField txtDeleteGame;
    private JButton btnDeleteGame;
    private JButton btnCancel;

    // konstruktør der instantierer variablene
    public DeleteGame()
    {
        setLayout(null);
        setBounds(100, 100, 530, 300);
        setBackground(new Color(247, 247, 243));

        // label til overskriften
        lblHeader = new JLabel("Delete game");
        lblHeader.setBounds(185, 43, 159, 31);
        lblHeader.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblHeader.setForeground(new Color(73, 103, 170));
        add(lblHeader);

        // label til teksfeltet "delete game"
        lblDeleteGame = new JLabel("Type the GameID of the game you wish to delete:");
        lblDeleteGame.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        lblDeleteGame.setBounds(107, 134, 315, 16);
        add(lblDeleteGame);

        // tekstfelt til det gameId man ønsker at slette
        txtDeleteGame = new JTextField();
        txtDeleteGame.setColumns(10);
        txtDeleteGame.setBounds(97, 162, 332, 28);
        add(txtDeleteGame);

        // knap til at slette et spil
        btnDeleteGame = new JButton("Delete Game");
        btnDeleteGame.setBounds(195, 191, 117, 38);
        add(btnDeleteGame);

        // label OBS
        lblOBS = new JLabel("INFO:");
        lblOBS.setFont(new Font("Lucida Grande", Font.BOLD, 11));
        lblOBS.setBounds(97, 79, 30, 16);
        add(lblOBS);

        // label til info omkring hvad delete game gør
        lblInfo = new JLabel("This will remove a game from the system");
        lblInfo.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        lblInfo.setBounds(151, 79, 228, 16);
        add(lblInfo);

        // knap til at slette spillet
        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
        btnCancel.setBounds(6, 265, 76, 29);
        add(btnCancel);
    }

    // metode til at rydde tekstfeltet "delete game"
    public void clearDeleteGame()
    {
        txtDeleteGame.setText("");
    }


    // getters til de forskellige knapper og tekstfelter
    public JButton getBtnDeleteGame()
    {
        return btnDeleteGame;
    }

    public JButton getBtnCancel()
    {
        return btnCancel;
    }

    public String gettxtDelete()
    {
        String gameId = txtDeleteGame.getText();
        return gameId;
    }

    // action listener til de to knapper
    public void addActionListener(ActionListener l)
    {
        btnDeleteGame.addActionListener(l);
        btnCancel.addActionListener(l);
    }

}
