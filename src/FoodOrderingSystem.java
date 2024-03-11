import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FoodOrderingSystem extends JFrame {
    private JPanel productPanel;
    private JPanel selectedProductPanel;
    private JTextField quantityTextField;

    public FoodOrderingSystem() {
        setTitle("Food Ordering System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {
        productPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        selectedProductPanel = new JPanel();
        quantityTextField = new JTextField(5);

        JButton addToCartButton = new JButton("Add to Cart");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Quantity: "));
        inputPanel.add(quantityTextField);
        inputPanel.add(addToCartButton);

        addToCartButton.addActionListener((ActionEvent e) -> {
            addToCart();
        });

        // Create product tiles for all items initially
        for (int i = 1; i <= 5; i++) {
            String itemName = "Item " + i;
            JPanel productTile = createProductTile(itemName);
            productPanel.add(productTile);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(productPanel, BorderLayout.CENTER);
        mainPanel.add(selectedProductPanel, BorderLayout.WEST);

        setContentPane(mainPanel);
    }

    private JPanel createProductTile(String product) {
        JPanel tile = new JPanel();
        tile.setBorder(BorderFactory.createEtchedBorder());
        tile.setLayout(new BoxLayout(tile, BoxLayout.PAGE_AXIS));

        JLabel productLabel = new JLabel(product);
        productLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Event handling for selecting items by clicking
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayProductDetails(product);
            }
        });

        tile.add(productLabel);

        return tile;
    }

    private void displayProductDetails(String product) {
        selectedProductPanel.removeAll();
        JLabel productDetailsLabel = new JLabel("Selected Product: " + product);
        productDetailsLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        selectedProductPanel.add(productDetailsLabel);
        selectedProductPanel.revalidate();
        selectedProductPanel.repaint();
    }

    private void addToCart() {
        String quantity = quantityTextField.getText();

        if (!quantity.isEmpty()) {
            String selectedProduct = selectedProductPanel.getComponent(0).toString();
            String productWithQuantity =  " - Quantity: " + quantity;

            // Display selected product in a dialog
            JOptionPane.showMessageDialog(this, productWithQuantity, "Added to Cart", JOptionPane.INFORMATION_MESSAGE);

            quantityTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a quantity.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FoodOrderingSystem().setVisible(true);
        });
    }
}
