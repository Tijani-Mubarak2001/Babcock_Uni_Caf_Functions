package com.TijaniMubarak;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class MealTicketForm extends JFrame implements ActionListener
{

    String data_stored, file_name, new_data;
    Container c;

    JLabel title,name,nation,email,mno,matric,maiden,denom,height,weight;
    JTextField tname,tnation,temail,tmno,tmatric,tmaiden,tdenom,theight,tweight;

    JLabel add;
    JTextArea tadd;

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
                    MealTicketForm frame=new MealTicketForm();
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
    public MealTicketForm()
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



        title = new JLabel("MEAL TICKET REGISTRATION");
        title.setFont(new Font("Lucida Calligraphy",Font.BOLD|Font.ITALIC,40));
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

        maiden = new JLabel("MAIDENNAME");
        maiden.setFont(new Font("Times New Roman", Font.BOLD, 20));
        maiden.setSize(180,20);
        maiden.setLocation(400, 130);

        c.add(maiden);

        tmaiden = new JTextField();
        tmaiden.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tmaiden.setSize(250, 20);
        tmaiden.setLocation(550, 130);

        c.add(tmaiden);

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

        marital=new JLabel("MARITALSTATUS");
        marital.setFont(new Font("Times New Roman", Font.BOLD, 20));
        marital.setSize(200, 20);
        marital.setLocation(300, 180);

        c.add(marital);

        single = new JRadioButton("SINGLE");
        single.setFont(new Font("Times New Roman", Font.BOLD, 15));
        single.setSelected(false);
        single.setSize(150, 20);
        single.setLocation(480, 180);
        c.add(single);


        married = new JRadioButton("MARRIED");
        married.setFont(new Font("Times New Roman", Font.BOLD, 15));
        married.setSelected(true);
        married.setSize(175, 20);
        married.setLocation(627, 180);
        c.add(married);


        status = new ButtonGroup();
        status.add(married);
        status.add(single);



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




        Halls = new JLabel("HALL OF RESIDENCE");
        Halls.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Halls.setSize(250, 20);
        Halls.setLocation(350, 230);
        c.add(Halls);

        Hall_of_Residence = new JComboBox(Hall_of_Resident);
        Hall_of_Residence.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Hall_of_Residence.setSize(200, 20);
        Hall_of_Residence.setLocation(600, 230);
        c.add(Hall_of_Residence);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Times New Roman", Font.BOLD, 20));
        dob.setSize(100, 20);
        dob.setLocation(10, 280);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(90, 280);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(140, 280);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(200, 280);
        c.add(year);

        origin = new JLabel("ORIGIN");
        origin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        origin.setSize(100, 20);
        origin.setLocation(300, 280);
        c.add(origin);

        state = new JComboBox(states);
        state.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        state.setSize(90, 20);
        state.setLocation(390, 280);
        c.add(state);

        lga = new JLabel("L.G.A");
        lga.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lga.setSize(60, 20);
        lga.setLocation(500, 280);
        c.add(lga);

        area = new JTextField();
        area.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        area.setSize(250, 20);
        area.setLocation(560, 280);
        c.add(area);


        add = new JLabel("ADDRESS");
        add.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add.setSize(100, 20);
        add.setLocation(10, 330);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(110, 330);
        tadd.setLineWrap(true);
        c.add(tadd);


        reli = new JLabel("RELIGION");
        reli.setFont(new Font("Times New Roman",Font.BOLD,20));
        reli.setSize(110,20);
        reli.setLocation(320,330);
        c.add(reli);

        religion = new JComboBox(religions);
        religion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        religion.setSize(120, 20);
        religion.setLocation(425, 330);
        c.add(religion);

        height = new JLabel("HEIGHT");
        height.setFont(new Font("Times New Roman", Font.BOLD, 20));
        height.setSize(100, 20);
        height.setLocation(555, 330);
        c.add(height);

        theight = new JTextField();
        theight.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        theight.setSize(45, 20);
        theight.setLocation(640, 330);
        c.add(theight);

        weight = new JLabel("WEIGHT");
        weight.setFont(new Font("Times New Roman", Font.BOLD, 20));
        weight.setSize(100, 20);
        weight.setLocation(690, 330);
        c.add(weight);

        tweight = new JTextField();
        tweight.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tweight.setSize(45, 20);
        tweight.setLocation(785, 330);
        c.add(tweight);

        denom = new JLabel("DENOMINATION");
        denom.setFont(new Font("Times New Roman", Font.BOLD, 20));
        denom.setSize(200,20);
        denom.setLocation(320, 380);
        c.add(denom);

        tdenom = new JTextField();
        tdenom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tdenom.setSize(250, 20);
        tdenom.setLocation(490, 380);
        c.add(tdenom);



        mno = new JLabel("MOBILE");
        mno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mno.setSize(100, 20);
        mno.setLocation(10, 430);

        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(100, 430);
        c.add(tmno);

        depart = new JLabel("DEPARTMENT");
        depart.setFont(new Font("Times New Roman", Font.BOLD, 20));
        depart.setSize(150, 20);
        depart.setLocation(270, 430);
        c.add(depart);

        departments = new JComboBox(department);
        departments.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        departments.setSize(350, 20);
        departments.setLocation(422, 430);
        c.add(departments);

        course = new JLabel("COURSE");
        course.setFont(new Font("Times New Roman", Font.BOLD, 20));
        course.setSize(100, 20);
        course.setLocation(10, 480);
        c.add(course);

        courses = new JComboBox(cours);
        courses.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        courses.setSize(330, 20);
        courses.setLocation(100, 480);
        c.add(courses);

        meal=new JLabel("MEALS");
        meal.setFont(new Font("Times New Roman", Font.BOLD, 20));
        meal.setSize(200, 20);
        meal.setLocation(500, 480);

        c.add(meal);

        Two_meals = new JRadioButton("TWO MEALS");
        Two_meals.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Two_meals.setSelected(false);
        Two_meals.setSize(150, 20);
        Two_meals.setLocation(580, 480);
        c.add(Two_meals);


        Three_meals = new JRadioButton("THREE MEALS");
        Three_meals.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Three_meals.setSelected(true);
        Three_meals.setSize(175, 20);
        Three_meals.setLocation(727, 480);
        c.add(Three_meals);

        Meals = new ButtonGroup();
        Meals.add(Two_meals);
        Meals.add(Three_meals);

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
            String dat="\tREGRISTRATION DETAILS\n";

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
            if (Three_meals.isSelected()) {
                data6 = "\nNumbers Of Meals : Three Meals"
                        + "\n";
            }
            else{
                data6 = "\nNumbers Of Meals : Two Meals"
                        + "\n";
            }
            if(single.isSelected()){
                data2 = "MARITALSTATUS : SINGLE"
                        +"\n";
            }
            else{
                data2 = "MARITALSTATUS : MARRIED"
                        +"\n";
            }
            String data3
                    = "DOB : "
                    + (String)date.getSelectedItem()
                    + "/" + (String)month.getSelectedItem()
                    + "/" + (String)year.getSelectedItem()
                    + "\n";
            String data4 = "Address : " + tadd.getText();
            String data5  = "Hall Of Residence: " + Hall_of_Residence.getSelectedItem();

            data_stored = dat+data + data1 + data2 + data3 + data5 + data6;
            file_name = tname.getText() + tmno.getText() + ".txt";

            String result = createAndWrieFile(data_stored,file_name); //create and write data into txt file

            new_data = data_stored + "\n\n\n" + result;



            MealTicketFrame nw=new MealTicketFrame();
            nw.tout.setText(new_data);
            nw.setVisible(true);
            dispose();
        }
        else if(e.getSource() == reset)
        {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            Hall_of_Residence.setSelectedIndex(0);
            Meals.setSelected(null, false);
        }
    }
}
