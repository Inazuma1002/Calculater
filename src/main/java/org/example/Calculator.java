package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator()
    {
    }

    public static void main(String[] args)
    {

        Calculator calculator = new Calculator();
        try (Scanner scanner = new Scanner(System.in)) {
            double number1, number2;
            do
            {
                System.out.println("Calculator-using-DevOps, choose an operation");
                System.out.print("Press 1 for Square Root\nPress 2 for Factorial\nPress 3 for Natural Logarithm\nPress 4 for Power\n" +
                        "Press 5 to exit\nEnter your choice: ");
                int choice;
                try
                {
                    choice = scanner.nextInt();
                } catch (InputMismatchException error)
                {
                    return;
                }

                switch (choice)
                {
                    case 0: 
                        System.out.println("Welcome to the calculator!");
                        break;
                        
                    case 1:
                        // do square root
                        System.out.print("Enter a number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Square root of " + number1 + " is : " + calculator.squareroot(number1));
                        System.out.println("\n");

                        break;
                    case 2:
                        // find factorial
                        System.out.print("Enter a number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                        System.out.println("\n");

                        break;
                    case 3:
                        // find natural logarithm
                        System.out.print("Enter a number : ");
                        number1 = scanner.nextDouble();
                        System.out.println("Square of " + number1 + " is : " + calculator.naturalLog(number1));
                        System.out.println("\n");

                        break;
                    case 4:
                        // do power
                        System.out.print("Enter the first number : ");
                        number1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        number2 = scanner.nextDouble();
                        System.out.println("Power of " + number1 + " raised to " + number2 + " is : " + calculator.power(number1, number2));
                        System.out.println("\n");

                        break;
                    default:
                        System.out.println("Exiting now....");
                        return;
                }
            } while (true);
        }
    }


    public double power(double number1, double number2)
    {
        logger.info("[POWER - " + number1 + " AND " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double squareroot(double number1)
    {
        logger.info("[SQUARE ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double number1)
    {
        logger.info("[FACTORIAL] - " + number1);

        int result = 1, i;
        for (i=2; i<=number1; i++)
            result *= i;

        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturalLog(double number1)
    {
        logger.info("[NATURAL LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}
/*import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {


    float ans;
        float x, y;
    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public float add(float x, float y){
            float temp = x + y;
            logger.info("[ADDITION] - " + x + ", " + y);
            logger.info("[RESULT - ADDITION] - " + temp);
            return temp;

        }

    public float increment(float x){
            float temp = x + 1;
            return temp;
        }
    public double power(double number1, double number2)
    {
        logger.info("[POWER - " + number1 + " AND " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
    public double naturalLog(double number1)
    {
        logger.info("[NATURAL LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public int factorial(int x){
        if(x < 0){
            logger.error("[ERROR - FACTORIAL] - factorial function does not work with -ve number");
            return -1;
        }
        int ans = 1;
        for(int i = 1; i <= x; i++){
            ans = ans * i;
        }
        logger.info("[FACTORIAL] - " + x);
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public float square_root(float x){
        if(x < 0){
            logger.error("[ERROR - SQRT] - square root function is given -ve number");
            return -1f;
        }
        double temp = Math.sqrt(x);
        logger.info("[SQRT] - " + x);
        logger.info("[RESULT - SQRT] - " + temp);
        return (float) temp;
    }

        public float evaluate(int op, float x, float y){
            switch(op)
            {
                case(1):
                    ans = increment(x);
                    break;
                case(2):
                    ans = add(x,y);
                    break;
                case(3):
                    ans= factorial((int)x);
                    break;
                case(4):
                    ans= square_root((int)x);
                    break;
                case(5): power()
                default:
                    System.out.println("wrong option selected");
                    break;
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            System.out.print("Choose operation \n"+
                    "1. Increment \n"+
                    "2. Addition  \n"+
                    "3. Factorial \n"+
                    "4. Square_Root \n"+
                    "5. Power \n"+
                    "6. Natural_Log \n"+

                    "Enter your choice : ");

            int op = scan.nextInt();
            float x = 0;
            float y = 0;

            if (op == 1){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
            }
            if(op == 3){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
            }
            if(op == 4){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
            }
            if(op == 5){
                System.out.print("Enter operand x: ");
                x = scan.nextFloat();
                y = scan.nextFloat();
            }
            
            else if (op == 2){
                System.out.print("Enter operands x y: ");
                x = scan.nextFloat();
                y = scan.nextFloat();
            }

            Calculator mycalc = new Calculator();
            System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));

        }

}

*/