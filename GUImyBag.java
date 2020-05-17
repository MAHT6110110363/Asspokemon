import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUImyBag extends JFrame {

    private TreasuryItem item;

    public GUImyBag (DataUser data, BagUser bag) {

        super("Your Bag");

        item = new TreasuryItem(data);

        //pokeme = new TreasuryPokeMe(bag.addPokedex(s), a, b, c, data)

       /* ImageIcon iconBerry = new ImageIcon();
        ImageIcon iconMixBerry = new ImageIcon();
        ImageIcon iconPotionHP = new ImageIcon();
        ImageIcon iconPotionMP = new ImageIcon();*/
        ImageIcon imgGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUImyBag\\imgBagGround02.JPG");


        JPanel platePanel = new JPanel();
        JLabel backGround = new JLabel("", imgGround, JLabel.CENTER);
        JButton berryButton = new JButton("Berry x"+data.getBerry());
        JButton mixBerryButton = new JButton("MixBerry x"+data.getMixBerry());
        JButton potionHPButton = new JButton("PotionHP x"+data.getPotionHP());
        JButton potionMPButton = new JButton("PotionMP x"+data.getPotionMP());

        JButton Omon = new JButton(""+data.getNamePokemon01());
        JButton Smon = new JButton(""+bag.getPokedex().get(0).getNamePokemon());
        JButton Amon = new JButton(""+bag.getPokedex().get(1).getNamePokemon());
        JButton Bmon = new JButton(""+bag.getPokedex().get(2).getNamePokemon());
        JButton Cmon = new JButton(""+bag.getPokedex().get(3).getNamePokemon());

        JOptionPane text = new JOptionPane();
        JOptionPane set = new JOptionPane();

        platePanel.setLayout(null);
        platePanel.setSize(800, 600);
        berryButton.setBounds(130, 50, 200, 50);
        mixBerryButton.setBounds(130, 150, 200, 50);
        potionHPButton.setBounds(130, 250, 200, 50);
        potionMPButton.setBounds(130, 350, 200,50);
        Smon.setBounds(460, 50, 200, 50);
        Amon.setBounds(460, 150, 200, 50);
        Bmon.setBounds(460, 250, 200, 50);
        Cmon.setBounds(460, 350, 200, 50);
        Omon.setBounds(460, 450, 200, 50);
        backGround.setBounds(100, 5, 600, 600);

        berryButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        mixBerryButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        potionHPButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        potionMPButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        Smon.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        Amon.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        Bmon.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        Cmon.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));
        Omon.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 12));

        berryButton.setBackground(Color.WHITE);
        mixBerryButton.setBackground(Color.WHITE);
        potionHPButton.setBackground(Color.WHITE);
        potionMPButton.setBackground(Color.WHITE);
        Omon.setBackground(Color.WHITE);
        Smon.setBackground(Color.WHITE);
        Amon.setBackground(Color.WHITE);
        Bmon.setBackground(Color.WHITE);
        Cmon.setBackground(Color.WHITE);
        platePanel.setBackground(new Color(219, 194, 138));


       // set BackButton
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        backButton.setBackground(new Color(219, 135, 50));
        backButton.setBounds(600, 500, 150, 40);

        platePanel.add(berryButton);
        platePanel.add(mixBerryButton);
        platePanel.add(potionHPButton);
        platePanel.add(potionMPButton);
        platePanel.add(Smon);
        platePanel.add(Amon);
        platePanel.add(Bmon);
        platePanel.add(Cmon);
        platePanel.add(Omon);
        platePanel.add(backButton);

        platePanel.add(backGround);
        add(platePanel);


            // Sysytem
        if (data.getMixBerry() <= 0){
            mixBerryButton.setEnabled(false);
        }    
        if (data.getBerry() <= 0){
            berryButton.setEnabled(false);
        }
            
        if (data.getPotionHP() <= 0) {
            potionHPButton.setEnabled(false);
           
        }
        if (data.getPotionMP() <= 0) {
            potionMPButton.setEnabled(false);
           
        }

        if(data.geth0() == 0) {
            Smon.setEnabled(false);
        }
        if(data.geth1() == 0) {
            Amon.setEnabled(false);
        }
        if(data.geth2() == 0) {
            Bmon.setEnabled(false);
        }
        if(data.geth3() == 0) {
            Cmon.setEnabled(false);
        }



        //Event

       mixBerryButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                int i = 0;
                String name = JOptionPane.showInputDialog(set, "Enter Name Pokemon You want feed");
                if(name.equals(bag.getPokedex().get(0).getNamePokemon())) {
                    i++;
                    data.setMixBerry(data.getMixBerry() - 1);
                    bag.getPokedex().get(0).getStatusPokemon().effectMixBerry();
                    mixBerryButton.setText("MixBerry x"+ data.getMixBerry());
                    bag.removeItem(bag.findItem("MixBerry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Smon  nickName : " + bag.getPokedex().get(0).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(1).getNamePokemon())) {
                    i++;
                    data.setMixBerry(data.getMixBerry() - 1);
                    bag.getPokedex().get(1).getStatusPokemon().effectMixBerry();
                    mixBerryButton.setText("MixBerry x"+ data.getMixBerry());
                    bag.removeItem(bag.findItem("MixBerry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Amon  nickName : " + bag.getPokedex().get(1).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(2).getNamePokemon())) {
                    i++;
                    data.setMixBerry(data.getMixBerry() - 1);
                    bag.getPokedex().get(2).getStatusPokemon().effectMixBerry();
                    mixBerryButton.setText("MixBerry x"+ data.getMixBerry());
                    bag.removeItem(bag.findItem("MixBerry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Bmon  nickName : " + bag.getPokedex().get(2).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(3).getNamePokemon())) {
                    i++;
                    data.setMixBerry(data.getMixBerry() - 1);
                    bag.getPokedex().get(3).getStatusPokemon().effectMixBerry();
                    mixBerryButton.setText("MixBerry x"+ data.getMixBerry());
                    bag.removeItem(bag.findItem("MixBerry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Cmon  nickName : " + bag.getPokedex().get(3).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if(name.equals(data.getNamePokemon01())){
                    i++;
                    item.effectMixBerry();
                    mixBerryButton.setText("MixBerry x"+ data.getMixBerry());
                    bag.removeItem(bag.findItem("MixBerry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Cmon  nickName : " + data.getNamePokemon01()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+data.getLevel()
                    +"\n    HP : "+data.getHP()
                    +"\n    MP : "+data.getMP()
                    +"\n    Power : "+data.getPower()
                    +"\n    ATK : "+data.getATK()
                    +"\n    Stamina : "+data.getStamina()
                    +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if (data.getMixBerry() <= 0){
                    mixBerryButton.setEnabled(false);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Your MixBerry is Empty"
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Empty Item",JOptionPane.INFORMATION_MESSAGE);
                }
                if (i <= 0) {
                    JOptionPane.showMessageDialog(text, "Have not Pokemon this nickkName : "+ name);
                }
            }
        });

        berryButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int i = 0;
                String name = JOptionPane.showInputDialog(set, "Enter Name Pokemon You want feed");
                if(name.equals(bag.getPokedex().get(0).getNamePokemon())) {
                    i++;
                    data.setBerry(data.getBerry() - 1);
                    bag.getPokedex().get(0).getStatusPokemon().effectBerry();
                    berryButton.setText("Berry x"+ data.getBerry());
                    bag.removeItem(bag.findItem("Berry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Smon  nickName : " + bag.getPokedex().get(0).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(1).getNamePokemon())) {
                    i++;
                    data.setBerry(data.getBerry() - 1);
                    bag.getPokedex().get(1).getStatusPokemon().effectBerry();
                    berryButton.setText("Berry x"+ data.getBerry());
                    bag.removeItem(bag.findItem("Berry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Amon  nickName : " + bag.getPokedex().get(1).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(2).getNamePokemon())) {
                    i++;
                    data.setBerry(data.getBerry() - 1);
                    bag.getPokedex().get(2).getStatusPokemon().effectBerry();
                    berryButton.setText("Berry x"+ data.getBerry());
                    bag.removeItem(bag.findItem("Berry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Bmon  nickName : " + bag.getPokedex().get(2).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(3).getNamePokemon())) {
                    i++;
                    data.setBerry(data.getBerry() - 1);
                    bag.getPokedex().get(3).getStatusPokemon().effectBerry();
                    berryButton.setText("Berry x"+ data.getBerry());
                    bag.removeItem(bag.findItem("Berry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Cmon  nickName : " + bag.getPokedex().get(3).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if(name.equals(data.getNamePokemon01())){
                    i++;
                    item.effectBerry();
                    berryButton.setText("Berry x"+ data.getBerry());
                    bag.removeItem(bag.findItem("Berry"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Cmon  nickName : " + data.getNamePokemon01()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+data.getLevel()
                    +"\n    HP : "+data.getHP()
                    +"\n    MP : "+data.getMP()
                    +"\n    Power : "+data.getPower()
                    +"\n    ATK : "+data.getATK()
                    +"\n    Stamina : "+data.getStamina()
                    +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if (data.getBerry() <= 0){
                    berryButton.setEnabled(false);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Your Berry is Empty"
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Empty Item",JOptionPane.INFORMATION_MESSAGE);
                }
                if(i <= 0) {
                    JOptionPane.showMessageDialog(text, "Have not Pokemon this nickkName : "+ name);
                }
              

            }
        });

        potionHPButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int i = 0;
                String name = JOptionPane.showInputDialog(set, "Enter Name Pokemon You want feed");
                if(name.equals(bag.getPokedex().get(0).getNamePokemon())) {
                    i++;
                    data.setPotionHP(data.getPotionHP() - 1);
                    bag.getPokedex().get(0).getStatusPokemon().effectPotionHP();
                    potionHPButton.setText("PotionHP x"+ data.getPotionHP());
                    bag.removeItem(bag.findItem("PotionHP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Smon  nickName : " + bag.getPokedex().get(0).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(1).getNamePokemon())) {
                    i++;
                    data.setPotionHP(data.getPotionHP() - 1);
                    bag.getPokedex().get(1).getStatusPokemon().effectPotionHP();
                    potionHPButton.setText("PotionHP x"+ data.getPotionHP());
                    bag.removeItem(bag.findItem("PotionHP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Amon  nickName : " + bag.getPokedex().get(1).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(2).getNamePokemon())) {
                    i++;
                    data.setPotionHP(data.getPotionHP() - 1);
                    bag.getPokedex().get(2).getStatusPokemon().effectPotionHP();
                    potionHPButton.setText("PotionHP x"+ data.getPotionHP());
                    bag.removeItem(bag.findItem("PotionHP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Bmon  nickName : " + bag.getPokedex().get(2).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(3).getNamePokemon())) {
                    i++;
                    data.setPotionHP(data.getPotionHP() - 1);
                    bag.getPokedex().get(3).getStatusPokemon().effectPotionHP();
                    potionHPButton.setText("PotionHP x"+ data.getPotionHP());
                    bag.removeItem(bag.findItem("PotionHP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Cmon  nickName : " + bag.getPokedex().get(3).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if(name.equals(data.getNamePokemon01())){
                    i++;
                    item.effectPotionHP();
                    potionHPButton.setText("PotionHP x"+ data.getPotionHP());
                    bag.removeItem(bag.findItem("PotionHP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Cmon  nickName : " + data.getNamePokemon01()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+data.getLevel()
                    +"\n    HP : "+data.getHP()
                    +"\n    MP : "+data.getMP()
                    +"\n    Power : "+data.getPower()
                    +"\n    ATK : "+data.getATK()
                    +"\n    Stamina : "+data.getStamina()
                    +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if (data.getPotionHP() <= 0){
                    potionHPButton.setEnabled(false);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Your PotionHP is Empty"
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Empty Item",JOptionPane.INFORMATION_MESSAGE);
                }
                if(i <= 0) {
                    JOptionPane.showMessageDialog(text, "Have not Pokemon this nickkName : "+ name);
                }


            }
        });

        potionMPButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int i = 0;
                String name = JOptionPane.showInputDialog(set, "Enter Name Pokemon You want feed");
                if(name.equals(bag.getPokedex().get(0).getNamePokemon())) {
                    i++;
                    data.setPotionMP(data.getPotionMP() - 1);
                    bag.getPokedex().get(0).getStatusPokemon().effectPotionMP();
                    potionMPButton.setText("PotionMP x"+ data.getPotionMP());
                    bag.removeItem(bag.findItem("PotionMP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Smon  nickName : " + bag.getPokedex().get(0).getNamePokemon()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                    +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                    +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                    +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                    +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                    +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                    +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(1).getNamePokemon())) {
                    i++;
                    data.setPotionMP(data.getPotionMP() - 1);
                    bag.getPokedex().get(1).getStatusPokemon().effectPotionMP();
                    potionMPButton.setText("PotionMP x"+ data.getPotionMP());
                    bag.removeItem(bag.findItem("PotionMP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Amon  nickName : " + bag.getPokedex().get(1).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(2).getNamePokemon())) {
                    i++;
                    data.setPotionMP(data.getPotionMP() - 1);
                    bag.getPokedex().get(2).getStatusPokemon().effectPotionMP();
                    potionMPButton.setText("PotionMP x"+ data.getPotionMP());
                    bag.removeItem(bag.findItem("PotionMP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Bmon  nickName : " + bag.getPokedex().get(2).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
                if(name.equals(bag.getPokedex().get(3).getNamePokemon())) {
                    i++;
                    data.setPotionMP(data.getPotionMP() - 1);
                    bag.getPokedex().get(3).getStatusPokemon().effectPotionMP();
                    potionMPButton.setText("PotionMP x"+ data.getPotionMP());
                    bag.removeItem(bag.findItem("PotionMP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Cmon  nickName : " + bag.getPokedex().get(3).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if(name.equals(data.getNamePokemon01())){
                    i++;
                    item.effectPotionMP();
                    potionMPButton.setText("PotionMP x"+ data.getPotionMP());
                    bag.removeItem(bag.findItem("PotionMP"));
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Cmon  nickName : " + data.getNamePokemon01()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+data.getLevel()
                    +"\n    HP : "+data.getHP()
                    +"\n    MP : "+data.getMP()
                    +"\n    Power : "+data.getPower()
                    +"\n    ATK : "+data.getATK()
                    +"\n    Stamina : "+data.getStamina()
                    +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }

                if (data.getPotionMP() <=0){
                    potionMPButton.setEnabled(false);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Your PotionMP is Empty"
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Empty Item",JOptionPane.INFORMATION_MESSAGE);
                }
                if(i <= 0) {
                    JOptionPane.showMessageDialog(text, "Have not Pokemon this nickkName : "+ name);
                }

            }
        });

        Smon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(data.getCard_P1() >= 1) {
                    JOptionPane.showConfirmDialog(text, "You want a set new nickname name"
                    , "going set new nickname", JOptionPane.INFORMATION_MESSAGE);
                    data.setCard_P1(data.getCard_P1() - 1);
                    String name = JOptionPane.showInputDialog(set, "Enter New Pokemon Nickname");
                    bag.getPokedex().get(0).setNamePokemon(name);
                    Smon.setText(""+ bag.getPokedex().get(0).getNamePokemon());
                }
                JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Smon  nickName : " + bag.getPokedex().get(0).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(0).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(0).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(0).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(0).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(0).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(0).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(0).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(0).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Amon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(data.getCard_P2() >= 1) {
                    JOptionPane.showConfirmDialog(text, "You want a set new nickname name"
                    , "going set new nickname", JOptionPane.INFORMATION_MESSAGE);
                    data.setCard_P2(data.getCard_P2() - 1);
                    String name = JOptionPane.showInputDialog(set, "Enter New Pokemon Nickname");
                    bag.getPokedex().get(1).setNamePokemon(name);
                    Amon.setText(""+bag.getPokedex().get(1).getNamePokemon());
                }
                JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Amon  nickName : " + bag.getPokedex().get(1).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(1).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(1).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(1).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(1).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(1).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(1).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(1).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(1).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Bmon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(data.getCard_P3() >= 1) {
                    JOptionPane.showConfirmDialog(text, "You want a set new nickname name"
                    , "going set new nickname", JOptionPane.INFORMATION_MESSAGE);
                    data.setCard_P3(data.getCard_P3() - 1);
                    String name = JOptionPane.showInputDialog(set, "Enter New Pokemon Nickname");
                    bag.getPokedex().get(2).setNamePokemon(name);
                    Bmon.setText("" +bag.getPokedex().get(2).getNamePokemon());
                }
                JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Bmon  nickName : " + bag.getPokedex().get(2).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(2).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(2).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(2).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(2).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(2).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(2).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(2).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(2).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Cmon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(data.getCard_P4() >= 1) {
                    JOptionPane.showConfirmDialog(text, "You want a set new nickname name"
                    +"\n\n  You can exit ", "going set new nickname", JOptionPane.INFORMATION_MESSAGE);
                    data.setCard_P4(data.getCard_P4() - 1);
                    String name = JOptionPane.showInputDialog(set, "Enter New Pokemon Nickname");
                    bag.getPokedex().get(3).setNamePokemon(name);
                    Cmon.setText(""+bag.getPokedex().get(3).getNamePokemon());
                }
                JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Cmon  nickName : " + bag.getPokedex().get(3).getNamePokemon()
                +"\n    -----------Your Pokemon Status------------"
                +"\n    Level : "+bag.getPokedex().get(3).getStatusPokemon().getLevel()
                +"\n    HP : "+bag.getPokedex().get(3).getStatusPokemon().getHP()
                +"\n    MP : "+bag.getPokedex().get(3).getStatusPokemon().getMP()
                +"\n    Power : "+bag.getPokedex().get(3).getStatusPokemon().getPower()
                +"\n    ATK : "+bag.getPokedex().get(3).getStatusPokemon().getATK()
                +"\n    Stamina : "+bag.getPokedex().get(3).getStatusPokemon().getStamina()
                +"\n    EXP / Max Exp : "+bag.getPokedex().get(3).getStatusPokemon().getEXP() +"/"+bag.getPokedex().get(3).getStatusPokemon().getMaxEXP()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Omon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String w = JOptionPane.showInputDialog(text, "You want to rename Nikname Pikachu or See Status : (Y/N)");
                if(w.equals("Yes") || w.equals("Y") || w.equals("yes") || w.equals("y")) {
                    String name = JOptionPane.showInputDialog(set, "Enter New Pokemon Nickname");
                    data.setNamePokemon01(name);
                    Omon.setText("" + data.getNamePokemon01());
                }
                else{
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"\n    Cmon  nickName : " + data.getNamePokemon01()
                    +"\n    -----------Your Pokemon Status------------"
                    +"\n    Level : "+data.getLevel()
                    +"\n    HP : "+data.getHP()
                    +"\n    MP : "+data.getMP()
                    +"\n    Power : "+data.getPower()
                    +"\n    ATK : "+data.getATK()
                    +"\n    Stamina : "+data.getStamina()
                    +"\n    EXP / Max Exp : "+data.getEXP() +"/"+data.getMaxEXP()
                        +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Status",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        backButton.addActionListener((ActionEvent e) -> {
            dispose();
            new GUIuserHouse(data, bag);
        });
        
        setBounds(100, 30, 800, 600);
        setResizable(false);
        setVisible(true);
    }

}