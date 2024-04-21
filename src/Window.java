import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    private JLabel  lblDifficulty = new JLabel("Difficulty:");
    private JLabel  lblTypeOfEquation= new JLabel("Choose type of Equation that you want:");
    private JLabel  lblEnterEquation = new JLabel("Enter the amount of questions you want;");

    private JRadioButton rbtnEasy= new JRadioButton("Easy");
    private JRadioButton rbtnMedium= new JRadioButton("Medium");
    private JRadioButton rbtnHard= new JRadioButton("Hard");
    private JCheckBox rbtnAddtion= new JCheckBox("Addition");
    private JCheckBox rbtnSubtraction= new JCheckBox("Substraction");
    private JCheckBox rbtnMultiplication= new JCheckBox("Multipliction");
    private JCheckBox rbtnDivision= new JCheckBox("Division");
    private JButton btnStart = new JButton("Start");
    private JTextField txtNumberOFQuestion = new JTextField(20);

    public Window(){
        setTitle("Math Quiz");
        setLayout(new FlowLayout());

        add(lblDifficulty);
        add(rbtnEasy);
        add(rbtnMedium);
        add(rbtnHard);
        add(lblTypeOfEquation);
        add(rbtnAddtion);
        add(rbtnSubtraction);
        add(rbtnMultiplication);
        add(rbtnDivision);
        add(lblEnterEquation);
        add(txtNumberOFQuestion);
        add(btnStart);

        btnStart.addActionListener(this);

        setSize(275,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnStart)){
            try{

            }catch(Exception a){

            }
        }
    }
}
