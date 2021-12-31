package ScreenUI;

import BussinessLogic.CalculatorLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener { // we can extend JFrame, so we do not need to
                                                                     // create obj

    JTextField txtfield;
    JPanel panel;
    JButton btnOne;
    JButton btnTwo;
    JButton btnThree;
    JButton btnFour;
    JButton btnFive;
    JButton btnSix;
    JButton btnSeven;
    JButton btnEight;
    JButton btnNine;
    JButton btnAdd;
    JButton btnSub;
    JButton btnEquals;
    int num1;
    int num2;
    int flag;

    public CalculatorUI() {
        setTitle("Calculator");
        setSize(600, 600);
        setLayout(new BorderLayout());

        txtfield = new JTextField();

        add(txtfield, BorderLayout.NORTH);

        panel = new JPanel(new GridLayout(3, 4));
        add(panel, BorderLayout.CENTER);

        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnAdd = new JButton("+");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSub = new JButton("-");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnEquals = new JButton("=");

        btnAdd.setBackground(Color.GREEN);
        btnSub.setBackground(Color.BLUE);
        btnEquals.setBackground(Color.PINK);

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnEquals.addActionListener(this);

        panel.add(btnOne);
        panel.add(btnTwo);
        panel.add(btnThree);
        panel.add(btnAdd);
        panel.add(btnFour);
        panel.add(btnFive);
        panel.add(btnSix);
        panel.add(btnSub);
        panel.add(btnSeven);
        panel.add(btnEight);
        panel.add(btnNine);
        panel.add(btnEquals);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        CalculatorLogic calcLogic = new CalculatorLogic();
        if (flag == 3) {
            txtfield.setText("");
            flag = 0;
        }
        if (e.getSource() == btnOne) {
            txtfield.setText(txtfield.getText() + "1");
        } else if (e.getSource() == btnTwo) {
            txtfield.setText(txtfield.getText() + "2");
        } else if (e.getSource() == btnThree) {
            txtfield.setText(txtfield.getText() + "3");
        } else if (e.getSource() == btnFour) {
            txtfield.setText(txtfield.getText() + "4");
        } else if (e.getSource() == btnFive) {
            txtfield.setText(txtfield.getText() + "5");
        } else if (e.getSource() == btnSix) {
            txtfield.setText(txtfield.getText() + "6");
        } else if (e.getSource() == btnSeven) {
            txtfield.setText(txtfield.getText() + "7");
        } else if (e.getSource() == btnEight) {
            txtfield.setText(txtfield.getText() + "8");
        } else if (e.getSource() == btnNine) {
            txtfield.setText(txtfield.getText() + "9");
        } else if (e.getSource() == btnAdd) {
            this.num1 = Integer.parseInt(txtfield.getText());
            flag = 1;
            txtfield.setText("");
        } else if (e.getSource() == btnSub) {
            this.num1 = Integer.parseInt(txtfield.getText());
            flag = 2;
            txtfield.setText("");
        } else if (e.getSource() == btnEquals) {
            this.num2 = Integer.parseInt(txtfield.getText());

            calcLogic.setNum1(this.num1);
            calcLogic.setNum2(this.num2);

            if (flag == 1) {
                txtfield.setText(Integer.toString(calcLogic.add()));

            } else if (flag == 2) {
                txtfield.setText(Integer.toString(calcLogic.sub()));
            }

            flag = 3;
        }

    }

    public static void main(String[] args) {
        new CalculatorUI();
    }
}
