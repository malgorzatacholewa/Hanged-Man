import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("1. Nowa gra z komputerem");
        System.out.println("2. Nowa gra dla dwóch graczy");
        System.out.println("3. Zakończ program");
    }

    public int chosenGame (){
        return scanner.nextInt();
    }
}
