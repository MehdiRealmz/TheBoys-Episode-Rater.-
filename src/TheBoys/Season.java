package TheBoys;

public class Season {

    private String name;
    private String description;
    private double rating;


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public Season(String name, String description, double rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public String toString() {
        return "Title: " + name + ", Description: " + description + ", Rating: " + rating;
    }
}



