import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIsetName extends JFrame {

    JTextField inputName;
    String namePokemon01;
    private BagUser bag;

    private DataUser data;
    private TreasuryItem item;
    private TreasuryPokeMe mon;
    private MonA a;
    private MonB b;
    private MonC c;
    private MonS s;

    public GUIsetName() {

        super("SetName First Pokemon");
        a = new MonA();
        b = new MonB();
        c = new MonC();
        s = new MonS();
        data = new DataUser();
        bag = new BagUser();
        item = new TreasuryItem(data);
        mon = new TreasuryPokeMe(s, a, b, c, data);

        final JPanel areaPanel = new JPanel();
        final ImageIcon imgPokemonMain = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIsetName\\Pikachu01.GIF");
        final ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIsetName\\imgGround02.JPG");
        final JLabel backGroundLabel = new JLabel("", imgPokemonMain, JLabel.CENTER);
        final JLabel backGround2Label = new JLabel("", imgGround, JLabel.CENTER); 
        final JLabel toTextLabel = new JLabel("Enter Your NickName Pikachumon :");
        toTextLabel.setBounds(280, 30, 500, 30);
        final JButton acceptButton = new JButton("Accept");
        final JButton cancleButton = new JButton("Cancle");
        JOptionPane startUser = new JOptionPane();


        toTextLabel.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 25));
        acceptButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        cancleButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));

        acceptButton.setBackground(new Color(219, 135, 50));
        cancleButton.setBackground(new Color(219, 135, 50));
        
        backGround2Label.setLayout(null);
        inputName = new JTextField();
        inputName.setBounds(300, 430, 400, 35);
        inputName.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 18));

        areaPanel.add(inputName);

        areaPanel.setLayout(null);
        areaPanel.setSize(1024, 768);
        backGroundLabel.setBounds(350, 150, 300, 202);
        backGround2Label.setSize(1024,768);

        acceptButton.setBounds(500, 500, 100, 30);
        cancleButton.setBounds(605, 500, 100, 30);

      //  areaPanel.setBackground(Color.GREEN);
       
        areaPanel.add(toTextLabel);
        areaPanel.add(backGroundLabel);
        areaPanel.add(acceptButton);
        areaPanel.add(cancleButton);
        areaPanel.add(backGround2Label);
        add(areaPanel);
        


        acceptButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                namePokemon01 = inputName.getText();
                data.setNamePokemon01(namePokemon01);
                bag.addItem(item.getItemBerry());
                bag.addItem(item.getItemMixBerry());
                bag.addItem(item.getItemPotionHP());
                bag.addItem(item.getItemPotionMP());
                bag.addPokedex(mon.getRankS());
                bag.addPokedex(mon.getRankA());
                bag.addPokedex(mon.getRankB());
                bag.addPokedex(mon.getRankC());
                /*
                bag.addItem(item.getItemPokemonRankA_Card());
                bag.addItem(item.getItemPokemonRankB_Card());
                bag.addItem(item.getItemPokemonRankC_Card());
                bag.addItem(item.getItemPokemonRankD_Card());
                */
                JOptionPane.showMessageDialog(startUser, "\n   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n  Your Pikacu NickName is "+data.getNamePokemon01()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+data.getLevel()
                +"\n    HP : "+data.getHP()
                +"\n    MP : "+data.getMP()
                +"\n    Power : "+data.getPower()
                +"\n    ATK : "+data.getATK()
                +"\n    Stamina : "+data.getStamina()
                +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                +"\n    -----------Your Item------------"
                +"\n    Your Pokeball : "+data.getPokeBall()
                +"\n    Berry : "+data.getBerry()
                +"\n    MixBerry : "+data.getMixBerry()
                +"\n    PotionHP : "+data.getPotionHP()
                +"\n    PotionMP : "+data.getPotionMP()
                +"\n    PokemonCard_RankS : "+data.getCard_P1()
                +"\n    PokemonCard_RankA : "+data.getCard_P2()
                +"\n    PokemonCard_RankB : "+data.getCard_P3()
                +"\n    PokemonCard_RankC : "+data.getCard_P4()
                +"\n  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "WeLCOM", JOptionPane.INFORMATION_MESSAGE);
                
                setVisible(false);
                new GUImenu(data, bag);
                //dispose();

            }
        });

        cancleButton.addActionListener((ActionEvent e) -> {

            setVisible(false);
            new GUIpokemon();
        });

        /*inputName.addActionListener(new ActionListener() {
            //BagUser bag = new BagUser();
            public void actionPerformed(ActionEvent e) {
                namePokemon01 = inputName.getText();
                data.setNamePokemon01(namePokemon01);
                
                //setVisible(false);
                //new GUImenu();
                //dispose();
            }
        });*/

        pack();
        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }

}