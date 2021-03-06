package GUI;

/**
 * Created by Peter on 19/11/15.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

// klassen oprettes
public class Screen extends JFrame
{

    public static final String WELCOME = "welcome1234";
    public static final String USERMENU = "usermenu1234";
    public static final String PLAY = "play124";
    public static final String JOINGAME = "joingame1234";
    public static final String HIGHSCORE = "highscore1234";
    public static final String DELETEGAME = "deletegame1234";
    public static final String CONFIRMATION = "confimationPanel1234";

    // deklarerer variabler for klassen
    public Welcome welcome;
    public UserMenu userMenu;
    public Play play;
    public JoinGame joinGame;
    public HighScore highScore;
    public DeleteGame deleteGame;
    public ConfirmationPanel confirmationPanel;

    private JPanel contentPane;
    private CardLayout c;

    // konstruktør der instantierer variablene
    public Screen()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(100, 100, 530, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // komponenterne som kontrollers af cardLayout er instantieret
        welcome = new Welcome();
        userMenu = new UserMenu();
        play = new Play();
        joinGame = new JoinGame();
        highScore = new HighScore();
        deleteGame = new DeleteGame();
        confirmationPanel = new ConfirmationPanel();


        // Opretter paneler der indeholder vores card/kort
        contentPane.setLayout(new CardLayout(0, 0));
        contentPane.add(welcome, WELCOME);
        contentPane.add(userMenu, USERMENU);
        contentPane.add(play, PLAY);
        contentPane.add(joinGame, JOINGAME);
        contentPane.add(highScore, HIGHSCORE);
        contentPane.add(deleteGame, DELETEGAME);
        contentPane.add(confirmationPanel,CONFIRMATION);


        c = (CardLayout) getContentPane().getLayout();
    }

    // metode til at vise et bestemt "kort" - altså hvilken skærm der skal vises
    public void show(String card)
    {
        c.show(this.getContentPane(), card);
    }

    // Getters for JPanels
    public Welcome getWelcome()
    {
        return welcome;
    }

    public UserMenu getUserMenu()
    {
        return userMenu;
    }

    public Play getPlay()
    {
        return play;
    }

    public JoinGame getJoingame()
    {
        return joinGame;
    }

    public HighScore getHighScore()
    {
        return highScore;
    }

    public DeleteGame getDeleteGame()
    {
        return deleteGame;
    }

    public ConfirmationPanel getConfirmationPanel()
    {
        return confirmationPanel;
    }


}