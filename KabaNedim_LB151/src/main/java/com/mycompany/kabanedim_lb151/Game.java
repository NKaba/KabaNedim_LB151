package com.mycompany.kabanedim_lb151;
import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "game")
@SessionScoped
public class Game implements Serializable {

    private String name;
    private String[] words = {"DasAundO", "SichVomAckerMachen", "NurBahnhofVerstehen", "NichtDasGelbeVomEi",};
    private String word;
    private char[] hiddenWord;
    private int lives;
    private int coins;
    private String guess;
    private boolean wordGuessed;
    private String message;

    public Game() {
        newGame();
    }

    public void newGame() {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        word = words[randomIndex];
        

hiddenWord = new char[word.length() * 2 - 1];
for (int i = 0; i < hiddenWord.length; i += 2) {
    if (i == 0 || i == 4) {
        hiddenWord[i] = word.charAt(i / 2);
    } else {
        hiddenWord[i] = '_';
    }
    if (i < hiddenWord.length - 1) {
        hiddenWord[i + 1] = ' ';
    }
}

        
        lives = 3;
        guess = "";
        wordGuessed = false;
        message = "";
    }

    public void makeGuess() {
        if (guess.toLowerCase().equals(word.toLowerCase())) {
            coins += 200;
            hiddenWord = word.toCharArray();
            wordGuessed = true;
            message = "Du hast das Wort richtig erraten";
             newGame();
    
} else {
            if (guess.length() == 1) {
                char letter = guess.toLowerCase().charAt(0);
                boolean found = false;
                if (isVowel(letter)) {
                    message = "Keine Vokale dürfen eingegeben werden";
                }  if (isVowel(letter)) {
                if (coins >= 100) {
                    coins -= 100;
                    message = "Du hast den Vokal '" + letter + "' gekauft.";
                    for (int i = 0; i < word.length(); i++) {
                        if (word.toLowerCase().charAt(i) == letter) {
                            hiddenWord[i * 2] = word.charAt(i);
                            found = true;
                        }
                    }
                } else {
                    message = "Du hast nicht genug Münzen, um einen Vokal zu kaufen.";
                }
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (word.toLowerCase().charAt(i) == letter) {
                        hiddenWord[i * 2] = word.charAt(i);
                        coins += 50;
                        found = true;
                    }
                    
                    
                }
                if (found) {
                    if (new String(hiddenWord).equalsIgnoreCase(word)) {
                        coins += 200;
                        wordGuessed = true;
                    }
                } else {
                    lives--;
                }
            }
        }
    }
     
        if (lives == 0) {
            newGame();
        }
        guess = "";
        System.out.println(message);
    }


    private boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    public String getWord() {
        return new String(hiddenWord);
    }

    public int getLives() {
        return lives;
    }

    public int getCoins() {
        return coins;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public boolean isWordGuessed() {
        return wordGuessed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

