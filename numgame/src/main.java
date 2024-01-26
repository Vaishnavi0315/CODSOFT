import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class NumberGameGUI extends JFrame {
    private Random random;
    private int generatedNumber;
    private int attemptsLeft;
    private int score;

    private JLabel guessLabel;
    private JTextField guessField;
    private JButton guessButton;
    private JTextArea resultArea;
    private JButton playAgainButton;

    public NumberGameGUI() {
        random = new Random();
        setTitle("Number Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        setupGame();

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setupGame() {
        generatedNumber = random.nextInt(100) + 1;
        attemptsLeft = 10;
        score = 0;

        guessLabel = new JLabel("Enter your guess:");
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resultArea = new JTextArea(8, 20);
        resultArea.setEditable(false);
        playAgainButton = new JButton("Play Again");

        add(guessLabel);
        add(guessField);
        add(guessButton);
        add(resultArea);

        guessButton.addActionListener(e -> {
            int userGuess = Integer.parseInt(guessField.getText());
            if (userGuess == generatedNumber) {
                resultArea.append("Congratulations! You guessed the correct number.\n");
                score += attemptsLeft;
                playAgainButton.setEnabled(true);
                guessButton.setEnabled(false);
            } else if (userGuess < generatedNumber) {
                resultArea.append("Too low! Try a higher number.\n");
            } else {
                resultArea.append("Too high! Try a lower number.\n");
            }

            attemptsLeft--;
            if (attemptsLeft == 0 && userGuess != generatedNumber) {
                resultArea.append("Sorry, you've used all your attempts. The number was: " + generatedNumber + "\n");
                playAgainButton.setEnabled(true);
                guessButton.setEnabled(false);
            }
        });

        add(playAgainButton);
        playAgainButton.setEnabled(false);
        playAgainButton.addActionListener(e -> {
            resultArea.setText("");
            guessButton.setEnabled(true);
            playAgainButton.setEnabled(false);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberGameGUI());
    }
}
