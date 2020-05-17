import javax.swing.*;
import javax.xml.crypto.Data;

import java.awt.*;
import java.awt.event.*;

public class GUImenu extends JFrame {

    public GUImenu(DataUser data, BagUser bag) {
        super("Menu");

        ImageIcon imgMenu = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUImenu\\imgGround03.JPG");

        JPanel backGroundPanel01 = new JPanel();
        JLabel menuLabel = new JLabel("", imgMenu, JLabel.CENTER);
        JButton travelButton = new JButton("Travel");
        JButton getBallButton = new JButton("Get Balls");
        JButton houseButton = new JButton("My House");
        JButton exitButton = new JButton("Exit");
        
        travelButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        getBallButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        houseButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));
        exitButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 20));

        backGroundPanel01.setSize(1024, 768);
        backGroundPanel01.setLayout(null);
        menuLabel.setBounds(5, 50, 1000, 625);
        menuLabel.setLayout(null);
        travelButton.setBounds(600, 200, 200, 50);
        travelButton.setLayout(null);
        
        getBallButton.setBounds(600, 300, 200, 50);
        houseButton.setBounds(600, 400, 200, 50);
        exitButton.setBounds(600, 500, 200, 50);

        backGroundPanel01.setBackground(Color.GRAY);
        travelButton.setBackground(new Color(219, 135, 50));
        getBallButton.setBackground(new Color(219, 135, 50));
        houseButton.setBackground(new Color(219, 135, 50));
        exitButton.setBackground(new Color(219, 135, 50));

        backGroundPanel01.add(travelButton);
        backGroundPanel01.add(getBallButton);
        backGroundPanel01.add(houseButton);
        backGroundPanel01.add(exitButton);
        backGroundPanel01.add(menuLabel);
        add(backGroundPanel01);

        travelButton.addActionListener((final ActionEvent e) -> {
            new GUIplace(data, bag);
            dispose();

        });

        getBallButton.addActionListener((final ActionEvent e) -> {
            new GUIgetBall(data, bag);
            dispose();

        });

        houseButton.addActionListener((final ActionEvent e) -> {
            new GUIuserHouse(data, bag);
            dispose();

        });

        exitButton.addActionListener((final ActionEvent e) -> {
            System.exit(0);

        });

        

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
}