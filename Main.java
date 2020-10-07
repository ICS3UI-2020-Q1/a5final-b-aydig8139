import java.util.Scanner;

/**
 * Adds the sum of the odd numbers in a given integer
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create new scanner for user input
      Scanner input = new Scanner(System.in);
      
      //ask user for a number and declare a variable to store that number
      System.out.println("Please enter the maximum number to sum to:");
      int userNum = input.nextInt();
      
      //declare a variable to store the odd numbers added together
      int sum = 0;
      
      //create a for loop and declare a variable to count the odd numbers. The variable increases by 2 because its counting odd numbers only
      for(int i = 1; i <= userNum; i = i + 2){
          
          //add the odd numbers and sotre them with a previously declared variable
          sum = sum + i;
         
      }
      //print out the variable that stores the sum of the odd numbers
      System.out.println(sum);
    
  }
}
