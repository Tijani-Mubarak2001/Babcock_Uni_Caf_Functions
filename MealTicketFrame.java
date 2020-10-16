package com.TijaniMubarak;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MealTicketFrame extends JFrame
{
    Container c;
    JTextArea tout;
    JButton home;
    public static void main(String[]args)
    {
        EventQueue.invokeLater(new Runnable(){
            public void run()
            {
                try{
                    MealTicketFrame frame=new MealTicketFrame();
                    frame.setVisible(true);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public MealTicketFrame()
    {
        setTitle("Congratulations Registration successful!!. Proceed To Collect Ticket");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);

        tout = new JTextArea();
        tout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tout.setSize(600,600);
        tout.setLocation(0,0);
        tout.setEditable(false);
        c.add(tout);

        home = new JButton("New");
        home.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        home.setSize(150, 40);
        home.setLocation(650, 300);
        c.add(home);
        home.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                MealTicketForm sm = new MealTicketForm();
                sm.setVisible(true);
                dispose();
            }
        });

    }



}