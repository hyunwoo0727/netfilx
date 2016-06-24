package merge;

import java.util.Vector;

public interface MovieUserService {
	public MovieBean play(int serialNo);
	public Vector<MovieBean> searchMovie(String word);
	public Vector<MovieBean> sortRegdate();
	public Vector<MovieBean> sortGPA();
	public Vector<MovieBean> getSeason(int movieCode,int season);
	public Vector<MovieBean> getSimilarMovies(String movieGenre);
	public void writeReview(int gpa,String review);
	public void addFavorite(int movieCode);
}
