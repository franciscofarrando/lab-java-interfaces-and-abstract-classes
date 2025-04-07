package VideoStreamingService;

public class VideoFactory {
    public static void main(String[] args) {
        Video video1 = new TvSeries("Lost", 90, 40);
        Video video2 = new Movie("Casablanca", 130, 4.5);


        System.out.println(video1.getInfo());
        System.out.println(video2.getInfo());
    }
}
