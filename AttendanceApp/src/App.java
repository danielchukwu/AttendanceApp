import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    // Create Stack
    Stack stack = new Stack();


    // Create main to run our program
    public static void main(String[] args) {
        App myApp = new App();
        myApp.startApplication();
    }

    // Create GUI
    public void startApplication() {
        // Frame Setup
        JFrame frame = new JFrame("Steepy Ecommerce");
        frame.setLayout(new GridLayout(10, 1));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create Label
        JLabel matricNumberLabel = new JLabel("Enter Matric Number: ");

        // Create Textfield
        JTextField matricNumberField = new JTextField();

        // Create Buttons

        // Add Button
        JButton addBtn = new JButton("Add");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add to stack
                String matricNumber = matricNumberField.getText();
                if (matricNumber == "") {
                    return;
                } else {
                    stack.push(matricNumber);
                    matricNumberField.setText("");
                    System.out.println(matricNumber + " attendance has been added.");
                }

            }
        });
        // Remove Button
        JButton removeBtn = new JButton("Remove");
        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove from Stack
                String matricNumber = stack.pop();
                if (matricNumber != null) {
                    System.out.println(matricNumber + " attendance has been removed.");
                } else {
                    System.out.println("There is no attendance to remove.");
                }
            }
        });
        // Print Button
        JButton printStack = new JButton("Print Stack");
        printStack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Print stack
                String matricNumbers = stack.printStack();
                System.out.println(matricNumbers);
            }
        });

        // Add Components to frame
        frame.add(matricNumberLabel);
        frame.add(matricNumberField);
        frame.add(addBtn);
        frame.add(removeBtn);
        frame.add(printStack);

        // Make frame visible
        frame.setVisible(true);
    }
}

