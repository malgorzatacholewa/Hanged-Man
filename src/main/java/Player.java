import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public String chosenLetter (){
        System.out.println("Podaj literę albo hasło");
        return scanner.nextLine().trim().toUpperCase();
    }
}
