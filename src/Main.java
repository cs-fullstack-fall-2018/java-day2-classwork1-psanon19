import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise 8:
        //Create a program that asks a user “How awesome is Kenn and Kevin”. Create a loop that will
        // not quit until they enter “very awesome”.
        Scanner userInput = new Scanner(System.in);
        System.out.println("How awesome is Kenn and Kevin? ");
        String awesome = userInput.nextLine();

        while (!awesome.equals("very awesome")){
            System.out.println("How awesome are they again???. ");
            awesome = userInput.nextLine();
        }


        System.out.println("Yes they are "+awesome);
    }
}
