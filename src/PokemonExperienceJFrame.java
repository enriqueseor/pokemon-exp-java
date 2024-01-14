import javax.swing.*;
import java.awt.*;

public class PokemonExperienceJFrame extends JFrame {

    private final JTextField inputField;
    private final JTextArea resultArea;

    public PokemonExperienceJFrame() {
        setTitle("Pokemon Experience Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        JLabel label = new JLabel("Enter Pokemon Level:");
        inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");

        inputPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(calculateButton);

        resultArea = new JTextArea(15, 40);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        calculateButton.addActionListener(e -> calculate());

        add(mainPanel);
        setVisible(true);
    }

    private void calculate() {
        String input = inputField.getText();
        try {
            int level = Integer.parseInt(input);
            StringBuilder result = new StringBuilder();
            erratic(level, result);
            fast(level, result);
            slow(level, result);
            mediumFast(level, result);
            mediumSlow(level, result);
            fluctuating(level, result);
            resultArea.setText(result.toString());
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter a valid number.");
        }
    }

    private void erratic(int n, StringBuilder result) {
        int x = 0;
        if (n > 0 && n <= 50) { x = (int) (Math.pow (n,3))*(100-n)/50; }
        if (n >= 51 && n <= 68) { x = (int) (Math.pow (n,3))*(150-n)/100; }
        if (n >= 69 && n <= 98) { x = (int) (Math.pow (n,3))*(155-n)/100; }
        if (n >= 99 && n <= 100) { x = (int) (Math.pow (n,3))*(160-n)/100; }
        result.append("Erratic      ").append(x).append("\n");
    }

    private void fast(int n, StringBuilder result) {
        int x = (int) (Math.pow(n, 3) * 0.8);
        result.append("Fast         ").append(x).append("\n");
    }

    private void slow(int n, StringBuilder result) {
        int x = (int) (Math.pow(n, 3) * 1.25);
        result.append("Slow         ").append(x).append("\n");
    }

    private void mediumFast(int n, StringBuilder result) {
        int x = (int) Math.pow(n, 3);
        result.append("Medium fast  ").append(x).append("\n");
    }

    private void mediumSlow(int n, StringBuilder result) {
        int x = (int) (Math.pow(n, 3) * 1.2) - (int) (Math.pow(n, 2) * 15) + (n * 100) - 140;
        result.append("Medium slow  ").append(x).append("\n");
    }

    private void fluctuating(int n, StringBuilder result) {
        int x = 0;
        if (n > 0 && n <= 15) {x = (int) (Math.pow(n, 3)) * (24 + (n + 1) / 3) / 50;}
        if (n >= 16 && n <= 35) {x = (int) (Math.pow(n, 3)) * (14 + n) / 50;}
        if (n >= 36 && n <= 100) {x = (int) (Math.pow(n, 3)) * (32 + (n / 2)) / 50;}
        result.append("Fluctuating  ").append(x).append("\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PokemonExperienceJFrame::new);
    }
}