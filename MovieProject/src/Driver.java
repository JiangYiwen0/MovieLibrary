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
    }

    private void printAllMovies() {
    }

    private void addDetails() {
    }

    private void addAMovie() {
    }

    private void setup() {
    }
}
