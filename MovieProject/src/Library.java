public class Library {
    private static Movie[] movies;
    private static int total = 0;

    public Library(int movieNumbers){
      movies = new Movie[movieNumbers];
    }
    private static boolean isFull(){
        return total==movies.length;
    }
    private static boolean isEmpty(){
        return total == 0;
    }
    public static boolean add(Movie amovie) {

        if (isFull()){
          return false;
        }
        else {
            movies[total]= amovie;
            total=total+1;
            return true;
        }
    }
    public static String list(){
        if (isEmpty()){
            return "There's no movies in the library!";
        }
        else {
            String listOfMovies ="";
            for (int i = 0;i<total;i++){
                listOfMovies += "Movie"+i+1 +":" + movies[i].toString()+ "\n";
            }
            return listOfMovies;
        }
    }
    public static Movie find(String movieName){
        Movie foundMovie = null;
        if (!isEmpty()){
            for (int i = 0;i<total;i++){
                if (movies[i].getMovieName().equals(movieName)){
                    foundMovie = movies[i];
                }
            }
        }
        else {
            return null;
        }
        return foundMovie;
    }
    public static int delete(int id){
        int index = -1;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId()==id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Movie[] newArray = new Movie[movies.length - 1];
            for (int i = 0, j = 0; i < movies.length; i++) {
                if (i != index) {
                    newArray[j++] = movies[i];
                }
            }
            for(int i = 0;i< movies.length-1;i++){
                movies[i] = newArray[i];
            }
            total-=1;
            return 1;
        }else{
            return 0;
        }
    }
    public static int update(Movie movie){
            int index = -1;
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getId()==movie.getId()) {
                    index = i;
                    break;
                }
            }
            movies[index].setMovieName(movie.getMovieName());
            movies[index].setDirector(movie.getDirector());
            movies[index].setRanking(movie.getRanking());
            movies[index].setOscarOrNot(movie.getOscarOrNot());
            movies[index].setReleaseYear(movie.getReleaseYear());
            return 1;
    }
}
