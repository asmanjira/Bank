import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class account extends JPanel implements ActionListener
{
    public JFrame f;
    public JPanel panel, topPanel, promptPanel, inputPanel, bottomPanel;
    public JLabel name, dob, nationality, telephone, email, e_name, e_telephone, userName, password,personal ;
    public JTextField t_name, t_dob, t_nationality, t_telephone, t_email, t_e_name, t_userName, t_password;// t is to indicate that it belongs to textfield
    public JTextField t_e_telephone;
    public JButton submit;
    public String res_name, res_dob, res_nationality, res_telephone, res_email, res_emergencyName, res_emergencyTele, res_userName, res_password;// res is to indicate that it belongs to the response
    public account (JFrame frame, JPanel mainPanel)
    {
        f= frame;
        panel=mainPanel;
        
        panel.removeAll();
        panel.repaint();
        panel.revalidate();
        
        promptPanel = new JPanel(new GridLayout(9,1,10,10));
        inputPanel = new JPanel(new GridLayout(9,1,10,10));
        topPanel = new JPanel();
        bottomPanel = new JPanel(new BorderLayout());
        
        panel.setLayout(new BorderLayout());

        setup();
    }
    
    public void setup()
    {
        // Creating the top Panel
        personal = new JLabel("PERSONAL INFORMATION FORM ");
        personal.setFont(new Font("Arial", Font.BOLD, 35));
        topPanel.add(personal);
        
        // Creating the prompt panel
        name = new JLabel("NAME :");
        name.setFont(new Font("ARIAL", Font.BOLD, 15));
        name.setLocation(1,1);
        promptPanel.add(name);
        
        dob = new JLabel("DATE OF BIRTH :");
        dob.setFont(new Font("ARIAL", Font.BOLD, 15));
        dob.setLocation(2,1);
        promptPanel.add(dob);
        
        nationality = new JLabel("NATIONALITY :");
        nationality.setFont(new Font("ARIAL", Font.BOLD, 15));
        nationality.setLocation(3,1);
        promptPanel.add(nationality);
        
        telephone = new JLabel("TELEPHONE NUMBER :");
        telephone.setFont(new Font("ARIAL", Font.BOLD, 15));
        telephone.setLocation(4,1);
        promptPanel.add(telephone);
        
        email = new JLabel("EMAIL :");
        email.setFont(new Font("ARIAL", Font.BOLD, 15));
        email.setLocation(5,1);
        promptPanel.add(email);
        
        e_name = new JLabel("EMERGENCY CONTACT NAME :");
        e_name.setFont(new Font("ARIAL", Font.BOLD, 15));
        e_name.setLocation(6,1);
        promptPanel.add(e_name);
        
        e_telephone = new JLabel("EMERGENCY TELEPHONE NUMBER :");
        e_telephone.setFont(new Font("ARIAL", Font.BOLD, 15));
        e_telephone.setLocation(7,1);
        promptPanel.add(e_telephone);
        
        userName = new JLabel("USER NAME :");
        userName.setFont(new Font("Arial", Font.BOLD, 15));
        userName.setLocation(8,1);
        promptPanel.add(userName);
                
        password = new JLabel("CHOOSE PASSWORD :");
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setLocation(9,1);
        promptPanel.add(password);
        
        
        // Creating the input panel
        t_name = new JTextField("",15);
        t_name.setLocation(1,1);
        inputPanel.add(t_name);
        res_name = t_name.getText();
        System.out.println(res_name);
        
        t_dob = new JTextField("",15);
        t_dob.setLocation(2,1);
        inputPanel.add(t_dob);
                
        t_nationality = new JTextField("",25);
        t_nationality.setLocation(3,1);
        inputPanel.add(t_nationality);
                
        t_telephone = new JTextField("",25);
        t_telephone.setLocation(4,1);
        inputPanel.add(t_telephone);
                
        t_email = new JTextField("",25);
        t_email.setLocation(5,1);
        inputPanel.add(t_email);
                
        t_e_name = new JTextField("",25);
        t_e_name.setLocation(6,1);
        inputPanel.add(t_e_name);
                
        t_e_telephone = new JTextField("",25);
        t_e_telephone.setLocation(7,1);
        inputPanel.add(t_e_telephone);
        
        t_userName = new JTextField("", 25);
        t_userName.setLocation(8,1);
        inputPanel.add(t_userName);
        
        t_password =  new JTextField("",25);
        t_password.setLocation(9,1);
        inputPanel.add(t_password);
        
        
        //Creating the bottomPanel
        submit = new JButton("Submit");
        bottomPanel.add(BorderLayout.EAST, submit);
        
        
        
        
        //Adding the panels to the main panel
        panel.add(BorderLayout.NORTH, topPanel);
        panel.add(BorderLayout.WEST, promptPanel);
        panel.add(BorderLayout.EAST, inputPanel);
        panel.add(BorderLayout.SOUTH, bottomPanel);
    }
    public void actionPerformed(ActionEvent aevt)
    {
    }
}