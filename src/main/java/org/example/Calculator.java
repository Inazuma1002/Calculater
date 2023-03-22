package org.example;
import org.apache.logging.log4j.LogManager;
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
            else if (op == 2){
                System.out.print("Enter operands x y: ");
                x = scan.nextFloat();
                y = scan.nextFloat();
            }

            Calculator mycalc = new Calculator();
            System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));

        }

}

