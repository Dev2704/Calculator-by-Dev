import java.util.Scanner;

public class Main {

    public static void add(float num1,float num2){
        System.out.println("\n=== Result ===");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    public static void sub(float num1,float num2){
        System.out.println("\n=== Result ===");
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }
    public static void mult(float num1,float num2){
        System.out.println("\n=== Result ===");
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
    }
    public static void div(float num1,float num2){
        if (num2 ==0) {
            System.out.println("Invalid Calculation");
            return;
        }else{
            System.out.println("\n=== Result ===");
            System.out.println(num1 + " ÷ " + num2 + " = " + (num1/num2));
        }
    }

    public static void main(String[] args) {
        //initializing scanner
        Scanner sc = new Scanner(System.in);

        //intializing variables
        float num1;
        float num2;
        int opr;
        char choice;

        //welcome msg
        System.out.println("     Welcome to CLI based Calculator     ");
        do{
            //1st num
            System.out.print("Enter 1st Number: ");
            num1 = sc.nextFloat();

            //select opr
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println();
            System.out.print("Enter your choice(1/2/3/4): ");
            opr = sc.nextInt();

            //2nd num
            System.out.print("Enter 2nd Number: ");
            num2 = sc.nextFloat();

            //selecting operation
            if (opr == 1) {
                add(num1, num2);
            }else if (opr ==2){
                sub(num1, num2);
            }else if (opr ==3) {
                mult(num1, num2);
            }else if (opr ==4) {
                div(num1, num2);
            }else{
                System.out.println("Invalid operation selected!!");
            }

            //loop
            System.out.print("\nWanna do another?(Y/N): ");
            choice = sc.next().charAt(0);
        }while( choice == 'Y' || choice == 'y');

        System.out.println("\nThanks for using calculator.");
        sc.close();
    }
}

