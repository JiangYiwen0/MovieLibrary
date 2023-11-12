public class Movie {
   private String name;
   private int releaseYear;
;
   private String director;
   private int ranking;
   private String oscarOrNot;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
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

   public Movie(String setName) {

   }



}
