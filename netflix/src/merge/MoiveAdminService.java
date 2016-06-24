package merge;

import java.util.Vector;

public interface MoiveAdminService {
	public void registMovie(MovieBean movieBean);
	public void updateMovie(MovieBean movieBean);
	public void deldteMovie(MovieBean movieBean);
	public Vector<MovieBean> getListAll();
	public Vector<MovieBean> getListByCategory(String category);
	public Vector<MovieBean> getListByTitle(String movieTitle);
}
