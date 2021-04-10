import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;;

public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    void milestone1(int firstNumber, int secondNumber) {
        for (int i = firstNumber + 1; i < secondNumber; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    if (i % firstNumber == 0) {
                    break;
                    }
                }
        }
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner) {
        // Milestone 2
        // Write a program that will input a list of integers in from the keyboard. 
        // When the user enters a negative number, print the average rounded to 2 decimal places. (15 pts)

        int userNumberInput = 0;
        int totalSum = 0;
        int i = 0;

        System.out.println("Enter a few numbers: ");          
        userNumberInput = scanner.nextInt();
        while(userNumberInput >= 0) 
        {                   
            i++;
            totalSum += userNumberInput;
            userNumberInput = scanner.nextInt();
        }
        if (i == 0) {                               // https://stackoverflow.com/questions/39321325/write-a-program-that-keeps-taking-in-integers-until-a-negative-integer-is-given
            i = 1;
        }

        double totalAverage = (double) totalSum / i;
        
        BigDecimal totalAverageRounded = new BigDecimal(totalAverage);               //  https://stackoverflow.com/questions/3843440/bigdecimal-setscale-and-round
        totalAverageRounded = totalAverageRounded.setScale(2, RoundingMode.HALF_UP);
        
        //String totalAverageRounded = df.format(totalAverage);

        System.out.println("The average is: " + totalAverageRounded);

    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect, the answer was " + (num1 * num2));
        }
    }

}