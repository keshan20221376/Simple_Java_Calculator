import java.util.Scanner;

public class SimpleJavaCalculator {

    int input;
    static boolean response = true;
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        while (response){
            System.out.println("Welcome to the Simple Calculator!");
            System.out.println("Enter your choice:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Choose Option = ");
            int option = scn.nextInt();
            int input1;
            int input2;
            
            switch (option) {
                case 1:
                    System.out.print("First number = ");
                    input1 = scn.nextInt();
                    System.out.print("Second number = ");
                    input2 = scn.nextInt();
                    System.out.print("Answer = ");
                    System.out.println(addition(input1, input2));
                    break;
                case 2: 
                    System.out.print("First number = ");
                    input1 = scn.nextInt();
                    System.out.print("Second number = ");
                    input2 = scn.nextInt();
                    System.out.print("Answer = ");
                    System.out.println(substraction(input1, input2));
                    break;
                case 3:
                    System.out.print("First number = ");
                    input1 = scn.nextInt();
                    System.out.print("Second number = ");
                    input2 = scn.nextInt();
                    System.out.print("Answer = ");
                    System.out.println(multiplication(input1, input2));
                    break;
                case 4:
                    System.out.print("First number = ");
                    input1 = scn.nextInt();
                    System.out.print("Second number = ");
                    input2 = scn.nextInt();
                    System.out.print("Answer = ");
                    System.out.println(divition(input1, input2));
                    break;
                case 5:
                    response = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println();
        }
    }
    public static int addition(int x, int y){
        return x+y;
    }
    public static int substraction(int x, int y){
        return x-y;
    }
    public static int multiplication(int x, int y){
        return x*y;
    }
    public static int divition(int x, int y){
        return x/y;
    }
}