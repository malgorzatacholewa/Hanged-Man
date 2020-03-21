package host;

import jdk.jfr.Category;

import java.util.Scanner;

public class HumanHost implements Host {
    private String category;
    private String clue;

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void setClue() {
        System.out.println("Podaj hasło");
        this.clue = scanner.nextLine();
    }

    @Override
    public void setCategory() {
        System.out.println("Podaj kategorię hasła do odgadnięcia");
        this.category = scanner.nextLine();
    }

    @Override
    public String getClue() {
        return clue;
    }

    @Override
    public String getCategory() {
        return category;

    }
}
