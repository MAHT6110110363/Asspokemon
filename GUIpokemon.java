import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUIpokemon extends JFrame {

    public GUIpokemon() {
        super("PokemonGame");

        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIPokemon\\imgGround2.JPG");
        JPanel backGroundPanel = new JPanel();
        JLabel backGroundLabel = new JLabel("", imgGround, JLabel.CENTER);
        JButton startButton = new JButton("START GAME");
        JButton quitButton = new JButton("QUIT");

        startButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        quitButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
/*
        startButton.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
        quitButton.setFont(new Font("impact",Font.TRUETYPE_FONT,20));
*/
        startButton.setBackground(new Color(219, 135, 50));
        quitButton.setBackground(new Color(219, 135, 50));

        backGroundLabel.setLayout(null);
        backGroundLabel.setBounds(0,0,1024,768);
        startButton.setBounds(200,400,200,50);
        quitButton.setBounds(200,500,200,50);
        
        backGroundLabel.add(startButton);
        backGroundLabel.add(quitButton);
        add(backGroundLabel);   
        
        startButton.addActionListener((final ActionEvent e) ->{
            setVisible(false);
            new GUIsetName();
        });
        
        quitButton.addActionListener((final ActionEvent e) ->{
            System.exit(0);
        });

        
        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setVisible(true);
    }
}