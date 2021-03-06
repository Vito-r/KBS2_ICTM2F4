import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class DataScreen extends JFrame implements ActionListener {
    private JButton jbQuantity;
    private JButton jbOrders;
    private JButton jbCustomers;
    private JButton jbGoBack;

    public DataScreen(){
        setTitle("Nerdy Gadgets - gegevens inzien/ aanpassen");
        setSize(500, 300);
        setLayout(new GridLayout(4,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jbGoBack = new JButton("< terug");
        jbGoBack.addActionListener(this);
        add(jbGoBack);

        jbQuantity = new JButton("voorraad");
        jbQuantity.addActionListener(this);
        add(jbQuantity);

        jbOrders = new JButton("bestelling");
        jbOrders.addActionListener(this);
        add(jbOrders);

        jbCustomers = new JButton("klant gegevens");
        jbCustomers.addActionListener(this);
        add(jbCustomers);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbQuantity){
            QuantityScreen quantityScreen = new QuantityScreen();
            dispose();
        } else if (e.getSource() == jbOrders){
            OrderScreen orderScreen = new OrderScreen();
            dispose();
        } else if(e.getSource() == jbCustomers){
            CustomerScreen customerScreen = new CustomerScreen();
            dispose();
        } else if(e.getSource() == jbGoBack) {
            dispose();
            HomeScreen homeScreen = new HomeScreen();
        }
    }
}
