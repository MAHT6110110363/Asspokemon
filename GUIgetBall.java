import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIgetBall extends JFrame{
    //private DataUser data2;

    public GUIgetBall(DataUser data, BagUser bag) {
        super("Get Ball");

        //data2 = data;

        ImageIcon background = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIgetBall\\imgGround11.JPG");
        ImageIcon ball = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIgetBall\\pokeBall.GIF");
        JPanel platePanel = new JPanel();
        JLabel backGround = new JLabel("", background, JLabel.CENTER);
        JButton ballButton = new JButton("Click Me!", ball);

        platePanel.setLayout(null);
        platePanel.setSize(1024, 768);

        backGround.setBounds(0, 30, 1024, 640);
        ballButton.setBounds(100, 100, 200, 120);
        platePanel.setBackground(Color.GRAY);

        // set BackButton
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        backButton.setBackground(new Color(219, 135, 50));
        backButton.setBounds(830, 680, 150, 40);

        platePanel.add(backButton);
        platePanel.add(ballButton);
        platePanel.add(backGround);
        
        add(platePanel);

        

        ballButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                JOptionPane text = new JOptionPane();
                int rategetball = (int)(Math.random()*100);

                if (rategetball <= 50) {
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Wai Wai Wai You not GetBall Wayyyyy"
                    +"\n    Your Pokeball : "+data.getPokeBall()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "Not get right !", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(rategetball <= 60) {
                    data.setPokeBall(data.getPokeBall() + 1);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Good You get 1 Ball"
                    +"\n    Your Pokeball : "+data.getPokeBall()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "get right !", JOptionPane.INFORMATION_MESSAGE);
                }

                else if(rategetball <= 70) {
                    data.setPokeBall(data.getPokeBall() + 2);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"Good You get 2 Ball"
                    +"\n    Your Pokeball : "+data.getPokeBall()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "get right !", JOptionPane.INFORMATION_MESSAGE);
                }

                else if(rategetball >= 70) {
                    data.setPokeBall(data.getPokeBall() + 3);
                    JOptionPane.showMessageDialog(text, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                    +"WoW Baby a Triple Balls"
                    +"\n    Your Pokeball : "+data.getPokeBall()
                    +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "So Goood !" , JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        backButton.addActionListener((ActionEvent e) -> {
            dispose();
            new GUImenu(data, bag);
        });

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true); 
    
    }


}