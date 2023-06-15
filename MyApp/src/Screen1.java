import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Screen1 extends JFrame{
    private JTextField txtSurname;
    private JTextField txtFirstNames;
    private JTextField txtContactNumber;
    private JTextField txtDate;
    private JTextField txtAge;
    private JPanel jpaneContent;
    private JPanel jpanelMain;
    private JScrollPane jscroll;
    private JCheckBox ckbBeefStirFry;
    private JCheckBox ckbPapAndWors;
    private JCheckBox ckbPizza;
    private JRadioButton eatStr;
    private JRadioButton eatAgr;
    private JRadioButton eatNeu;
    private JRadioButton eatDis;
    private JRadioButton eatStrD;
    private JButton btnSubmi;
    private JRadioButton movNeu;
    private JRadioButton tvNeu;
    private JRadioButton radNeu;
    private JRadioButton movDis;
    private JRadioButton tvDis;
    private JRadioButton radDis;
    private JRadioButton movStrD;
    private JRadioButton tvStrD;
    private JRadioButton radStrD;
    private JRadioButton movStr;
    private JRadioButton tvStr;
    private JRadioButton radStr;
    private JRadioButton radAgr;
    private JRadioButton tvAgr;
    private JRadioButton movAgr;
    private JCheckBox ckbChickenStirFry;
    private JCheckBox ckbPasta;
    private JCheckBox ckbOther;


    public Screen1() {
        setTitle("Online Survey");
        setContentPane(jscroll);
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);


        ButtonGroup groupE = new ButtonGroup();
        groupE.add(eatAgr);
        groupE.add(eatDis);
        groupE.add(eatNeu);
        groupE.add(eatStr);
        groupE.add(eatStrD);
        ButtonGroup groupM = new ButtonGroup();
        groupM.add(movAgr);
        groupM.add(movDis);
        groupM.add(movNeu);
        groupM.add(movStr);
        groupM.add(movStrD);
        ButtonGroup groupT = new ButtonGroup();
        groupT.add(tvAgr);
        groupT.add(tvDis);
        groupT.add(tvNeu);
        groupT.add(tvStr);
        groupT.add(tvStrD);
        ButtonGroup groupR = new ButtonGroup();
        groupR.add(radAgr);
        groupR.add(radDis);
        groupR.add(radNeu);
        groupR.add(radStr);
        groupR.add(radStrD);
        //JButton sbtButton = new JButton();//
        //sbtButton.setBounds(130,100,100,30);//



        btnSubmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerSurvey();
                new WelcomeScreen().setVisible(true);
                dispose();
            }
        });
        setVisible(true);

        txtAge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char a = e.getKeyChar();
                if (Character.isLetter(a)) {
                    e.consume();
                    // txtAge.setText("Please enter numbers only");//
                }//else {
                // txtAge.setEditable(true);
                //}
                super.keyTyped(e);
            }
        });
        txtContactNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
                super.keyTyped(e);
            }
        });
        txtContactNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String PhoneNumber = txtContactNumber.getText();
                Integer length = PhoneNumber.length();
                char p = e.getKeyChar();
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    if (length < 10) {
                        txtContactNumber.setEditable(true);
                    } else {
                        txtContactNumber.setEditable(false);
                    }
                } else {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                        txtContactNumber.setEditable(true);
                    } else {
                        txtContactNumber.setEditable(false);
                    }
                }
                super.keyPressed(e);
            }
        });
        txtAge.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String Age = txtAge.getText();
                Integer length = Age.length();
                char p = e.getKeyChar();
                if (e.getKeyChar() >= '1' && e.getKeyChar() <= '9') {
                    if (length < 5) {
                        txtAge.setEditable(true);
                    } else {
                        txtAge.setEditable(false);
                    }
                } else {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                        txtAge.setEditable(true);
                    } else {
                        txtAge.setEditable(false);
                    }
                }
                super.keyPressed(e);
            }
        });
        eatStr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eatStr.isSelected()){
                    int eatS = 1;
                }
            }
        });
        movStr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(movStr.isSelected()){
                    int movS = 1;
                }
            }
        });
        tvStr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tvStr.isSelected()){
                    int tvS = 1;
                }
            }
        });
        radStr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radStr.isSelected()){
                    int radS = 1;
                }
            }
        });
        eatAgr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eatAgr.isSelected()){
                    int eatA = 1;
                }
            }
        });
        movAgr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(movAgr.isSelected()){
                    int movA = 1;
                }
            }
        });
        tvAgr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tvAgr.isSelected()){
                    int tvA = 1;
                }
            }
        });
        radAgr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radAgr.isSelected()){
                    int radA = 1;
                }else {
                    return;
                }
            }
        });
        eatNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eatNeu.isSelected()){
                    int eatN = 1;
                }
            }
        });
        movNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(movNeu.isSelected()){
                    int movN = 1;
                }
            }
        });
        tvNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tvNeu.isSelected()){
                    int tvN = 1;
                }
            }
        });
        radNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radNeu.isSelected()){
                    int radN = 1;
                }
            }
        });
        eatDis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eatDis.isSelected()){
                    int eatD = 1;
                }
            }
        });
        movDis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(movDis.isSelected()){
                    int movD = 1;
                }
            }
        });
        tvDis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tvDis.isSelected()){
                    int tvD = 1;
                }
            }
        });
        radDis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radDis.isSelected()){
                    int radD = 1;
                }
            }
        });
        eatStrD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(eatStrD.isSelected()){
                    int eatSD = 1;
                }
            }
        });
        movStrD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(movStrD.isSelected()){
                    int movSD = 1;
                }
            }
        });
        tvStrD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tvStrD.isSelected()){
                    int tvSD= 1;
                }
            }
        });
        radStrD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radStrD.isSelected()){
                    String radSD = "1";
                }
            }
        });
        ckbOther.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbOther.isSelected()){
                    String movS = "1";
                }
            }
        });
        ckbBeefStirFry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbBeefStirFry.isSelected()){
                    String movS = "1";
                }
            }
        });
        ckbChickenStirFry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbChickenStirFry.isSelected()){
                    String movS = "1";
                }
            }
        });
        ckbPapAndWors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbPapAndWors.isSelected()){
                    String movS = "1";
                }
            }
        });
        ckbPasta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbPasta.isSelected()){
                    String movS = "1";
                }
            }
        });
        ckbPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ckbPizza.isSelected()){
                    int mS = 1;
                    String Piz = Integer.toString(mS);
                }
            }
        });
        txtDate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    e.consume();
                }
                super.keyTyped(e);
            }
        });
        txtDate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String DateToday = txtDate.getText();
                Integer length = DateToday.length();
                char p = e.getKeyChar();
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    if (length < 8) {
                        txtDate.setEditable(true);
                    } else {
                        txtDate.setEditable(false);
                    }
                } else {
                    if (e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                        txtDate.setEditable(true);
                    } else {
                        txtDate.setEditable(false);
                    }
                }
                super.keyPressed(e);
            }
        });
        setVisible(true);
    }

    private void registerSurvey() {
        String surname = txtSurname.getText();
        String firstName = txtFirstNames.getText();
        String contact = txtContactNumber.getText();
        String date = txtDate.getText();
        String age = txtAge.getText();
        String pizza = ckbPizza.getText();
        String pasta = ckbPasta.getText();
        String papAndWors = ckbPapAndWors.getText();
        String chickenStirFry = ckbChickenStirFry.getText();
        String beefStirFry = ckbBeefStirFry.getText();
        String other = ckbOther.getText();
        String eatS = eatStr.getText();
        String eatA = eatAgr.getText();
        String eatN = eatNeu.getText();
        String eatD = eatDis.getText();
        String eatSD = eatStrD.getText();
        String movS = movStr.getText();
        String movA = movAgr.getText();
        String movD = movDis.getText();
        String movN = movNeu.getText();
        String movSD = movStrD.getText();
        String tvS = tvStr.getText();
        String tvA = tvAgr.getText();
        String tvN = tvNeu.getText();
        String tvD = tvDis.getText();
        String tvSD = tvStrD.getText();
        String radS = radStr.getText();
        String radA = radAgr.getText();
        String radN = radNeu.getText();
        String radD = radDis.getText();
        String radSD = radStrD.getText();


        if (ckbPizza.isSelected()) {
            String piz = "Pizza";
            return;
            //JOptionPane.showMessageDialog(this, "Please enter all field", "Try again", JOptionPane.ERROR_MESSAGE); //
        }
        survey = addSurveyToDatabase(surname, firstName, contact, date, age, pizza, pasta, papAndWors, chickenStirFry, beefStirFry, other, eatD, eatA, eatN, eatSD, eatS, movS, movA, movN, movD, movSD, tvS, tvA, tvN, tvD, tvSD, radS, radA, radN, radD, radSD);
        if(survey != null){
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Failed to register new survey: ","Try again", JOptionPane.ERROR_MESSAGE);
        }

    }
    public Survey survey;
    private Survey addSurveyToDatabase(String Surname, String FirstName, String Contact, String Date, String Age, String Pizza, String Pasta, String PapAndWors, String ChickenStirFry, String BeefStirFry, String Other, String eatStr, String eatAgr, String eatNue, String eatDis, String eatStrD, String movStr, String movAgr, String movNeu, String movDis, String movStrD, String tvStr, String tvAgr, String tvNeu, String tvDis, String tvStrD, String radStr, String radAgr, String radNeu, String radDis, String radStrD) {
        Survey survey = null;
        final String DB_URL = "jdbc:mysql://localhost:3306/survey";
        final String USERNAME = "root";
        final String PASSWORD = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,"root",null);
            Statement stmt = conn.createStatement();
            //noinspection SqlNoDataSourceInspection
            String sql = "INSERT INTO survey(Surname, FirstName, Contact, Date, Age, Pizza, Pasta, PapAndWors, ChickenStirFry, BeefStirFry, Other, eatStr, eatAgr, eatNue, eatDis, eatStrD, movStr, movAgr, movNeu, movDis, movStrD, tvStr, tvAgr, tvNeu, tvDis, tvStrD, radStr, radAgr, radNeu, radDis, radStrD)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, Surname);
            preparedStatement.setString(2, FirstName);
            preparedStatement.setString(3, Contact);
            preparedStatement.setString(4, Date);
            preparedStatement.setString(5, Age);
            preparedStatement.setString(6, Pizza);
            preparedStatement.setString(7, Pasta);
            preparedStatement.setString(8, PapAndWors);
            preparedStatement.setString(9, ChickenStirFry);
            preparedStatement.setString(10, BeefStirFry);
            preparedStatement.setString(11, Other);
            preparedStatement.setString(12, eatStr);
            preparedStatement.setString(13, eatAgr);
            preparedStatement.setString(14, eatNue);
            preparedStatement.setString(15, eatDis);
            preparedStatement.setString(16, eatStrD);
            preparedStatement.setString(17, movStr);
            preparedStatement.setString(18, movAgr);
            preparedStatement.setString(19, movNeu);
            preparedStatement.setString(20, movDis);
            preparedStatement.setString(21, movStrD);
            preparedStatement.setString(22, tvStr);
            preparedStatement.setString(23, tvAgr);
            preparedStatement.setString(24, tvNeu);
            preparedStatement.setString(25, tvDis);
            preparedStatement.setString(26, tvStrD);
            preparedStatement.setString(27, radStr);
            preparedStatement.setString(28, radAgr);
            preparedStatement.setString(29, radNeu);
            preparedStatement.setString(30, radDis);
            preparedStatement.setString(31, radStrD);

            int addedRows;
            addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0){
                survey = new Survey();
                survey.surname = Surname;
                survey.firstName = FirstName;
                survey.contact = Contact;
                survey.date = Date;
                survey.age = Age;
                survey.pizza = Pizza;
                survey.pasta = Pasta;
                survey.papAndWors = PapAndWors;
                survey.beefStirFry = BeefStirFry;
                survey.other = Other;
                survey.eatS = eatStr;
                survey.eatA = eatAgr;
                survey.eatN = eatNue;
                survey.eatD = eatDis;
                survey.eatSD = eatStrD;
                survey.movS = movStr;
                survey.movA = movAgr;
                survey.movN = movNeu;
                survey.movD = movDis;
                survey.movSD = movStrD;
                survey.tvS = tvStr;
                survey.tvA = tvAgr;
                survey.tvN = tvNeu;
                survey.tvD = tvDis;
                survey.tvSD = tvStrD;
                survey.radS = radStr;
                survey.radA = radAgr;
                survey.radN = radNeu;
                survey.radSD = radStrD;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return survey;
    }

    public static void main(String[] args) {
        Screen1 myscreen = new Screen1();
        Survey survey = myscreen.survey;
        if (survey != null){
            System.out.println("Successful Registration of: " +  survey.firstName);
        }else {
            System.out.println("Registration Cancelled");
        }
    }


}
