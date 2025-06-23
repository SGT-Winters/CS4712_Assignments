import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class PizzaHutMenu implements ActionListener {
    JFrame mainFrame = new JFrame("PizzaHut Menu");
    JFrame orderingFrame = new JFrame("Ordering");
    JFrame confirmationFrame = new JFrame("Confirmation");

    JPanel whitePanel = new JPanel();

    JButton orderPizza = new JButton("Order");
    JButton placeOrder = new JButton("Place order");
    JButton cancelOrder = new JButton("Cancel order");

    JComboBox selectSizeBox;
    JComboBox selectDrinkBox;

    JTextField userName = new JTextField();

    JCheckBox pepperoni = new JCheckBox("Pepperoni");
    JCheckBox Ham = new JCheckBox("Ham");
    JCheckBox Chicken = new JCheckBox("Chicken");
    JCheckBox Mushroom = new JCheckBox("Mushroom");
    JCheckBox greenPepper = new JCheckBox("Green Pepper");
    JCheckBox Onions = new JCheckBox("Onions");

    ImageIcon pizzaHutIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("PizzaHutLogo.png")));

    public PizzaHutMenu() {
        mainFrame.setSize(500, 700);
        mainFrame.setIconImage(pizzaHutIcon.getImage());
        mainFrame.getContentPane().setBackground(new Color(150, 0, 0));

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

        orderPizza.setFont(new Font("Arial", Font.BOLD, 18));
        orderPizza.setForeground(Color.black);
        orderPizza.setBounds(190, 140, 100, 40);
        orderPizza.addActionListener(this);
        whitePanel.add(orderPizza);

        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(0, 361, 700, 300);
        whitePanel.setLayout(null);
        mainFrame.add(whitePanel);

        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null); // Center on screen
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public void orderingScreen(){
        orderingFrame.setSize(500, 700);
        orderingFrame.setIconImage(pizzaHutIcon.getImage());
        orderingFrame.getContentPane().setBackground(new Color(150, 0, 0));

        JLabel selectSize = new JLabel("Select a Size");
        selectSize.setFont(new Font("Arial", Font.BOLD, 28));
        selectSize.setForeground(Color.WHITE);
        selectSize.setBounds(150, 40, 200, 40);
        orderingFrame.add(selectSize);

        String[] sizeOptions = {"Small", "Medium", "Large"};
        selectSizeBox = new JComboBox(sizeOptions);
        selectSizeBox.setFont(new Font("Arial", Font.BOLD, 16));
        selectSizeBox.setForeground(Color.black);
        selectSizeBox.setBounds(150, 80, 180, 30);
        selectSizeBox.addActionListener(this);
        orderingFrame.add(selectSizeBox);

        JLabel addToppings = new JLabel("Add Toppings");
        addToppings.setFont(new Font("Arial", Font.BOLD, 28));
        addToppings.setForeground(Color.WHITE);
        addToppings.setBounds(150, 120, 250, 40);
        orderingFrame.add(addToppings);

        pepperoni.setFont(new Font("Arial", Font.BOLD, 16));
        pepperoni.setForeground(Color.black);
        pepperoni.setBounds(90, 165, 180, 30);
        pepperoni.setOpaque(false);
        pepperoni.setFocusable(false);
        pepperoni.addActionListener(this);
        orderingFrame.add(pepperoni);

        Ham.setFont(new Font("Arial", Font.BOLD, 16));
        Ham.setForeground(Color.black);
        Ham.setBounds(90, 195, 180, 30);
        Ham.setOpaque(false);
        Ham.setFocusable(false);
        Ham.addActionListener(this);
        orderingFrame.add(Ham);

        Chicken.setFont(new Font("Arial", Font.BOLD, 16));
        Chicken.setForeground(Color.black);
        Chicken.setBounds(90,225, 180, 30);
        Chicken.setOpaque(false);
        Chicken.setFocusable(false);
        Chicken.addActionListener(this);
        orderingFrame.add(Chicken);

        Mushroom.setFont(new Font("Arial", Font.BOLD, 16));
        Mushroom.setForeground(Color.black);
        Mushroom.setBounds(250, 165, 180, 30);
        Mushroom.setOpaque(false);
        Mushroom.setFocusable(false);
        Mushroom.addActionListener(this);
        orderingFrame.add(Mushroom);

        greenPepper.setFont(new Font("Arial", Font.BOLD, 16));
        greenPepper.setForeground(Color.black);
        greenPepper.setBounds(250, 195, 180, 30);
        greenPepper.setOpaque(false);
        greenPepper.setFocusable(false);
        greenPepper.addActionListener(this);
        orderingFrame.add(greenPepper);

        Onions.setFont(new Font("Arial", Font.BOLD, 16));
        Onions.setForeground(Color.black);
        Onions.setBounds(250, 225, 180, 30);
        Onions.setOpaque(false);
        Onions.setFocusable(false);
        Onions.addActionListener(this);
        orderingFrame.add(Onions);

        JLabel selectDrink = new JLabel("Select a Drink");
        selectDrink.setFont(new Font("Arial", Font.BOLD, 28));
        selectDrink.setForeground(Color.WHITE);
        selectDrink.setBounds(150, 265, 250, 40);
        orderingFrame.add(selectDrink);

        String[] drinkOptions = {"Coke", "Sprite", "Dr Pepper"};
        selectDrinkBox = new JComboBox(drinkOptions);
        selectDrinkBox.setFont(new Font("Arial", Font.BOLD, 16));
        selectDrinkBox.setForeground(Color.black);
        selectDrinkBox.setBounds(150, 315, 180, 30);
        selectDrinkBox.addActionListener(this);
        orderingFrame.add(selectDrinkBox);

        JLabel enterUserName = new JLabel("Inset Name for Order");
        enterUserName.setFont(new Font("Arial", Font.BOLD, 28));
        enterUserName.setForeground(Color.WHITE);
        enterUserName.setBounds(110, 355, 300, 40);
        orderingFrame.add(enterUserName);

        userName.setFont(new Font("Arial", Font.BOLD, 16));
        userName.setPreferredSize(new Dimension(150, 40));
        userName.setForeground(Color.black);
        userName.setBounds(117, 400, 250, 25);
        userName.addActionListener(this);
        orderingFrame.add(userName);


        placeOrder.setFont(new Font("Arial", Font.BOLD, 18));
        placeOrder.setForeground(Color.black);
        placeOrder.setBounds(170, 470, 150, 40);
        placeOrder.addActionListener(this);
        orderingFrame.add(placeOrder);

        cancelOrder.setFont(new Font("Arial", Font.BOLD, 18));
        cancelOrder.setForeground(Color.black);
        cancelOrder.setBounds(170, 530, 150, 40);
        cancelOrder.addActionListener(this);
        orderingFrame.add(cancelOrder);

        orderingFrame.setLayout(null);
        orderingFrame.setLocationRelativeTo(null); // Center on screen
        orderingFrame.setResizable(false);
        orderingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        orderingFrame.setVisible(true);
    }

    JButton submit = new JButton("Submit");
    public void confirmOrder(){

        JLabel thankYou = new JLabel();
        thankYou.setText("Thank you, " + orderName);
        thankYou.setFont(new Font("Arial", Font.BOLD, 25));
        thankYou.setForeground(Color.WHITE);
        thankYou.setBounds(100, 40, 300, 40);
        confirmationFrame.add(thankYou);

        JLabel Size = new JLabel();
        Size.setText("Size: " + userSize);
        Size.setFont(new Font("Arial", Font.BOLD, 20));
        Size.setForeground(Color.WHITE);
        Size.setBounds(100, 80, 300, 40);
        confirmationFrame.add(Size);

        JLabel Topping = new JLabel();
        String userTopping = "Topping: ";

        for(int i = 0; i < toppings.size(); i++){
            userTopping = userTopping + toppings.get(i) + ", ";
        }

        Topping.setText(userTopping);
        Topping.setFont(new Font("Arial", Font.BOLD, 20));
        Topping.setForeground(Color.WHITE);
        Topping.setBounds(70, 120, 500, 40);
        confirmationFrame.add(Topping);

        JLabel Drink = new JLabel();
        Drink.setText("Drink: " + userDrink);
        Drink.setFont(new Font("Arial", Font.BOLD, 20));
        Drink.setForeground(Color.WHITE);
        Drink.setBounds(100, 160, 300, 40);
        confirmationFrame.add(Drink);

        JLabel feedBack = new JLabel("How did you enjoy the ordering experience?");
        feedBack.setFont(new Font("Arial", Font.BOLD, 20));
        feedBack.setForeground(Color.WHITE);
        feedBack.setBounds(35, 210, 500, 40);
        confirmationFrame.add(feedBack);

        JRadioButton Great = new JRadioButton("Great");
        JRadioButton OK = new JRadioButton("Ok");
        JRadioButton Bad = new JRadioButton("Bad");

        Great.setBounds(55,250, 100, 40);
        Great.setFont(new Font("Arial", Font.BOLD, 20));
        Great.setOpaque(false);

        OK.setBounds(200,250, 100, 40);
        OK.setFont(new Font("Arial", Font.BOLD, 20));
        OK.setOpaque(false);

        Bad.setBounds(325,250, 100, 40);
        Bad.setFont(new Font("Arial", Font.BOLD, 20));
        Bad.setOpaque(false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(Great);
        bg.add(OK);
        bg.add(Bad);

        confirmationFrame.add(Great);
        confirmationFrame.add(OK);
        confirmationFrame.add(Bad);

        submit.setFont(new Font("Arial", Font.BOLD, 18));
        submit.setForeground(Color.black);
        submit.setBounds(160, 300, 150, 40);
        submit.addActionListener(this);
        confirmationFrame.add(submit);


        confirmationFrame.setSize(500, 400);
        confirmationFrame.setIconImage(pizzaHutIcon.getImage());
        confirmationFrame.getContentPane().setBackground(new Color(150, 0, 0));
        confirmationFrame.setLayout(null);
        confirmationFrame.setLocationRelativeTo(null); // Center on screen
        confirmationFrame.setResizable(false);
        confirmationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmationFrame.setVisible(true);
    }

    String userSize;
    String userDrink;
    String orderName;
    ArrayList <String> toppings = new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == orderPizza) {
            mainFrame.dispose();
            orderingScreen();
        }
        if(e.getSource() == cancelOrder) {
            orderingFrame.dispose();
            new PizzaHutMenu();
        }
        if(e.getSource() == placeOrder) {
            userSize = selectSizeBox.getSelectedItem().toString();
            userDrink = selectDrinkBox.getSelectedItem().toString();
            orderName = userName.getText();
            toppings.clear();
            if(pepperoni.isSelected()) {
                toppings.add("Pepperoni");
            }
            if(Ham.isSelected()) {
                toppings.add("Ham");
            }
            if(Chicken.isSelected()) {
                toppings.add("Chicken");
            }
            if(Mushroom.isSelected()) {
                toppings.add("Mushroom");
            }
            if(Onions.isSelected()) {
                toppings.add("Onions");
            }
            orderingFrame.dispose();
            confirmOrder();
        }
        if(e.getSource() == submit){
            confirmationFrame.dispose();
        }

    }
}