import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIuserHouse extends JFrame{

    private TreasuryPokeMe mon;
    private PokemonS s;
    private PokemonA a;
    private PokemonB b;
    private PokemonC c;


    public GUIuserHouse(DataUser data, BagUser bag) {
        super("Your House");

        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIuserHouse\\imgGround04.JPG");
        ImageIcon imgConbag = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIuserHouse\\iconBag.JPG");
        ImageIcon imgExchange = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIuserHouse\\iconExchange02.JPG");

        JPanel platePanel = new JPanel();

        JLabel backGroundLabel = new JLabel("", imgGround, JLabel.CENTER);

        JButton bagButton = new JButton("Bag", imgConbag);
        JButton exchangePokemonButton = new JButton("ExchangPokemon", imgExchange);

        platePanel.setLayout(null);
        bagButton.setBounds(20, 650, 150, 60);
        exchangePokemonButton.setBounds(200, 650, 250, 60);
        backGroundLabel.setBounds(0, 40, 1024, 640);

        exchangePokemonButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        backGroundLabel.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));

        bagButton.setBackground(Color.WHITE);
        exchangePokemonButton.setBackground(Color.WHITE);

       // platePanel.setBackground(new Color(158, 113, 0));
        platePanel.setBackground(new Color(107, 0, 98));



        //SetBackButton
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        backButton.setBackground(new Color(219, 135, 50));
        backButton.setBounds(830, 680, 150, 40);

        platePanel.add(backButton);
        platePanel.add(bagButton);
        platePanel.add(exchangePokemonButton);


        platePanel.add(backGroundLabel);
        add(platePanel);




        bagButton.addActionListener((ActionEvent e) -> {
            new GUImyBag(data, bag);
            dispose();
            
        });

        exchangePokemonButton.addActionListener((ActionEvent e) -> {
            new GUIexchangePokemon(data, bag);
            dispose();
        });

        backButton.addActionListener((ActionEvent e) -> {
            new GUImenu(data, bag);
            dispose();
        });

        

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }


}