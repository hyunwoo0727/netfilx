package merge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MovieBean {
	private String movieTitle,createYear,subTitle,movieStory,ageGrade,runningTime,
	  mainActor,category,movieGenre, producer,movieTrait,movieReview,moviePicture[]
	  ,fileName,language,regDate;
	//grade point average
	private int serialNo,gpa,season,episode,movieCode;
	
	public MovieBean(String movieTitle, String createYear, String subTitle, String movieStory, String ageGrade,
			String runningTime, String mainActor, String category, String movieGenre, String producer,
			String movieTrait, String[] moviePicture, String fileName, String language, int season, int episode,
			int movieCode) {
		this.movieTitle = movieTitle;
		this.createYear = createYear;
		this.subTitle = subTitle;
		this.movieStory = movieStory;
		this.ageGrade = ageGrade;
		this.runningTime = runningTime;
		this.mainActor = mainActor;
		this.category = category;
		this.movieGenre = movieGenre;
		this.producer = producer;
		this.movieTrait = movieTrait;
		this.moviePicture = moviePicture;
		this.fileName = fileName;
		this.language = language;
		this.season = season;
		this.episode = episode;
		this.movieCode = movieCode;
		this.regDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.gpa = 0;
		this.movieReview = "";
	//	this.serialNo = 0;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public String getCreateYear() {
		return createYear;
	}
	public void setCreateYear(String createYear) {
		this.createYear = createYear;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getMovieStory() {
		return movieStory;
	}
	public void setMovieStory(String movieStory) {
		this.movieStory = movieStory;
	}
	public String getAgeGrade() {
		return ageGrade;
	}
	public void setAgeGrade(String ageGrade) {
		this.ageGrade = ageGrade;
	}
	public String getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	public String getMainActor() {
		return mainActor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public int getEpisode() {
		return episode;
	}
	public void setEpisode(int episode) {
		this.episode = episode;
	}
	public String getRegDate() {
		return regDate;
	}
	public int getMovieCode() {
		return movieCode;
	}
	public int getSerialNo() {
		return serialNo;
	}
}
