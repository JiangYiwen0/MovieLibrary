public class Movie {
   private String movieName;
   private int releaseYear;
;
   private String director;
   private int ranking;
   private String oscarOrNot;

   public void setMovieName(String movieName) {
      this.movieName = movieName;
   }

   public String getMovieName() {
      return movieName;
   }

   public void setReleaseYear(int releaseYear) {
      this.releaseYear = releaseYear;
   }

   public int getReleaseYear() {
      return releaseYear;
   }

   public void setDirector(String director) {
      this.director = director;
   }

   public String getDirector() {
      return director;
   }

   public void setRanking(int ranking) {
      this.ranking = ranking;
   }

   public int getRanking() {
      return ranking;
   }

   public void setOscarOrNot(String oscarOrNot) {
      this.oscarOrNot = oscarOrNot;
   }

   public String getOscarOrNot() {
      return oscarOrNot;
   }

   public Movie(String setName, int releaseYear, String director, int ranking, String oscarOrNot) {

   }


   public Movie find(String movieName) {

       return null;
   }
}
