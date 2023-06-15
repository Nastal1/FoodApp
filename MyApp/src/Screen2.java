import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.sql.*;

public class Screen2 extends JFrame{
    private JTextField txtS;
    private JTextField txtAa;
    private JTextField txtOp;
    private JTextField txtYp;
    private JTextField txtPpz;
    private JTextField txtPpa;
    private JTextField txtPnw;
    private JTextField txtPr;
    private JTextField txtPm;
    private JTextField txtWm;
    private JTextField txtWt;
    private JTextField txtLr;
    private JButton btnOk;
    private JPanel jpanelMain;

    public Screen2() {
        setTitle("Online Survey");
        setContentPane(jpanelMain);
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WelcomeScreen().setVisible(true);
                dispose();
            }
        });
        txtS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select count(ID) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("count(ID)");
                        txtS.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtAa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select avg(Age) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("avg(Age)");
                        txtAa.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtOp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select MAX(Age) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("MAX(Age)");
                        txtOp.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtYp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select MIN(Age) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("MIN(Age)");
                        txtYp.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtPpz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select count(Pizza) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("count(Pizza)");
                        txtPpz.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtPpa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select count(Pasta) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("count(Pasta)");
                        txtPpa.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtPnw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select count(PapAndWors) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("count(PapAndWors)");
                        txtPnw.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtPr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select count(radAgr, radStr) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("count(radAgr, radStr)");
                        txtPr.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtPm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select avg(eatStr, eatAgr) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("avg(eatStr, eatAgr)");
                        txtPm.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtWm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select avg(movStr, movAgr) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("avg(movStr, movAgr)");
                        txtWm.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtWt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select avg(tvStr, tvAgr) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("avg(tvStr, tvAgr)");
                        txtWt.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        txtLr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try{
                    String sql = "Select avg(radStr, radAgr) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL,"root",null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()){
                        String sum = rs.getString("avg(radStr, radAgr)");
                        txtLr.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WelcomeScreen().setVisible(true);
            }
        });
        txtS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String DB_URL = "jdbc:mysql://localhost:3306/survey";
                final String USERNAME = "root";
                final String PASSWORD = null;

                try {
                    String sql = "Select count(ID) from survey";
                    Connection conn = DriverManager.getConnection(DB_URL, "root", null);
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        String sum = rs.getString("count(ID)");
                        txtS.setText(sum);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);

                }
            }
        });
    }

    public static void main(String[] args) {
        Screen2 screen = new Screen2();
    }
}
