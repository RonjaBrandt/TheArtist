public class Main {


    public static void main(String[] args) {


        Artist artist = new Artist();
        artist.playSound("Andy Black", "The Void");

        Perform actor = (name, song) -> System.out.println(name + " sings the song "+ song);
        actor.playSound("Anthony Stewart Heada", "Thankless Job");
    }
}
