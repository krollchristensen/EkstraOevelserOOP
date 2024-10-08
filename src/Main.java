import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Kald hver opgave her:
        opgave1();
        opgave2();
        opgave3();
        opgave4();
        opgave5();
        opgave6();
        opgave7();
        opgave8();
        opgave9();

    }

    // Opgave 1: Gaming Setup
    public static void opgave1() {
        System.out.println("Opgave 1: Gaming Setup");
        GamingSetup setup1 = new GamingSetup("Dell", "Corsair", "Logitech", 10000);
        GamingSetup setup2 = new GamingSetup("HP", "Razer", "SteelSeries", 15000);
        setup1.printInfo();
        setup2.printInfo();
        System.out.println();
    }

    // Opgave 2: Youtuber
    public static void opgave2() {
        System.out.println("Opgave 2: Youtuber");
        Youtuber youtuber1 = new Youtuber("TechGeek", 500000, "Tech");
        Youtuber youtuber2 = new Youtuber("GamingMaster", 800000, "Gaming");
        youtuber1.printInfo();
        youtuber2.printInfo();
        System.out.println();
    }

    // Opgave 3: Streaming Service
    public static void opgave3() {
        System.out.println("Opgave 3: Streaming Service");
        StreamingService netflix = new StreamingService();
        netflix.setServiceName("Netflix");
        netflix.setSubscriptionPrice(99);
        netflix.setTotalShows(1000);
        System.out.println(netflix.getServiceName() + " - Pris: " + netflix.getSubscriptionPrice() + " DKK - Antal shows: " + netflix.getTotalShows());
        System.out.println();
    }

    // Opgave 4: Fitness App
    public static void opgave4() {
        System.out.println("Opgave 4: Fitness App");
        FitnessApp user = new FitnessApp("John", 0, 0);
        user.addSteps(5000);
        user.calculateCalories();
        user.printInfo();
        System.out.println();
    }

    // Opgave 5: Musik Playlist
    public static void opgave5() {
        System.out.println("Opgave 5: Musik Playlist");
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song 1", "Artist 1", 240));
        playlist.add(new Song("Song 2", "Artist 2", 180));
        playlist.add(new Song("Song 3", "Artist 3", 200));

        for (Song song : playlist) {
            song.printInfo();
        }
        System.out.println();
    }

    // Opgave 6: Film Anbefaling
    public static void opgave6() {
        System.out.println("Opgave 6: Film Anbefaling");
        Movie movie1 = new Movie("Action Movie", "Action", 8);
        Movie movie2 = new Movie("Drama Movie", "Drama", 6);

        movie1.recommend();
        movie2.recommend();
        System.out.println();
    }

    // Opgave 7: E-sport Turnering
    public static void opgave7() {
        System.out.println("Opgave 7: E-sport Turnering");
        Player[] players = new Player[3];
        players[0] = new Player("Player1", "TeamA", 100);
        players[1] = new Player("Player2", "TeamB", 150);
        players[2] = new Player("Player3", "TeamA", 120);

        for (Player player : players) {
            player.printInfo();
        }
        System.out.println();
    }

    // Opgave 8: Uret på smartphone
    public static void opgave8() {
        System.out.println("Opgave 8: Uret på smartphone");
        SmartphoneClock clock = new SmartphoneClock(23, 59, 50);
        clock.runClock(10);
        System.out.println();
    }

    // Opgave 9: Switch for bevægelse
    public static void opgave9() {
        System.out.println("Opgave 9: Spil Karakter");
        GameCharacter character = new GameCharacter("UP");
        character.move();
        character.setMovement("LEFT");
        character.move();
        System.out.println();
    }


}

// Klasser til opgaverne:

// Opgave 1: GamingSetup
class GamingSetup {
    String monitor;
    String keyboard;
    String mouse;
    int price;

    public GamingSetup(String monitor, String keyboard, String mouse, int price) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Monitor: " + monitor + ", Keyboard: " + keyboard + ", Mouse: " + mouse + ", Price: " + price + " DKK");
    }
}

// Opgave 2: Youtuber
class Youtuber {
    String channelName;
    int subscribers;
    String niche;

    public Youtuber(String channelName, int subscribers, String niche) {
        this.channelName = channelName;
        this.subscribers = subscribers;
        this.niche = niche;
    }

    public void printInfo() {
        System.out.println("Channel: " + channelName + ", Subscribers: " + subscribers + ", Niche: " + niche);
    }
}

// Opgave 3: StreamingService
class StreamingService {
    private String serviceName;
    private int subscriptionPrice;
    private int totalShows;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(int subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public int getTotalShows() {
        return totalShows;
    }

    public void setTotalShows(int totalShows) {
        this.totalShows = totalShows;
    }
}

// Opgave 4: FitnessApp
class FitnessApp {
    String userName;
    int stepsToday;
    int caloriesBurned;

    public FitnessApp(String userName, int stepsToday, int caloriesBurned) {
        this.userName = userName;
        this.stepsToday = stepsToday;
        this.caloriesBurned = caloriesBurned;
    }

    public void addSteps(int steps) {
        this.stepsToday += steps;
    }

    public void calculateCalories() {
        this.caloriesBurned = (int) (stepsToday * 0.04);
    }

    public void printInfo() {
        System.out.println(userName + " - Steps: " + stepsToday + ", Calories burned: " + caloriesBurned);
    }
}

// Opgave 5: Song
class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println("Song: " + title + ", Artist: " + artist + ", Duration: " + duration + " seconds");
    }
}

// Opgave 6: Movie
class Movie {
    String title;
    String genre;
    int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void recommend() {
        if (rating > 7) {
            System.out.println("We recommend watching " + title + " (" + genre + ")");
        } else {
            System.out.println(title + " might not be the best choice.");
        }
    }
}

// Opgave 7: Player
class Player {
    String playerName;
    String team;
    int score;

    public Player(String playerName, String team, int score) {
        this.playerName = playerName;
        this.team = team;
        this.score = score;
    }

    public void printInfo() {
        System.out.println("Player: " + playerName + ", Team: " + team + ", Score: " + score);
    }
}

// Opgave 8: SmartphoneClock
class SmartphoneClock {
    int hours;
    int minutes;
    int seconds;

    public SmartphoneClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void runClock(int ticks) {
        for (int i = 0; i < ticks; i++) {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
            if (hours == 24) {
                hours = 0;
            }
            System.out.println(String.format("Time: %02d:%02d:%02d", hours, minutes, seconds));
        }
    }
}

// Opgave 9: GameCharacter
class GameCharacter {
    String movement;

    public GameCharacter(String movement) {
        this.movement = movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void move() {
        switch (movement) {
            case "UP":
                System.out.println("Character moves up");
                break;
            case "DOWN":
                System.out.println("Character moves down");
                break;
            case "LEFT":
                System.out.println("Character moves left");
                break;
            case "RIGHT":
                System.out.println("Character moves right");
                break;
            default:
                System.out.println("Invalid movement");
        }
    }
}


