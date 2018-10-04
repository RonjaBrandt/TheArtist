public class Artist implements Perform {
    @Override
    public void playSound(String name, String song) {
        System.out.println(name + " sings the song "+song);
    }
}
