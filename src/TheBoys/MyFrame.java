package TheBoys;

import javax. swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MyFrame  extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel buttonLabel;
    JLabel label2=new JLabel();
    MyFrame() {
        // Initialize the frame
        this.setTitle("The Boys Sorter ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(900, 900);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.yellow);
        ImageIcon Icon = new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\61189R+UonL._AC_UF1000,1000_QL80_.jpg");
       ImageIcon S1Icon =new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\BoysSeason1.jpg");
        ImageIcon S2Icon =new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\BoysSeason2.jpg");
        ImageIcon S3Icon =new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\BoysSeason3.jpg");
        ImageIcon S4Icon =new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\TheBoysSeason4.jpg");

        label2 = new JLabel();
        label2.setText("Click to Display Season Ratings");
        label2.setIcon(Icon);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setIconTextGap(50);
        label2.setForeground(Color.black);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label2.setBorder(BorderFactory.createLineBorder(Color.red, 6));
        label2.setBounds(500, 80, 340, 375);
        this.add(label2);

        // Initialize and configure buttonLabel
        buttonLabel = new JLabel();

        buttonLabel.setBounds(150, 250, 150, 150);
        this.add(buttonLabel);

        buttonLabel.setBounds(150, 250, 150, 150);


        button = new JButton("Season 1");
        button.setBounds(35, 500, 400, 125);
        button.addActionListener(this); // Add action listener to the button
        button.setFocusable(false);
button.setIcon(S1Icon);
        button.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button.setIconTextGap(-15);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.getContentPane().add(button);

        button2 = new JButton();
        button2.setBounds(500, 500, 300, 125);
        button2.addActionListener(this); // Add action listener to the button
        button2.setFocusable(false);
        button2.setIcon(S2Icon);
        button2.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button2.setIconTextGap(-15);
        button2.setBorder(BorderFactory.createEtchedBorder());
        this.getContentPane().add(button2);

        button3 = new JButton("");
        button3.setBounds(35, 700, 400, 125);
        button3.addActionListener(this); // Add action listener to the button
        button3.setFocusable(false);
        button3.setIcon(S3Icon);
        button3.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button3.setIconTextGap(-15);
        button3.setBorder(BorderFactory.createEtchedBorder());
        this.getContentPane().add(button3);

        button4 = new JButton("");
        button4.setBounds(500, 700, 375, 125);
        button4.addActionListener(this); // Add action listener to the button
        button4.setFocusable(false);
        button4.setIcon(S4Icon);
        button4.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button4.setIconTextGap(-15);
        button4.setBorder(BorderFactory.createEtchedBorder());
        this.getContentPane().add(button4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Handle button1
            Season1 season1Window = new Season1();

        } else if (e.getSource() == button2) {
            // Handle button2
Season2 season1Window= new Season2();

        } else if (e.getSource() == button3) {
            // Handle button3
            Season3 season1Window= new Season3();
        } else if (e.getSource() == button4) {
            // Handle button4
            Season4 season1Window= new Season4();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}
