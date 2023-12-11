public class Movie {
   private int id;
   private String movieName;
   private int releaseYear;
   private String director;
   private int ranking;
   private String oscarOrNot;

   public int getId() {return id;}

   public void setId(int id) {this.id = id;}

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

   public Movie(int id;String movieName, int releaseYear, String director, int ranking, String oscarOrNot) {
      this.id = id;
      this.movieName = movieName;
      this.releaseYear = releaseYear;
      this.director = director;
      this.ranking = ranking;
      this.oscarOrNot = oscarOrNot;
   }



