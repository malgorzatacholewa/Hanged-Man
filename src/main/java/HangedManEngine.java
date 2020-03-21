import host.Host;
import host.HumanHost;

import java.io.IOException;

public class HangedManEngine {
    Board board = new Board();
    Player player = new Player();
    String chosenLetter = "";
    HangedMan hangedMan = new HangedMan();

    public void start(Host host) {
        int lost = 0;
        boolean win = false;
        host.setCategory();
        host.setClue();
        board.setPhrase(host.getClue());
        board.setGuessedLetters(board.getPhrase());
        while (lost < 10 && !board.checkWin(board.getGuessedLetters()) && !win){
            System.out.println("Kategoria: " + host.getCategory());
            board.showBoard();
            chosenLetter = player.chosenLetter();
            if (chosenLetter.length() > 1) {
                if (board.checkClue(String.valueOf(board.getPhrase()), chosenLetter)) {
                   win = true;
                } else {
                    System.out.println("Nie odgadłeś hasła");
                    lost ++;
                    hangedMan.HangedManPicture(lost);
                }
            }
            if (chosenLetter.length() == 1) {
                if (board.putLetter(chosenLetter.charAt(0),board.getGuessedLetters())){
                } else {
                    System.out.println("Podanej litery nie ma w haśle");
                    lost ++;
                    hangedMan.HangedManPicture(lost);
                }
            }
        }
        if (lost == 10){
            System.out.println("Koniec gry! Zawisłeś! ");
            System.out.println("Hasło do odgadnięcia: " + host.getClue().toUpperCase());
        } else {
            System.out.println("Gratulacje! Udało Ci się odgadnąć hasło: " + host.getClue().toUpperCase());
        }
    }
}
