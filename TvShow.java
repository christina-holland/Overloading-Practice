public class TvShow {
    //Attributes for the show name, number of episodes, and genre
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    //Default constructor
    public TvShow() {
        this.showName = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    //Constructor with showName
    public TvShow(String showName) {
        this.showName = showName;
        this.numberOfEpisodes = 0;
        this.genre = "Unknown";
    }

    //Constructor with numberOfEpisodes
    public TvShow(int numberOfEpisodes) {
        this.showName = "Unknown";
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = "Unknown";
    }

    //Constructor with genre
    public TvShow(String genre, boolean isGenre) { // Added boolean flag to differentiate
        this.showName = "Unknown";
        this.numberOfEpisodes = 0;
        this.genre = genre;
    }

    //Constructor with all attributes
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    //Getter for showName
    public String getShowName() {
        return showName;
    }

    //Getter for numberOfEpisodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    //Getter for genre
    public String getGenre() {
        return genre;
    }

    //toString method to return the details of the TV show
    @Override
    public String toString() {
        return getShowName() + " has " + getNumberOfEpisodes() + " episodes. The genre is " + getGenre() + ".";
    }
}
