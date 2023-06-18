import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProgram extends JFrame
{
    private JTextField no1Field;
    private JTextField no2Field;
    private JTextField resultField;

    public CalculatorProgram()
    {
        setTitle("BASIC CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 4));

        JLabel num1Label = new JLabel("First Number:");
        no1Field = new JTextField();
        JLabel num2Label = new JLabel("Second Number:");
        no2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calculateResult("+");
            }
        });

        JButton subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calculateResult("-");
            }
        });

        JButton multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calculateResult("*");
            }
        });

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                calculateResult("/");
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clearFields();
            }
        });

        add(num1Label);
        add(no1Field);
        add(num2Label);
        add(no2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(clearButton);

        pack();
        setLocationRelativeTo(null);
    }

    private void calculateResult(String operator)
    {
        try
        {
            double no1 = Double.parseDouble(no1Field.getText());
            double no2 = Double.parseDouble(no2Field.getText());
            double result = 0;

            switch (operator)
            {
                case "+":
                    result = no1 + no2;
                    break;
                case "-":
                    result = no1 - no2;
                    break;
                case "*":
                    result = no1 * no2;
                    break;
                case "/":
                    result = no1 / no2;
                    break;
            }

            resultField.setText(Double.toString(result));
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You input invalid numbers! Please, try again");
        }
    }

    private void clearFields()
    {
        no1Field.setText("");
        no2Field.setText("");
        resultField.setText("");
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                CalculatorProgram calculator = new CalculatorProgram();
                calculator.setVisible(true);
            }
        });
    }
}
