package jongj;

public class MovieDetailInfo {
	// 출연배우, 연출가, 영화장르 , 시청제한연령
		private String actorList[],directorList[],movieGenre[],watchLimit;

		public String[] getActorList() {
			return actorList;
		}

		public void setActorList(String[] actorList) {
			this.actorList = actorList;
		}

		public String[] getDirectorList() {
			return directorList;
		}

		public void setDirectorList(String[] directorList) {
			this.directorList = directorList;
		}

		public String[] getMovieGenre() {
			return movieGenre;
		}

		public void setMovieGenre(String[] movieGenre) {
			this.movieGenre = movieGenre;
		}

		public String getWatchLimit() {
			return watchLimit;
		}

		public void setWatchLimit(String watchLimit) {
			this.watchLimit = watchLimit;
		}
}
