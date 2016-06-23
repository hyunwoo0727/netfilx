package jongj;

public class NetflixMain {
	// 내동영상목록,넷플릭스 오리지널 목록, 인기영화목록,현재영화목록
	private MovieInfo myMovieList[],netflixOriginalList[],moviePopList[],nowMovieList[];
	// 검색단어, 
	private String serchWord;
	public MovieInfo[] getMyMovieList() {
		return myMovieList;
	}
	public void setMyMovieList(MovieInfo[] myMovieList) {
		this.myMovieList = myMovieList;
	}
	public MovieInfo[] getNetflixOriginalList() {
		return netflixOriginalList;
	}
	public void setNetflixOriginalList(MovieInfo[] netflixOriginalList) {
		this.netflixOriginalList = netflixOriginalList;
	}
	public MovieInfo[] getMoviePopList() {
		return moviePopList;
	}
	public void setMoviePopList(MovieInfo[] moviePopList) {
		this.moviePopList = moviePopList;
	}
	public MovieInfo[] getNowMovieList() {
		return nowMovieList;
	}
	public void setNowMovieList(MovieInfo[] nowMovieList) {
		this.nowMovieList = nowMovieList;
	}
	public String getSerchWord() {
		return serchWord;
	}
	public void setSerchWord(String serchWord) {
		this.serchWord = serchWord;
	}
	
	
}
