package com.TijaniMubarak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BabcockCafteriaFunctions extends JFrame implements ActionListener
{
    Container c;
    JButton Get_meal;
    JButton Chapel_Seminar;
    JButton Biometric_reg;
    JButton Meal_ticket;

    JLabel img;
    JLabel title;

    public BabcockCafteriaFunctions(){

        setTitle("Babcock University Cafeteria Functions");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        c = getContentPane();
        c.setLayout(null);

        img=new JLabel();
        img.setIcon(new ImageIcon("C:\\Java files\\MortgageCalc\\src\\com\\TijaniMubarak\\image4.jpg"));
        img.setSize(100,100);
        img.setLocation(10,10);
        c. add(img);
        validate();


        title = new JLabel("WELCOME TO BABCOCK UNIVERSITY CAFETERIA");
        title.setFont(new Font("Lucida Calligraphy",Font.BOLD|Font.ITALIC,26));
        title.setSize(900, 40);
        title.setLocation(101,35);
        c.add(title);

        Get_meal = new JButton("Get Meal Ticket");
        Get_meal.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        Get_meal.setSize(300, 40);
        Get_meal.setLocation(100, 200);
        c.add(Get_meal);
        Get_meal.addActionListener(this);

        Chapel_Seminar = new JButton("Attend Chapel Seminar");
        Chapel_Seminar.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        Chapel_Seminar.setSize(300, 40);
        Chapel_Seminar.setLocation(490, 200);
        c.add(Chapel_Seminar);
        Chapel_Seminar.addActionListener(this);

        Biometric_reg = new JButton("Biometric Registration");
        Biometric_reg.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        Biometric_reg.setSize(300, 40);
        Biometric_reg.setLocation(100, 300);
        c.add(Biometric_reg);
        Biometric_reg.addActionListener(this);

        Meal_ticket = new JButton("Collect Meal");
        Meal_ticket.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        Meal_ticket.setSize(300, 40);
        Meal_ticket.setLocation(490, 300);
        c.add(Meal_ticket);
        Meal_ticket.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Get_meal)
        {
            int reply = JOptionPane.showConfirmDialog(null, "Have You Paid Your Fees Fully?", "Full fees?",  JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            MealTicketForm frame = new MealTicketForm();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }else {
                JOptionPane.showMessageDialog(null, "Please Pay All Fees");
            }

        }else if(e.getSource() == Chapel_Seminar){
            int reply = JOptionPane.showConfirmDialog(null, "Do You Have The Chapel Seminar Book?", "Seminar Book",  JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        try {
                            ChapelSeminarForm frame = new ChapelSeminarForm();
                            frame.setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }else {
            JOptionPane.showMessageDialog(null, "Please Get Your Seminar Book From The Student Development Center");
            }


        }else if(e.getSource() == Biometric_reg){

        }else if(e.getSource() == Meal_ticket){

        }
    }
    public static void main(String[] args)
    {


        EventQueue.invokeLater(new Runnable(){
            public void run()
            {
                try{
                    BabcockCafteriaFunctions frame=new BabcockCafteriaFunctions();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }


}

