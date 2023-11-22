public class Library {
    private static Movie[] movies;
    private static int total = 0;

    public Library(int movieNumbers){
      movies = new Movie[movieNumbers];
    }
    private static boolean isFull(){
        return total==movies.length;
    }
    private boolean isEmpty(){
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
    public String list(){
        if (isEmpty()){
            return "There's no movies in the library!";
        }
        else {
            String listOfMovies ="";
            for (int i = 0;i<total;i++){
                listOfMovies += i +":" + movies[i] + "\n";
            }
            return listOfMovies;
        }
    }
    public Movie find(String movieName){
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
}
