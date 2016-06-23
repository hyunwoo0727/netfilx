package jongj;

public class CommonMovie {
	// 비슷한 동영상 리스트 , 제작년도, 연령제한, 상영시간,영화줄거리
	private String MovieList[], createYear[], limitAge[], runningTime[], movieStory[];

	// 영화별점
	private int movieScore[];

	public String[] getMovieList() {
		return MovieList;
	}

	public void setMovieList(String[] movieList) {
		MovieList = movieList;
	}

	public String[] getCreateYear() {
		return createYear;
	}

	public void setCreateYear(String[] createYear) {
		this.createYear = createYear;
	}

	public String[] getLimitAge() {
		return limitAge;
	}

	public void setLimitAge(String[] limitAge) {
		this.limitAge = limitAge;
	}

	public String[] getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(String[] runningTime) {
		this.runningTime = runningTime;
	}

	public String[] getMovieStory() {
		return movieStory;
	}

	public void setMovieStory(String[] movieStory) {
		this.movieStory = movieStory;
	}

	public int[] getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(int[] movieScore) {
		this.movieScore = movieScore;
	}
}
