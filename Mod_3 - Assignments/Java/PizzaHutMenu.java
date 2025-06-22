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

        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(0, 361, 700, 300);
        whitePanel.setLayout(null);

        mainFrame.add(whitePanel);

        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
