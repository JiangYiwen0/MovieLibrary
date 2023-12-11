import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Driver{
  private Scanner input = new Scanner(System.in);
  private Movie movie;
    public static void main(String[] args){
      System.out.println("This is a brief movie library!");
      Driver driver = new Driver();
      driver.setup();
      driver.runMenu();
  }
  private int mainMeun(){
      System.out.print("""
              Movie Library Meun
              ---------
              1)Add a movie you want and Add all the details subsequently(the release year,
                the director,the ranking win an oscar or not)
              2)List all the movies as you want
              3)Find a Movie
              4）Delete a Movie
              5)Update a Movie
              0)Exit 
              """);
      int option = input.nextInt();
      return option;
  }
    private void runMenu() {
      int option = mainMeun();

      while (option != 0){

          switch (option){
              case 1 -> addAMovie();
              case 2 -> printAllMovies();
              case 3 -> findAMovie();
              case 4 -> deleteAMovie();
              case 5 -> updateMovie();
              default -> System.out.println("Invaild option entered,please input again");

          }
          option = mainMeun();
      }
      System.out.println("EXIT.Hope you have a nice day!");
      System.exit(0);
    }
    private void setup() {
        System.out.println("How many movies do you want to add?");
        int numberMovies = input.nextInt();
        Library library = new Library(numberMovies);
    }

    /**
     * 添加电影
     */
    private void addAMovie() {
        System.out.println("Enter the Movie id:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Movie name:");
//        input.nextLine();
        String movieName = input.nextLine();
        System.out.println("Enter the release year:");
        int releaseYear = input.nextInt();
        input.nextLine();//清除缓冲区中的换行符
        System.out.println("Please enter the initials of the director's name:");
        String director = input.nextLine();
        System.out.println("Enter the ranking of this movie:");
        int ranking = input.nextInt();
        input.nextLine();//清除缓冲区中的换行符
        System.out.println("Is this movie win an Oscar?Yes or No?:");
        String oscarOrNot = input.nextLine();

        Movie film = new Movie(id, movieName, releaseYear, director, ranking, oscarOrNot);
        boolean addedIn = Library.add(film);
        if (addedIn) {
            System.out.println(" You have added the movie:\n " +
                    film.toString() + "\n" +
                    " successfully in the Movie Library!");
        } else {
            System.out.println("No movie added in!");
        }
    }

    /**
     * 打印所有电影
     */
    private void printAllMovies() {
        System.out.println("The Movie Library is:");
        System.out.println(Library.list());
    }

    /**
     * 查找单个电影 根据电影名
     */
    private void findAMovie() {
        input.nextLine();
        System.out.print("Please enter a movie name you favor:");
        String movieName = input.nextLine();
        Movie findAMovie = Library.find(movieName);

        if (findAMovie != null) {
            System.out.println("What i find is-->" + findAMovie);
        } else {
            System.out.println("Sorry,i can't find the [movie] in the Movie library");
        }
    }

    /**
     * 删除电影 根据电影id
     */
    private void deleteAMovie() {
        input.nextLine();
        System.out.println("What do you want to delete(by id):");
        int id = input.nextInt();
        int result = Library.delete(id);
        if (result == 0) {
            System.out.println("delete fail!");
        }
        if (result == 1) {
            System.out.println("delete success!");
        }
    }

    /**
     * 更新电影数据
     */
    private void updateMovie() {
        System.out.println("Enter the Movie id:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Movie name:");
//        input.nextLine();
        String movieName = input.nextLine();
        System.out.println("Enter the release year:");
        int releaseYear = input.nextInt();
        input.nextLine();//清除缓冲区中的换行符
        System.out.println("Please enter the initials of the director's name:");
        String director = input.nextLine();
        System.out.println("Enter the ranking of this movie:");
        int ranking = input.nextInt();
        input.nextLine();//清除缓冲区中的换行符
        System.out.println("Is this movie win an Oscar?Yes or No?:");
        String oscarOrNot = input.nextLine();
        Movie film = new Movie(id, movieName, releaseYear, director, ranking, oscarOrNot);
        int result= Library.update(film);
        if (result == 0) {
            System.out.println("update fail!");
        }
        if (result == 1) {
            System.out.println("update success!");
        }
    }
}