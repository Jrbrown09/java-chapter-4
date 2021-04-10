import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {

    // Declare the Chapter 2 Milestone 1 method here
    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Declare the Chapter 2 Milestone 2 method here
    void milestone2(double userNumberInput)
    {
        int convertedUserInput1 = (int) userNumberInput;

        double numberDifference = userNumberInput - convertedUserInput1; 

        int convertedUserInput2 = (int) (numberDifference * 100);


        System.out.println(convertedUserInput1);
        System.out.println(convertedUserInput2);
    }
    
    // Declare the Chapter 2 Milestone 3 method here
    void milestone3()
    {
       // https://beginnersbook.com/2014/01/java-program-to-display-prime-numbers/

       int i = 0;  // Declare number variable
       int n = 0;  // Declare divisor variable

       String primeNumbers = " ";

       for (i = 1; i <= 100; i++) {

           // Initialize the loop counter to 0
           // The counter variable keeps track of how many numbers the variable, i, is divisible by.
           int numberOfDivisors = 0; 
           for (n = i; n >= 1; n--) {

               // Determine if the number variable is divisible by divisor variable. 
               // If so, add 1 to the counter variable
               if (i % n == 0) {
                   numberOfDivisors++;
               }
           }

           // Test if the counter variable is 2 and add to the list of prime numbers
           if (numberOfDivisors == 2) {
               primeNumbers = primeNumbers + i + " ";
           }
       }

       // Display the prime numbers to the user
       System.out.println(primeNumbers);
       
    }

    // Declare the Chapter 2 Milestone 4 method here
    void milestone4(int seconds)
    {        
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int secondsRemaining = ((seconds % 86400) % 3600) % 60;
        
        System.out.println(days + " Days");
        System.out.println(hours + " Hours");
        System.out.println(minutes + " Minutes");
        System.out.println(secondsRemaining + " Seconds"); 
    }

}

public class App {
    public static void chapter1milestone1(double num1, double num2)
    {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    // Declare the Chapter 1 Milestone 2 method here
    public static void chapter1Milestone2(double first_decimal_number, double second_decimal_number) {
        double number_average;
        
        number_average = (first_decimal_number + second_decimal_number)/2;
        System.out.println("The average of the two numbers is " + number_average);
    }


    // Declare the Chapter 1 Milestone 3 method here
    public static void chapter1Milestone3(double radius) {
        double circumference;
        double circleArea;

        circumference = 2 * 3.14 * radius;
        circleArea = 3.14 * radius * radius;

        System.out.println("The circumference of the circle is" + String.format("% .1f", circumference));
        System.out.println("The area of the circle is" + String.format("% .1f", circleArea));
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 2 method here
        chapter1Milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        // Call the Chapter 1 Milestone 3 method here
        chapter1Milestone3(radius);

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();

        // Call the Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 Milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        // Call the Chapter 2 Milestone 3 method here
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 Milestone 4 method here
        chapter2.milestone4(seconds);

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        Chapter3 chapter3 = new Chapter3();
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 Milestone 1 method here
        chapter3.milestone1(num3_1a, num3_1b);

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        // Call the Chapter 3 Milestone 2 method here
        chapter3.milestone2(scanner);

        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        // Call the Chapter 3 Milestone 3 method here        
        chapter3.milestone3(randNum1, randNum2, num3_3);

        scanner.close();
    }
}
