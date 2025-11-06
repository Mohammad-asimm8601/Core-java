// Write a java program to create a registration form using AWT
package questions;  
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends Frame implements ActionListener {

    Label nameLabel, genderLabel, courseLabel;
    TextField nameTextField;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    Choice courseChoice;
    Button submitButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Name
        nameLabel = new Label("Name:");
        nameTextField = new TextField(20);

        // Gender
        genderLabel = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, true);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);

        // Course
        courseLabel = new Label("Course:");
        courseChoice = new Choice();
        courseChoice.add("Computer Science");
        courseChoice.add("Electronics");
        courseChoice.add("Information Technology");

        // Submit Button
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        // Add Components to Frame
        add(nameLabel);
        add(nameTextField);
        add(genderLabel);
        add(maleCheckbox);
        add(femaleCheckbox);
        add(courseLabel);
        add(courseChoice);
        add(submitButton);

        // Window Closing Event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent ae) {
        String name = nameTextField.getText();
        String gender = genderGroup.getSelectedCheckbox().getLabel();
        String course = courseChoice.getSelectedItem();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Course: " + course);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        new StudentRegistrationForm();
        
    }
}
    

