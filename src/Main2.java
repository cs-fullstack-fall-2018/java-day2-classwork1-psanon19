import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Exercise 9:
        //Create a program that has a hardcoded password. Create a while loop that will continually ask the user to
        // enter the correct password until it’s correct. Once it’s correct print “THAT’S CORRECT!!!”
        String password = "1234";
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your Password? ");
        String inputPassword = userInput.nextLine();

        while (!inputPassword.equals(password)){
            System.out.println("Pasword was incorrect, enter it again. ");
            inputPassword = userInput.nextLine();
        }


        System.out.println("This is the Correct password");
    }
}
