import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class subscriptionUi extends JFrame {
    private JRadioButton monthlyButton;
    private JRadioButton sixMonthButton;
    private JRadioButton yearlyButton;
    private JButton subscribeButton;

    public subscriptionUi() {
        setTitle("Subscription Options");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 1));

        monthlyButton = new JRadioButton("Monthly Subscription");
        sixMonthButton = new JRadioButton("6-Month Subscription");
        yearlyButton = new JRadioButton("Yearly Subscription");

        ButtonGroup group = new ButtonGroup();
        group.add(monthlyButton);
        group.add(sixMonthButton);
        group.add(yearlyButton);

        add(monthlyButton);
        add(sixMonthButton);
        add(yearlyButton);

        subscribeButton = new JButton("Subscribe");
        add(subscribeButton);

        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String subscriptionType = getSelectedSubscription();
                if (subscriptionType != null) {
                    new paymentUi(subscriptionType).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a subscription type.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    private String getSelectedSubscription() {
        if (monthlyButton.isSelected()) {
            return "Monthly";
        } else if (sixMonthButton.isSelected()) {
            return "6-Month";
        } else if (yearlyButton.isSelected()) {
            return "Yearly";
        }
        return null;
    }

    public static void main(String[] args) {
        new subscriptionUi();
    }
}
