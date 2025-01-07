package TheBoys;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;

public class Season3 {
    JFrame frame= new JFrame("Season 2 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    public Season3() {
        HashMap<String, Double> Season3episodes = new HashMap<String, Double>();
        Season3episodes.put("Episode 1: Payback", 8.3);
        Season3episodes.put("Episode 2: The Only Man in the Sky", 8.6);
        Season3episodes.put("Episode 3: Barbary Coast", 8.2);
        Season3episodes.put("Episode 4: Glorious Five Year Plan", 8.9);
        Season3episodes.put("Episode 5: The Last Time to Look on This World of Lies", 8.3);
        Season3episodes.put("Episode 6: Herogasm", 9.6);
        Season3episodes.put("Episode 7: Here Comes a Candle to Light You to Bed", 8.8);
        Season3episodes.put("Episode 8: The Instant White-Hot Wild", 8.2);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season3episodes.entrySet());
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
        sb.append("<h1>  Season 3 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");
        JFrame frame = new JFrame("Season 3 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason3();
    }

    public void PrintSeason3(){
        Season episode1 = new Season("S3.E1 Payback",
                "One year following Stormfront's public controversy, Butcher and the Boys now work as contractors for Neuman's Bureau of Superhero Affairs in order to apprehend problematic Supes, with Hughie acting as their liaison.",
                8.3);

        Season episode2 = new Season("S3.E2 The Only Man in the Sky",
                "Homelander, America's greatest Supe. Defending our shores from sea to shining sea. Today, America honors him on his birthday. Vought Shopping Network is celebrating by offering an exclusive Homelander Limited Birthday Edition Gold Coin.",
                8.6);

        Season episode3 = new Season("S3.E3 Barbary Coast",
                "Tonight at 9/8C on Vought Plus, it's the season finale of #AmericanHero. Three contestants remain, but only TWO will join #TheSeven. Will Starlight choose her old flame Supersonic? Or will someone else be moving into the Seven Tower?",
                8.2);

        Season episode4 = new Season("S3.E4 Glorious Five Year Plan",
                "The Boys search for a mysterious weapon in Russia while things are brewing behind the scenes at Vought. Plenty of trouble, gore and twists to foresee.",
                8.9);

        Season episode5 = new Season("S3.E5 The Last Time to Look on This World of Lies",
                "The Boys run into a major obstacle in their mission to stop the Seven and turn their attention to Soldier Boy. Homelander continues to make changes that fit his agenda at Vought International.",
                8.3);

        Season episode6 = new Season("S3.E6 Herogasm",
                "You’re invited to the 70th Annual Herogasm! You must present this invitation in order to be admitted! Same rules as always: no cameras, no non-Supe guests unless they sign an NDA and they’re DTF, and no telling any news media! It’s BYOD, but food, alcohol and lube will be provided! And please remember to RSVP so we can get an accurate headcount for the caterer!",
                9.6);

        Season episode7 = new Season("S3.E7 Here Comes a Candle to Light You to Bed",
                "Everything's changing as never expected for the Homelander. Soldier Boy is searching for the other old payback members to slay. Black Noir recollects what has really got him to the current situation.",
                8.8);

        Season episode8 = new Season("S3.E8 The Instant White-Hot Wild",
                "Calling all patriots! Let's show Homelander we've got his back and we're not going to let Starlight and her House of Horrors get away with trafficking children and drinking their adrenaline! It's time for real Americans to fight back! Join the Hometeamers and Stormchasers tomorrow at Vought Square! Stand back and stand by!",
                8.2);
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

