package host;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AIHost implements Host{
    private String category;
    private String clue;
    private List <String> listCluesCat = new ArrayList<String>();
    private String randomLine;
    private Random randomIndex = new Random();

    public void setClue() {
    if (listCluesCat.isEmpty()){
        setCategory();
      }
    }

    public void setCategory() {
        if (listCluesCat.isEmpty()) {
            try {
                Scanner scanner = new Scanner(new File("C:\\Users\\malgo\\Desktop\\KursJava\\out\\production\\KursJava\\hangedMan\\src\\main\\java\\Categories.txt"));
                while (scanner.hasNextLine()) {
                    listCluesCat.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Brak pliku do odczytania!");
            }

            randomLine = listCluesCat.get(randomIndex.nextInt(listCluesCat.size()));
            String[] parts = randomLine.split(",");
            this.category = parts[0];
            this.clue = parts[1];
        }
    }


    public String getClue() {
        return clue;
    }


    public String getCategory() {
        return category;
    }
}
