import java.util.Scanner;
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
              1)Add a movie you want
              2)Add all the details subsequently(the release year,
                the director,the ranking win an oscar or not)
              3)List all the movies as you want
              4)Find a Movie 
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
              case 2 -> addDetails();
              case 3 -> printAllMovies();
              case 4 -> findAMovie();
              default -> System.out.println("Invaild option entered" + option);

          }
          System.out.println("\nPress enter key to continue");
          input.nextLine();
          input.nextLine();
          input.nextLine();

          option = mainMeun();
      }
      System.out.println("EXIT.Hope you have a nice day!");
      System.exit(0);
    }

    private void findAMovie() {
      input.nextLine();
      System.out.print("Please enter a movie name you favor:");
      String movieName = input.nextLine();
      Movie findAMovie = movie.find(movieName);

      if (findAMovie != null){
          System.out.println("What i find is"+ findAMovie);
      }
      else {
          System.out.println("Sorry,i can't find the ["+ findAMovie +"] in the Movie library");
      }
    }

    private void addDetails() {
      input.nextLine();
      System.out.print("Enter the Movie name:");
      String movieName= input.nextLine();
      System.out.print(" Enter the release year:");
      int releaseYear = input.nextInt();
      System.out.print("Enter the initials of the director's name:");
      String director = input.nextLine();
      System.out.print("Enter the ranking of this movie:");
      int ranking = input.nextInt();
      System.out.print("Is this movie win an Oscar?Yes or No?:");
      String oscarOrNot = input.nextLine();
      Movie temp = new Movie(movieName,releaseYear,director,ranking,oscarOrNot);
      boolean addedIn =movie.add(temp);
      if (addedIn){
          System.out.println("You have added a movie successfully in the Movie Library!");
      }
      else {
         System.out.println("No movie added in!");
      }
    }

    private void printAllMovies() {
      System.out.println("The Movie Library is:");
      System.out.println(Library.list());
    }

    private void addAMovie() {
      input.nextInt();
      System.out.print("Enter the Movie name:");
      String movieName= input.nextLine();
    }

    private void setup() {
      System.out.println("How many movies do you want to add?");
      int numberMovies = input.nextInt();
        Library library = new Library(numberMovies);
    }
}
