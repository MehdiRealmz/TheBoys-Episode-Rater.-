package TheBoys;
import java.awt.*;
import java.util.*;
import java.util.List;


import javax.swing.*;

public class Season1 {
    JFrame frame= new JFrame("Season 2 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    public Season1() {
        HashMap<String, Double> Season1episodes = new HashMap<String, Double>();
        Season1episodes.put("Episode 1: The Name of the Game", 8.7);
        Season1episodes.put("Episode 2: Cherry", 8.5);
        Season1episodes.put("Episode 3: Get Some", 8.3);
        Season1episodes.put("Episode 4: The Female of the Species", 8.7);
        Season1episodes.put("Episode 5: Good for the Soul", 8.3);
        Season1episodes.put("Episode 6: The Innocents", 8.1);
        Season1episodes.put("Episode 7: The Self-Preservation Society", 8.7);
        Season1episodes.put("Episode 8: You Found Me", 9.1);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season1episodes.entrySet());
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
        sb.append("<h1>  Season 1 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");

        //Create the Frame
        JFrame frame = new JFrame("Season 1 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason1();
    }
    public void PrintSeason1(){


        List<Season> S1Episodes = new ArrayList<>();
       S1Episodes.add(new Season("S1.E1 The Name of the Game",
               "When a Supe kills the love of his life, A/V salesman Hughie Campbell teams up with Billy Butcher, a vigilante hell-bent on punishing corrupt Supes -- and Hughie's life will never be the same again.",
               8.7));
        S1Episodes.add(new Season("S1.E2 Cherry",
                "The Boys get themselves a Superhero, Starlight gets payback, Homelander gets naughty, and a Senator gets naughtier.",
                8.5));

        S1Episodes.add(new Season("S1.E3 Get Some",
                "It's the race of the century. A-Train versus Shockwave, vying for the title of World's Fastest Man. Meanwhile, the Boys are reunited and it feels so good.",
                8.3));

        S1Episodes.add(new Season("S1.E4 The Female of the Species",
                "On a very special episode of The Boys... an hour of guts, gutterballs, airplane hijackings, madness, ghosts, and one very intriguing Female. Oh, and lots of heart -- both in the sentimental sense, and in the gory literal sense.",
                8.7));

        S1Episodes.add(new Season("S1.E5 Good for the Soul",
                "The Boys head to the 'Believe' Expo to follow a promising lead in their ongoing war against the Supes. There might -- MIGHT -- be a homicidal infant, but you'll have to see for yourself.",
                8.3));

        S1Episodes.add(new Season("S1.E6 The Innocents",
                "SUPER IN AMERICA (2019). Vought Studios. Genre: Reality. Starring: Homelander, Queen Maeve, Black Noir, The Deep, A-Train, Starlight, Tara Reid, Billy Zane.",
                8.1));

        S1Episodes.add(new Season("S1.E7 The Self-Preservation Society",
                "Never trust a washed-up Supe -- the Boys learn this lesson the hard way. Meanwhile, Homelander digs into his past, Starlight discovers that love hurts, and if you're ever in Sandusky, Ohio and a girl asks if she can touch your gills, say NO.",
                8.7));

        S1Episodes.add(new Season("S1.E8 You Found Me",
                "Season Finale Time! Questions answered! Secrets revealed! Conflicts... conflicted! Characters exploded! And so much more!",
                9.1));
        for (Season episode : S1Episodes) {
            System.out.println(episode);
        }

    }
}
