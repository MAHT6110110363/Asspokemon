import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIexchangePokemon extends JFrame{

    public GUIexchangePokemon(DataUser data, BagUser bag) {

        super("ExchangePokemon");

        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUImyBag\\imgBagGround02.JPG");
        
        JPanel platePanel = new JPanel();
        JLabel backGroundLabel = new JLabel("", imgGround, JLabel.CENTER);

        JButton sButton = new JButton("Smon x " + data.getCard_P1());
        JButton aButton = new JButton("Amon x " + data.getCard_P2());
        JButton bButton = new JButton("Bmon x " + data.getCard_P3());
        JButton cButton = new JButton("Cmonx" + data.getCard_P4());

        JOptionPane text = new JOptionPane();

        platePanel.setLayout(null);
        platePanel.setSize(800, 600);
        sButton.setBounds(130, 50, 200, 100);
        aButton.setBounds(130, 350, 200, 100);
        bButton.setBounds(460, 50, 200, 100);
        cButton.setBounds(460, 350, 200, 100);
        backGroundLabel.setBounds(100, 5, 600, 600);

        
        sButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        aButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        bButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        cButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));

        sButton.setBackground(Color.WHITE);
        aButton.setBackground(Color.WHITE);
        bButton.setBackground(Color.WHITE);
        cButton.setBackground(Color.WHITE);
        platePanel.setBackground(new Color(219, 194, 138));

        // set BackButton
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        backButton.setBackground(new Color(219, 135, 50));
        backButton.setBounds(600, 500, 150, 40);


       
        platePanel.add(sButton);
        platePanel.add(aButton);
        platePanel.add(bButton);
        platePanel.add(cButton);
        platePanel.add(backButton);
        platePanel.add(backGroundLabel);
        add(platePanel);

        if(data.getCard_P1() <= 0) {
            sButton.setEnabled(false);
        }
        if(data.getCard_P2() <= 0) {
            aButton.setEnabled(false);
        }
        if(data.getCard_P3() <=01) {
            bButton.setEnabled(false);
        }
        if(data.getCard_P4() <= 0) {
            cButton.setEnabled(false);
        }

        sButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(data.getCard_P1() <= 1) {
                    sButton.setEnabled(false);
                }

                    data.seth0();
                    data.setCard_P1(data.getCard_P1() - 1);
                    sButton.setText("Smon x " + data.getCard_P1());
                    String name = JOptionPane.showInputDialog( text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Congrats! you exchange success : "
                    +"\n\n    Input Smon Nickname :"  
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "setNickname new pokemon", JOptionPane.INFORMATION_MESSAGE);
                    bag.getPokedex().get(0).setNamePokemon(name);

                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n  Your Smon NickName is "+bag.getPokedex().get(0).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() + "/" +bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You get new Pokemon !", JOptionPane.INFORMATION_MESSAGE);
            

            }
        });

        aButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(data.getCard_P2() <= 1){
                    aButton.setEnabled(false);
                }
                    data.seth1();
                    data.setCard_P2(data.getCard_P2() - 1);
                    aButton.setText("Amon x " + data.getCard_P2());
                    String name = JOptionPane.showInputDialog( text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Congrats! you exchange success : "
                    +"\n\n    Input Amon Nickname :"  
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "setNickname new pokemon", JOptionPane.INFORMATION_MESSAGE);
                    bag.getPokedex().get(1).setNamePokemon(name);

                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n  Your Amon NickName is "+bag.getPokedex().get(1).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() + "/" +bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You get new Pokemon !", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        bButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(data.getCard_P3() <= 1) {
                    bButton.setEnabled(false);
                }
                    data.seth2();
                    data.setCard_P3(data.getCard_P3() - 1);
                    bButton.setText("Bmon x " + data.getCard_P3());
                    String name = JOptionPane.showInputDialog( text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Congrats! you exchange success : "
                    +"\n\n    Input Bmon Nickname :"  
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "setNickname new pokemon", JOptionPane.INFORMATION_MESSAGE);
                    bag.getPokedex().get(2).setNamePokemon(name);

                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n  Your Bmon NickName is "+bag.getPokedex().get(2).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() + "/" +bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You get new Pokemon !", JOptionPane.INFORMATION_MESSAGE);
            
            }
        });

        cButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(data.getCard_P4() <= 1) {
                    cButton.setEnabled(false);
                }
                    data.seth3();
                    data.setCard_P4(data.getCard_P4() - 1);
                    cButton.setText("Cmon x " + data.getCard_P4());
                    String name = JOptionPane.showInputDialog( text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Congrats! you exchange success : "
                    +"\n\n    Input Cmon Nickname :"  
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "setNickname new pokemon", JOptionPane.INFORMATION_MESSAGE);
                    bag.getPokedex().get(3).setNamePokemon(name);

                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n  Your Cmon NickName is "+bag.getPokedex().get(3).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() + "/" +bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You get new Pokemon !", JOptionPane.INFORMATION_MESSAGE);
                
            }
        });

        backButton.addActionListener((ActionEvent e) -> {
            dispose();
            new GUImenu(data, bag);
        });



        setBounds(250, 30, 800, 600);
        setResizable(false);
        setVisible(true);


    }

}