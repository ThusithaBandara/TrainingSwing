// Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JLabel status;
    private JComboBox tstatus;

    private String dates[]
            = {"1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31"};
    private String months[]
            = {"Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec"};
    private String years[]
            = {"1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019"};
    private String stats[] = {
            "Full Time", "Part Time", "Retired", "Student", "Unemployed"
    };

    // constructor, to initialize the components
    // with default values.
    public MyFrame() {
        setTitle("Patient registration");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);


        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(500, 20);
        tname.setLocation(300, 100);
        c.add(tname);

        mno = new JLabel("Phone Number");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(200, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(500, 20);
        tmno.setLocation(300, 150);
        c.add(tmno);

        //toDo-birthday
        dob = new JLabel("Birthday");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 200);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(300, 200);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(350, 200);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(410, 200);
        c.add(year);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        c.add(gender);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(300, 250);
        c.add(female);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(false);
        male.setSize(75, 20);
        male.setLocation(375, 250);
        c.add(male);


        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);


        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(500, 75);
        tadd.setLocation(300, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        status = new JLabel("Employment Status ");
        status.setFont(new Font("Arial", Font.PLAIN, 20));
        status.setSize(200, 20);
        status.setLocation(100, 400);
        c.add(status);

        tstatus = new JComboBox(stats);
        tstatus.setFont(new Font("Arial", Font.PLAIN, 15));
        tstatus.setSize(200, 20);
        tstatus.setLocation(300, 400);
        c.add(tstatus);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
}

// Driver Code
class Register {

    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}
