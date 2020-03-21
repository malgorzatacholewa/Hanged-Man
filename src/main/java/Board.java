public class Board {
    private char[] phrase;
    private char[] guessedLetters;

    public void setPhrase(String clue) {
        phrase = clue.trim().toUpperCase().toCharArray();
    }

    public char[] getPhrase() {
        return phrase;
    }

    public char[] getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessedLetters(char[] phrase) {
        guessedLetters = phrase.clone();
        for (int i = 0; i < phrase.length; i++) {
            if (phrase[i] == '\u0020') {
                guessedLetters[i] = phrase[i];
            } else {
                guessedLetters[i] = '*';
            }
        }
    }

    public void showBoard() {
        System.out.println(guessedLetters);
    }

    public boolean putLetter(char letter, char[] guessedLetters) {
        boolean letterFound = false;
        for (int i = 0; i < phrase.length; i++) {
            if (phrase[i] == letter){
                letterFound = true;
                guessedLetters[i] = letter;
            }
        }
        return letterFound;
    }

    public boolean checkWin (char[] guessedLetters) {
        boolean fullBoard = true;
        for (char e: guessedLetters){
            if (e == '*'){
                fullBoard = false;
            }
        }
        return fullBoard;
    }

    public boolean checkClue (String clue, String guessedClue){
        return clue.trim().equals(guessedClue.trim());
    }
}

