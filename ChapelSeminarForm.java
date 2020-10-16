package com.TijaniMubarak;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ChapelSeminarForm extends JFrame implements ActionListener
{
    String data_stored, file_name, new_data;
    Container c;

    JLabel title,name,nation,email,mno,matric,maiden,denom,height,weight;
    JTextField tname,tnation,temail,tmno,tmatric,tmaiden,tdenom,theight,tweight;

    JLabel time;
    JTextArea the_time;

    JLabel img;

    JLabel gender;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;



    JLabel dob;
    JComboBox date;
    JComboBox month;
    JComboBox year;

    JButton sub;
    JButton reset;

    JLabel meal;
    JRadioButton Two_meals;
    JRadioButton Three_meals;
    ButtonGroup Meals;




    JLabel origin;
    JComboBox state;

    JLabel course;
    JComboBox courses;

    JLabel Halls;
    JComboBox Hall_of_Residence;

    JLabel Meal;
    JComboBox Meal_type;

    JLabel lga;
    JTextField area;

    JLabel depart;
    JComboBox departments;

    JLabel marital;
    JRadioButton married;
    JRadioButton single;
    ButtonGroup status;

    JLabel reli;
    JComboBox religion;

    String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020" };
    String states[]
            ={  "Abuja","Abia","Adamawa",
            "Akwa Ibom","Anambra",
            "Bauchi","Bayelsa","Benue",
            "Borno","Cross River","Delta",
            "Ebonyi","Edo","Ekiti" ,
            "Enugu","Gombe","Imo" ,
            "Jigawa","Kaduna","Kano" ,
            "Katsina","Kebbi","Kogi","Kwara",
            "Lagos","Nassarawa","Niger",
            "Ogun","Ondo","Osun",
            "Oyo","Plateau","Rivers",
            "Sokoto","Taraba","Yobe","Zamfara","other"};
    String religions[]
            ={ "Christian","Muslim","other"};

    String cours[]
            ={
            "ACCOUNTING",
            "AGRICULTURE","ANATOMY","BANKING AND FINANCE","BIOCHEMISTRY",
            "BIOLOGY","BUSINESS ADMINISTRATION","BUSINESS EDUCATION",
            "CHEMISTRY","CRS","COMPUTER SCIENCE",
            "INFORMATION TECHNOLOGY","ECONOMICS","EDUCATIONAL ADMINISTRATION",
            "ENGLISH STUDIES","FRENCH","FRENCH AND IR",
            "GUIDANCE AND COUNSELLING","HISTORY AND INTERNATIONAL STUDIES","ICT",
            "INFORMATION RESOURCE MANAGEMENT","LAW","MARKETING","MASS COMMUNICATION",
            "MATHEMATICS","MEDICAL LABORATORY SCIENCE","MEDICINE AND SURGERY",
            "MICROBIOLOGY","MUSIC","NURSING",
            "NUTRITION AND DIETETICS","PHYSICS","PHYSIOLOGY",
            "POLITICAL SCIENCE","POLITICAL SCIENCE ","PUBLIC ADMINISTRATION",
            "PUBLIC HEALTH TECHNOLOGY","RELIGIOUS STUDIES","SOCIAL WORK","SOFTWARE ENGINEERING"
    };

    String department[]
            ={
            "BENJAMIN CARSON SCHOOL OF MEDICINE",
            "COMPUTING AND ENGINEERING SCIENCES","EDUCATION AND HUMANITIES","LAW AND SECURITY STUDIES",	"MANAGEMENT SCIENCES",
            "SCHOOL OF NURSING SCIENCES","PUBLIC AND ALLIED HEALTH","SCIENCE AND TECHNOLOGY","VERONICA ADELEKE SCHOOL OF SOCIAL SCIENCES"
    };
    String Hall_of_Resident[] = {
            "BETHEL SPLENDOR", "NEAL WILSON", "NELSON MANDELA", "GEDION TROOPERS", "SAMUEL AKANDE", "WELCH", "GAMALIEL HALL"

    };


    public static void main(String[] args)
    {


        EventQueue.invokeLater(new Runnable(){
            public void run()
            {
                try{
                    ChapelSeminarForm frame=new ChapelSeminarForm();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    // Components of the Form

    public static String createAndWrieFile(String data_crd, String file_name){
        String c_result = "", w_result = "", cw_result;

        //to create the txt file
        try{
            File myFile = new File(file_name);
            if(myFile.createNewFile()){
                c_result = "File created: " + myFile.getName();
            }
            else{
                c_result = "File already exists";
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        //to write to the file created
        try{
            FileWriter myWriter = new FileWriter(file_name);
            myWriter.write(data_crd);
            myWriter.close();
            w_result = "Successfully wrote to the file.";
        }catch(IOException e){
            e.printStackTrace();
        }
        cw_result = c_result + "\n" +w_result;

        return cw_result;
    }
    public ChapelSeminarForm()
    {



        setTitle("Registration Form");
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



        title = new JLabel("WELCOME TO CHAPEL SEMINAR");
        title.setFont(new Font("Lucida Calligraphy",Font.BOLD|Font.ITALIC,39));
        title.setSize(800, 40);
        title.setLocation(110,35);

        c.add(title);

        name = new JLabel("FULLNAME");
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name.setSize(150,20);
        name.setLocation(10, 130);

        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tname.setSize(250, 20);
        tname.setLocation(130, 130);

        c.add(tname);



        matric = new JLabel("MATRIC NO.");
        matric.setFont(new Font("Times New Roman", Font.BOLD, 20));
        matric.setSize(200, 20);
        matric.setLocation(10, 180);

        c.add(matric);

        tmatric = new JTextField();
        tmatric.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tmatric.setSize(150, 20);
        tmatric.setLocation(130, 180);
        c.add(tmatric);




        gender = new JLabel("GENDER");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gender.setSize(100, 20);
        gender.setLocation(10, 230);

        c.add(gender);

        male = new JRadioButton("MALE");
        male.setFont(new Font("Times New Roman", Font.BOLD, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(110, 230);
        c.add(male);

        female = new JRadioButton("FEMALE");
        female.setFont(new Font("Times New Roman", Font.BOLD, 15));
        female.setSelected(false);
        female.setSize(150, 20);
        female.setLocation(200, 230);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        time = new JLabel("TIME OF ARRIVAL");
        time.setFont(new Font("Times New Roman", Font.BOLD, 20));
        time.setSize(200, 20);
        time.setLocation(10, 280);
        c.add(time);

        the_time = new JTextArea();
        the_time.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        the_time.setSize(100, 20);
        the_time.setLocation(200, 280);
        the_time.setLineWrap(true);
        c.add(the_time);


        mno = new JLabel("MOBILE");
        mno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mno.setSize(100, 20);
        mno.setLocation(10, 330);

        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(100, 330);
        c.add(tmno);


        course = new JLabel("COURSE");
        course.setFont(new Font("Times New Roman", Font.BOLD, 20));
        course.setSize(100, 20);
        course.setLocation(10, 380);
        c.add(course);

        courses = new JComboBox(cours);
        courses.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        courses.setSize(330, 20);
        courses.setLocation(100, 380);
        c.add(courses);



        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        sub.setSize(150, 40);
        sub.setLocation(100, 510);
        c.add(sub);
        sub.addActionListener(this);

        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20));
        reset.setSize(150, 40);
        reset.setLocation(490, 510);
        reset.addActionListener(this);
        c.add(reset);

    }
    public void mnoKeyTyped(KeyEvent evt)
    {
        char f=evt.getKeyChar();
        if(!(Character.isDigit(f)))
        {
            evt.consume();
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub)
        {

            String data1,data2, data6;
            String dat="\tATTENDANTS TAKEN\n";

            String data
                    = "NAME : "
                    + tname.getText() + "\t\t"
                    +"MATRIC NUMBER : "
                    +tmatric.getText() + "\n"
                    +"MAIDENNAME : "
                    +tmatric.getText() + "\n"

                    + "Mobile : "
                    + tmno.getText() + "\n";
            if (male.isSelected()) {
                data1 = "GENDER : Male"
                        + "\n";
            }
            else{
                data1 = "GENDER : Female"
                        + "\n";
            }

            String data4 = "\nTIME OF ARRIVAL : " + the_time.getText();
            String data3
                    = "DEPARTMENT : "
                    + (String)courses.getSelectedItem();


            data_stored = dat+data + data1 + data3 + data4;
            file_name = tname.getText() + tmno.getText() + ".txt";

            String result = createAndWrieFile(data_stored,file_name); //create and write data into txt file

            new_data = data_stored + "\n\n\n" + result;



            SeminarFrame nw=new SeminarFrame();
            nw.tout.setText(new_data);
            nw.setVisible(true);
            dispose();
        }
        else if(e.getSource() == reset)
        {
            String def = "";
            tname.setText(def);
            the_time.setText(def);
            tmno.setText(def);
            departments.setSelectedIndex(0);
        }
    }
}

