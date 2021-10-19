import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Factorial number "+number+" is: "+ factorial(number));
        
        
    }

    private static int factorial(int number) {
        if (number==1){
            return 1;
        } else 
            return number*factorial(number-1); 
    }
}
