import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PizzaHutMenu {
    JFrame mainFrame = new JFrame("PizzaHut Menu");
    JPanel whitePanel = new JPanel();

    ImageIcon pizzaHutIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("PizzaHutLogo.png")));

    public PizzaHutMenu() {
        mainFrame.setSize(500, 700);
        mainFrame.setIconImage(pizzaHutIcon.getImage());
        mainFrame.getContentPane().setBackground(new Color(150, 0, 0));
        mainFrame.setLayout(null);

        Image scaledImage = pizzaHutIcon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(125, 140, 250, 150); // Adjust position and size
        mainFrame.add(logoLabel);

        JLabel welcomeTitle = new JLabel("Welcome to");
        welcomeTitle.setFont(new Font("Arial", Font.BOLD, 28));
        welcomeTitle.setForeground(Color.WHITE);
        welcomeTitle.setBounds(170, 60, 200, 40); // Position above the logo
        mainFrame.add(welcomeTitle);

        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(0, 361, 700, 300);
        whitePanel.setLayout(null);
        mainFrame.add(whitePanel);

        mainFrame.setLocationRelativeTo(null); // Center on screen
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}