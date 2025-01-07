package TheBoys;
import java.util.*;
import java.util.List;


import javax.swing.*;
import java.awt.*;
public class Season4 {
    JFrame frame= new JFrame("Season 2 Ratings");


    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    public Season4() {
        HashMap<String, Double> Season4episodes = new HashMap<String, Double>();
        Season4episodes.put("Episode 1: Department of Dirty Tricks", 7.4);
        Season4episodes.put("Episode 2: Life Among the Septics", 7.1);
        Season4episodes.put("Episode 3: We'll Keep the Red Flag Flying Here", 7.5);
        Season4episodes.put("Episode 4: Wisdom of the Ages", 8.9);
        Season4episodes.put("Episode 5: Beware the Jabberwock, My Son", 8.1);
        Season4episodes.put("Episode 6: Dirty Business", 7.5);
        Season4episodes.put("Episode 7: The Insider", 8.3);
        Season4episodes.put("Episode 8: Season Four Finale", 9.1);
        List<Map.Entry<String, Double>> episodeList = new ArrayList<>(Season4episodes.entrySet());
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
        sb.append("<h1>  Season 4 Ratings</h1>");  // Title with HTML heading tag
        for (Map.Entry<String, Double> entry : sortedEpisodes.entrySet()) {
            sb.append("<li>")
                    .append(entry.getKey())
                    .append(" - Rating: ")
                    .append(entry.getValue())
                    .append("</li>");

        }
        sb.append("</ul></body></html>");
        JFrame frame = new JFrame("Season 4 Episodes Ranked ");
        JLabel label = new JLabel(sb.toString()); // No need to prepend <html> again here
        label.setFont(new Font("Arial", Font.PLAIN, 29)); // Set a font that fits well
        label.setPreferredSize(new Dimension(800, 600)); // Set a preferred size to accommodate the text


        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(label), BorderLayout.CENTER); // Add a JScrollPane for scrolling if necessary

        frame.setSize(1000, 800); // Set an appropriate size for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        PrintSeason4();
    }
    public void PrintSeason4(){
        Season episode1 = new Season("S4.E1 Department of Dirty Tricks",
                "After Butcher misses his opportunity to kill Homelander by Soldier Boy, he attempts to get Ryan back on his side and correct his mistakes. Meanwhile, Homelander seeks out a new ally as he struggles to come to terms with his mortality.",
                7.4);

        Season episode2 = new Season("S4.E2 Life Among the Septics",
                "Did you know that globalists put chemicals in our food that make us gay, Dakota Bob is a demon from hell, and the Moon isn't real? Find out what they want to keep from us #TruthCon.",
                7.1);

        Season episode3 = new Season("S4.E3 We'll Keep the Red Flag Flying Here",
                "The problems have started between Homelander and Starlight supporters. Hughie tries to figure out what's going on between Homelander and Victoria Neuman.",
                7.5);

        Season episode4 = new Season("S4.E4 Wisdom of the Ages",
                "Vought News Network is proud to announce its new series #Truthbomb! Join host Firecracker and her celebrity guests for the live 6-hour premiere as they expose Starlight's Adrenochrome Parties!",
                8.9);

        Season episode5 = new Season("S4.E5 Beware the Jabberwock, My Son",
                "While caring for his dying father, Hughie faces intrigue at Vought. Homelander bonds with Ryan, and the Boys break Stan out to obtain the Anti-Supe virus, battling killer sheep along the way.",
                8.1);

        Season episode6 = new Season("S4.E6 Dirty Business",
                "Vernon Correctional Services provides compassionate rehabilitation to those in our care to prepare them for successful community reentry. At Vernon, it's not about custody. It's about family.",
                7.5);

        Season episode7 = new Season("S4.E7 The Insider",
                "Hey kids. Did you know your neighbor, uncle, or even Mom and Dad might be trying to destroy America? Find out how to stop them on the Avenue V Christmas Special!. If you see something, say something!.",
                8.3);

        Season episode8 = new Season("S4.E8 Season Four Finale",
                "Calling all patriots! We will not allow this stolen election to be certified tomorrow! We must stop Bob Singer's woke anti-Supe agenda! PREPARE FOR WAR! #WhereWeGoOneWeGoVought",
                9.1);
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


