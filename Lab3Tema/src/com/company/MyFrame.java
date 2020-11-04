package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    private JLabel title;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelSurname;
    private JTextField textFieldSurname;
    private JLabel labelAge;
    private JTextField textFieldAge;
    private JLabel labelGender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genders;
    private JCheckBox married;
    private JLabel labelAdress;
    private JTextArea textAreaAdress;
    private JButton buttonSave;
    private Container container;
    private JLabel refactor;

    public MyFrame() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        title = new JLabel("Insert your data");
        title.setFont(new Font("Colibri", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        labelName = new JLabel("First Name: ");
        labelName.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelName.setSize(190, 15);
        labelName.setLocation(90, 100);
        container.add(labelName);

        textFieldName = new JTextField();
        textFieldName.setFont(new Font("Colibri", Font.PLAIN, 20));
        textFieldName.setSize(300, 30);
        textFieldName.setLocation(200, 100);
        container.add(textFieldName);

        labelSurname = new JLabel("Last Name: ");
        labelSurname.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelSurname.setSize(190, 30);
        labelSurname.setLocation(90, 130);
        container.add(labelSurname);

        textFieldSurname = new JTextField();
        textFieldSurname.setFont(new Font("Colibri", Font.PLAIN, 20));
        textFieldSurname.setSize(300, 30);
        textFieldSurname.setLocation(200, 130);
        container.add(textFieldSurname);

        labelAge = new JLabel("Age: ");
        labelAge.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelAge.setSize(190, 30);
        labelAge.setLocation(150, 160);
        container.add(labelAge);

        textFieldAge = new JTextField();
        textFieldAge.setFont(new Font("Colibri", Font.PLAIN, 20));
        textFieldAge.setSize(300, 30);
        textFieldAge.setLocation(200, 160);
        container.add(textFieldAge);

        labelGender = new JLabel("Gender: ");
        labelGender.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelGender.setSize(190, 15);
        labelGender.setLocation(100, 220);
        container.add(labelGender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Colibri", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 220);
        container.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Colibri", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 220);
        container.add(female);

        genders = new ButtonGroup();
        genders.add(male);
        genders.add(female);

        married = new JCheckBox("Married?");
        married.setFont(new Font("Colibri", Font.PLAIN, 15));
        married.setSize(250, 20);
        married.setLocation(100, 250);
        container.add(married);

        labelAdress = new JLabel("Adress: ");
        labelAdress.setFont(new Font("Colibri", Font.PLAIN, 20));
        labelAdress.setSize(190, 15);
        labelAdress.setLocation(100, 300);
        container.add(labelAdress);

        textAreaAdress = new JTextArea();
        textAreaAdress.setFont(new Font("Colibri", Font.PLAIN, 20));
        textAreaAdress.setSize(300, 140);
        textAreaAdress.setLocation(200, 300);
        textAreaAdress.setLineWrap(true);
        container.add(textAreaAdress);

        buttonSave = new JButton("Save");
        buttonSave.setFont(new Font("Colibri", Font.PLAIN, 15));
        buttonSave.setSize(100, 20);
        buttonSave.setLocation(350, 450);
        buttonSave.addActionListener(this);
        container.add(buttonSave);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSave) {
            String data1;
            if (male.isSelected())
                data1 = "Gender : Male"
                        + "\n";
            else
                data1 = "Gender : Female"
                        + "\n";

            String data2;
            if (married.isSelected())
                data2 = "Married: Yes" + "\n";
            else
                data2 = "Married: No" + "\n";
            
            container.removeAll();
            container.revalidate();
            container.repaint();

            refactor = new JLabel("First Name: "+textFieldName.getText());
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 15);
            refactor.setLocation(90, 100);
            container.add(refactor);

            refactor = new JLabel("Last name: "+textFieldSurname.getText());
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 30);
            refactor.setLocation(90, 130);
            container.add(refactor);

            refactor = new JLabel("Age: "+textFieldAge.getText());
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 30);
            refactor.setLocation(90, 160);
            container.add(refactor);

            refactor = new JLabel(data1);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 30);
            refactor.setLocation(90, 190);
            container.add(refactor);

            refactor = new JLabel(data2);
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 30);
            refactor.setLocation(90, 230);
            container.add(refactor);

            refactor = new JLabel(textAreaAdress.getText());
            refactor.setFont(new Font("Colibri", Font.PLAIN, 20));
            refactor.setSize(190, 15);
            refactor.setLocation(90, 300);
            container.add(refactor);

            setVisible(true);
        }
    }

}

