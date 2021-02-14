//All lines of this program are commented on. Project by Manik Sharma
import java.util.Scanner;//Import the Scanner class
import java.util.Random;//Import random class
public class Main{ //Initialize a public class for the program
  public static void main(String [] args){ //Initialize public static void main. Start of the main program.
    Scanner input = new Scanner(System.in);//Create a Scanner Object
    double userAnswer, actualAnswer;//Create variables to store the user answer and the actual answer
    int randnum1, randnum2, cont = 0;//Create variables for the first random number, second random number, and another variable to check whether the user wants to continue player or not 
    String optype;//Create a variable to store the random operator chosen

    while (true){//While loop which allows us to continously ask more and more questions when wanted and stops when the user wants to stop
      optype = operatorGenerator();//Generate a random operator and store it in the variable optype.
      randnum1 = numGenerator();//Generate the first random number and store it in randnum1 variable
      randnum2 = numGenerator();//Generate the second random number and store it in the randnum2 variable
      actualAnswer = ansGenerator(randnum1, randnum2, optype);//Call upon my method to find out the actual answer of the expression
      System.out.print("What is " + randnum1 + " " + optype + " " + randnum2 + "? ");//Ask user for their answer
      userAnswer = input.nextDouble();//Take in the User Input
      if (userAnswer == actualAnswer){//If the user input is correct..
        System.out.println("Correct! ");//Print out correct
        System.out.println("Would You Like to Continue? (Print '1' for Yes and '2' for No) ");//Ask if they would like to continue
        cont = input.nextInt();//Take in their answer to the previous question
        if (cont == 2){//If their answer is no
          System.out.println("Thanks For Playing!");//Print out a thank you statement
          break;//Break the while loop
        }//Close the if statement
        else{//Else statement for if they say yes
          continue;//Continue the while loop which will repeat the previous steps
        }//Close else statement
      }//Close initial if statement checking if answer was right
      else{//Else statement for when answer is wrong
        while (userAnswer != actualAnswer){//Create a while loop to keep having error message when answer is incorrect. Will break if they get the correct answer
        System.out.print("Incorrect! Try Again! ");//Print out that answer is incorrect and ask user to try again
        userAnswer = input.nextDouble();//Take in their new answer
      }//Close while loop
        System.out.println("Correct! ");//Once user eventually gets right answer, print out correct 
        System.out.println("Would You Like to Continue? (Print '1' for Yes and '2' for No) ");//Ask user if they would like to continue
        cont = input.nextInt();//Take in user's answer for previous question 
        if (cont == 2){//If answer is no 
          System.out.println("Thanks For Playing!");//Print thank you statement
          break;//Break out of the while loop 
        }//Close if statement
        else{//Else statement for when the user says yes
          continue;//Continue the loop which will keep asking user questions 
        }//Close else statement 
      }//Close initial else statement
    }//Close the main while loop
  }//End the main program 
  public static String operatorGenerator(){//Header of method to randomly generate an operator
    Random rand = new Random(); //Create a Random Object
    int num;//Create a variable for the different random number options which whill decide what operator to use
    String op = "";//Create a variable with an empty to string to eventually contain what operator we will use in the main program
    num = rand.nextInt(4);//Generate 4 random numbers for 4 operators
    switch (num){//Switch statement to interpret random numbers 
      case 0:  //First case possible
        op = "+";//Will give us an addition operator
        break;//Break out of switch statement
      case 1: //Second case possible
        op = "-";//Will give us a subtraction operator
        break;//Break out of swtich statement
      case 2:  //Third Case Possible
        op = "*"; //Will give us a multiplication statement
        break;//Break from the switch statement
      case 3: //Last case possible
        op = "/";//Will give us division operator
        break;//Break out of switch statement
    }//Close switch statement
    return op;//Return the operator that was randomly generated
    }//Close the random generated operator method

  public static int numGenerator(){//Method header to randomly generate a number 
    Random rand = new Random(); //Create a Random Object
    int num;//Variable to store random number
    num = rand.nextInt(10);//Randomly generate a number between 0 and 9
    num += 1; //Add 1 to the random number to avoid getting 0 and having the numbers range go to 1 to 10 which is what the question asked
    return num;//Return the randomly generated number
  }//Close the random number generator method
  public static double ansGenerator(int x, int y, String op){//Header for method that checks if the answer is correct
    double ans;//Create a variable to store the answer to the expression
    if (op == "+"){//If the addition operator was randomly generated
      ans = x + y;//Calculate the sum of the two numbers
    }//Close if statement
    else if (op == "-"){//Else if the subtraction operator was randomly generated
      ans = x - y;//Find the difference between the two numbers
    }//Close else if statement
    else if (op == "*"){//Else if the multiplication operator was randomly generated
      ans = x * y;//Find the product of the two numbers
    }//Close the else if statement
    else{//Else statement for the last possible case of the division operator
      ans = 1.0 * x / y; //Find the quotient of the two numbers as a double
      ans = Math.round(ans * 100.0) / 100.0;//Round to two decimal places as said by Mr. Seow
    }//Close else statement
  return ans;//Return the answer
  }//Close the method getting us the answer
}//Close the public class Main as there is no more code.
