import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paymentUi extends JFrame {
    private JTextField cardNumberField;
    private JTextField cvsCodeField;
    private JTextField cardHolderNameField;
    private JTextField expirationDateField;
    private JButton payButton;
    private String subscriptionType;

    public paymentUi(String subscriptionType) {
        this.subscriptionType = subscriptionType;

        setTitle("Payment Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Card Number:"));
        cardNumberField = new JTextField();
        add(cardNumberField);

        add(new JLabel("CVS Code:"));
        cvsCodeField = new JTextField();
        add(cvsCodeField);

        add(new JLabel("Card Holder Name:"));
        cardHolderNameField = new JTextField();
        add(cardHolderNameField);

        add(new JLabel("Expiration Date (MM/YY):"));
        expirationDateField = new JTextField();
        add(expirationDateField);

        payButton = new JButton("Pay");
        add(payButton);

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardNumber = cardNumberField.getText();
                String cvsCode = cvsCodeField.getText();
                String cardHolderName = cardHolderNameField.getText();
                String expirationDate = expirationDateField.getText();

                if (validateInput(cardNumber, cvsCode, cardHolderName, expirationDate)) {
                    payment payment = new payment(cardNumber, cvsCode, cardHolderName, expirationDate);
                    JOptionPane.showMessageDialog(null, "Payment Successful! Subscription: " + subscriptionType);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Invalid input, please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    private boolean validateInput(String cardNumber, String cvsCode, String cardHolderName, String expirationDate) {
        return !cardNumber.isEmpty() && !cvsCode.isEmpty() && !cardHolderName.isEmpty() && expirationDate.matches("\\d{2}/\\d{2}");
    }

    public static void main(String[] args) {
        new paymentUi("Monthly");
    }
}
