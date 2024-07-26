import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        //Create an ArrayList to store TvShow objects
        ArrayList<TvShow> tvShows = new ArrayList<>();

        //Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //Ask for the show name
            System.out.print("Name of the TV show (press enter to stop): ");
            String showName = scanner.nextLine();

            //If the show name is empty, exit the loop
            if (showName.isEmpty()) {
                break;
            }

            //Ask for the number of episodes
            System.out.print("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            //Ask for the genre of the TV show
            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            //Create TvShow objects using the different constructors
            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));  // Constructor with all attributes
            tvShows.add(new TvShow(showName));                             // Constructor with only showName
            tvShows.add(new TvShow(numberOfEpisodes));                     // Constructor with only numberOfEpisodes
            tvShows.add(new TvShow(genre, true));                          // Constructor with only genre
            tvShows.add(new TvShow());                                    // Default constructor
        }

        //Print the list of TV shows
        System.out.println("List of TV Shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
