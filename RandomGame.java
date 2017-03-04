import java.util.*;

public class RandomGame{
  public static void main(String[] args){

    int minimum = 1;
    int maximum = 100;
    Random rn = new Random();
    int range = maximum - minimum + 1;
    int randomNum =  rn.nextInt(range) + minimum;
    // System.out.println(randomNum);

    Scanner in = new Scanner(System.in);
    do {
      System.out.println("Enter your number:");
      int userNumber = in.nextInt();
      if (userNumber == randomNum) {
        System.out.println("You got the number.");
        break;
      }
      else if (userNumber > randomNum){
        System.out.println("Try smaller number.");
      }
      else if (userNumber < randomNum){
        System.out.println("Try bigger number.");
      }
    } while (true);

  }
}
