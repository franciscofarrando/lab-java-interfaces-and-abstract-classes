package VideoStreamingService;

public class TvSeries extends Video{
    private int episode;

    public TvSeries(String title, int duration, int episode) {
        super(title, duration);
        this.episode=episode;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    @Override
    public String getInfo() {
        return getTitle() + ", " + getDuration() + ", " + getEpisode();
    }
}
