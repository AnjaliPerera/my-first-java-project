import java.util.Scanner;

/**
 * This is my first Java code
 */
public class vs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Take inputs
        System.out.print("what is your name: ");
        String name = scanner.nextLine();
        System.out.print("what is your age: ");
        int age = scanner.nextInt();
        System.out.print("What is your height(m) :");
        double height = scanner.nextDouble();


        //Print details
        System.out.println("Your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your height is "+ height +"m");

        //Close the scanner
        scanner.close();
    }
}