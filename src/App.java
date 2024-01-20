import java.util.Scanner;

// If divisible by 5 = 'fizz'
// if divisible by 3 = 'buzz'
// if divisible by both 5 and 3 = 'fizzbuzz'
// if not divisible by any you get the number
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("fizzbuzz");
        } 
        else if (number % 5 == 0){
            System.out.println("fizz");
        } 
        else if (number % 3 == 0){
            System.out.println("buzz");
        } 
        else {
            System.out.println(number);
        } 
    }
}