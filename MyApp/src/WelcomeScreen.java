import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame{
    private JPanel jpanelMain;
    private JButton btnfillOurSurveyButton;
    private JButton btnViewSurvey;

    public WelcomeScreen(){
        setContentPane(jpanelMain);
        setTitle("Online Survey");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800,400);
        setLocationRelativeTo(null);
        //setResizable(false);//
        btnfillOurSurveyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Screen1().setVisible(true);
                dispose();
            }

        }); setVisible(true);
        btnViewSurvey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Screen2().setVisible(true);
                dispose();

            }
        });
    }
    public static void main(String[] args){
        new WelcomeScreen();}
}
