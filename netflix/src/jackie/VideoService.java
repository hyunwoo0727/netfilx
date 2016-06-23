package jackie;

public interface VideoService {
	public void showMovieInfo(String title, String summary, String rating, String duration, String date, String season);
	public void play();
	public void pause();
	public void ff();
	public void rewind();
	public void showSubtitle();
}
