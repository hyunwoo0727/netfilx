package jongj;

public class MovieInfo {
	// 타이틀, 제작년도, 시청연령대 ,상영시간, 줄거리,주연배우,영화장르,영화특징
		// 영화평, 영화미리보기 사진
		private String movieTitle,createYear,limitAge,runningTime,movieStory
					  ,mainActor,movieGenre,movieChar,movieTrait,movieReview,moviePicture[],fileName;

		//영화별점
		int movieScore;
		
		public MovieInfo(String movieTitle,String createYear,String runningTime,String movieGenre,String mainActor){
			this.movieTitle = movieTitle;
			this.createYear = createYear;
			this.runningTime = runningTime;
			this.movieGenre = movieGenre;
			this.mainActor = mainActor;
			this.movieScore = 0;
		}
		public String getMovieTitle() {
			return movieTitle;
		}

		public void setMovieTitle(String movieTitle) {
			this.movieTitle = movieTitle;
		}
		public String getCreateYear() {
			return createYear;
		}
		public String getLimitAge() {
			return limitAge;
		}
		public void setLimitAge(String limitAge) {
			this.limitAge = limitAge;
		}
		public String getRunningTime() {
			return runningTime;
		}
		public String getMovieStory() {
			return movieStory;
		}
		public void setMovieStory(String movieStory) {
			this.movieStory = movieStory;
		}
		public String getMainActor() {
			return mainActor;
		}
		public String getMovieGenre() {
			return movieGenre;
		}
		public String getMovieChar() {
			return movieChar;
		}
		public void setMovieChar(String movieChar) {
			this.movieChar = movieChar;
		}
		public String getMovieTrait() {
			return movieTrait;
		}
		public void setMovieTrait(String movieTrait) {
			this.movieTrait = movieTrait;
		}
		public String getMovieReview() {
			return movieReview;
		}
		public void setMovieReview(String movieReview) {
			this.movieReview = movieReview;
		}
		public String[] getMoviePicture() {
			return moviePicture;
		}
		public void setMoviePicture(String[] moviePicture) {
			this.moviePicture = moviePicture;
		}
		public int getMovieScore() {
			return movieScore;
		}
		public void setMovieScore(int movieScore) {
			this.movieScore = movieScore;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
}	
