package TheBoys;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;

import java.awt.*;
import java.util.Scanner;


public class TheBoysSorter {
    public static void main(String[] args) {
        MyFrame MyFrame =new MyFrame();
        MyFrame WoWFrame =new MyFrame();
        Border thinBorder = BorderFactory.createLineBorder(Color.red, 10); // Adjust thickness here
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10); // Adjust padding here
        Border combinedBorder = BorderFactory.createCompoundBorder(thinBorder, emptyBorder);

        JLabel label=new JLabel();
        JLabel label2=new JLabel();


        MyFrame.add(label);
        WoWFrame.add(label2);
        ImageIcon image=new ImageIcon("C:\\Users\\smarv\\IdeaProjects\\TheBoysEpisodeSorter\\src\\TheBoys\\The_Boys_Season_2.jpg");
        label.setText(" The Boys TV Show " +
                "Sorter " );
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIconTextGap(15);
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBorder(combinedBorder);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,890,890);
        MyFrame.setVisible(true);





        Scanner in= new Scanner(System.in);
        System.out.println("Select South Park Season to view:  1 - 26 ");

        int UserSeason;  //Store user Input
        UserSeason=in.nextInt();

        switch(UserSeason){
            case 1:
                 //printS1 to print season 1



                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
    }
}
    }
