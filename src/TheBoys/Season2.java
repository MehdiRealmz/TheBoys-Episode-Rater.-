package TheBoys;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season2 {
    JFrame frame = new JFrame("Season 2 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);

    public Season2() {
        HashMap<String, Double> Season2episodes = new HashMap<String, Double>();
        Season2episodes.put("Episode 1: The Big Ride", 8.1);
        Season2episodes.put("Episode 2: Proper Preparation and Planning", 7.7);
        Season2episodes.put("Episode 3: Over the Hill with the Swords of a Thousand Men", 9.0);
        Season2episodes.put("Episode 4: Nothing Like It in the World", 8.0);
        Season2episodes.put("Episode 5: We Gotta Go Now", 8.3);
        Season2episodes.put("Episode 6: The Bloody Doors Off", 8.9);
        Season2episodes.put("Episode 7: Butcher, Baker, Candlestick Maker", 9.0);
        Season2episodes.put("Episode 8: What I Know", 9.4);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season2episodes.entrySet());
        episodeList.sort(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });
        LinkedHashMap<String, Double> sortedEpisodes = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : episodeList) {
            sortedEpisodes.put(entry.getKey(), entry.getValue());
        }

        // Build the HTML string as an unordered list
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><ul>");
        sb.append("<h1>  Season 2 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");
        JFrame frame = new JFrame("Season 2 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason2();
    }

    public void PrintSeason2(){
        Season episode1 = new Season("S2.E1 The Big Ride",
                "With Butcher still missing, Hughie, Mother's Milk, Frenchie, and Kimiko are now fugitives, and Homelander and Vought are more powerful than ever. But just as the Boys are about to leave the country, they are pulled back into the fray.",
                8.1);

        Season episode2 = new Season("S2.E2 Proper Preparation and Planning",
                "Butcher is back with the Boys, but tensions flare with Hughie. Homelander spends quality time with his new 'family.' Starlight and Stormfront bond at a press junket and the Boys hunt down a super terrorist with a startling identity.",
                7.7);

        Season episode3 = new Season("S2.E3 Over the Hill with the Swords of a Thousand Men",
                "The Boys take to the high seas to safeguard their prisoner. Homelander plays house, then pushes Ryan over the edge. Starlight is forced to make an impossible choice. Stormfront reveals her true character.",
                9.0);

        Season episode4 = new Season("S2.E4 Nothing Like It in the World",
                "Milk, Hughie, and Annie go on a road trip to find Liberty. Frenchie has relationship problems, and Homelander continues to unravel.",
                8.0);

        Season episode5 = new Season("S2.E5 We Gotta Go Now",
                "Butcher has no more intentions to fight with Supes but Black Noir traced his location and found him: what will he do now? Supes are shooting a film named - #Dawn Of The Seven. Homelander is doing what Stormfront told him to do.",
                8.3);

        Season episode6 = new Season("S2.E6 The Bloody Doors Off",
                "When The Boys and Starlight follow a lead to Vought's mysterious Sage Grove Center, they find one of Vought's darkest secrets - and someone even darker from their past. Meanwhile Homelander and Stormfront's relationship deepens.",
                8.9);

        Season episode7 = new Season("S2.E7 Butcher, Baker, Candlestick Maker",
                "To help Victoria Neuman make a case against Vought, Mallory and The Boys look to an unlikely source for answers. Hughie gets terrifying news about Starlight. Meanwhile, Homelander and Stormfront further their master plan for Compound V.",
                9.0);

        Season episode8 = new Season("S2.E8 What I Know",
                "Becca shows up on Butcher's doorstep and begs for his help. The Boys agree to back Butcher, and together with Starlight, they finally face off against Homelander and Stormfront. But things go very bad, very fast.",
                9.4);
        System.out.println(episode1);
        System.out.println(episode2);
        System.out.println(episode3);
        System.out.println(episode4);
        System.out.println(episode5);
        System.out.println(episode6);
        System.out.println(episode7);
        System.out.println(episode8);

    }
    }

