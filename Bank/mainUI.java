import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class mainUI implements ActionListener
{
    public JFrame frame;
    public JPanel mainPanel,topPanel,bottomPanel;
    public JButton account = new JButton("Create Account");
    public JLabel welcome = new JLabel();
    
    
    public mainUI(JFrame UIframe, JPanel UIpanel)
    {
        //Creating the frame attributes
        frame = UIframe;
        frame.setTitle("BANK LOGIN SYSTEM");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

        
        //Creating the panels for the game 
        mainPanel = UIpanel;
        mainPanel.removeAll();
        mainPanel.revalidate();
        
        //Setting out the layout
        mainPanel.setLayout (new BorderLayout());
        
        //setting the top and bottom panels
        topPanel = new JPanel();
        bottomPanel =new JPanel();
        topPanel.setLayout( new BorderLayout());
        bottomPanel.setLayout( new BorderLayout());
        mainPanel.add( BorderLayout.CENTER ,topPanel);
        mainPanel.add( BorderLayout.SOUTH, bottomPanel);
        
        //Setting up the welcome message
        welcome.setText("WELCOME TO THE NATIONAL BANK OF CANADA");
        welcome.setFont(new Font("Tahoma",Font.BOLD,26));
        topPanel.add(BorderLayout.CENTER, welcome);

        
        //Creting the "Create Account" button
        bottomPanel.add(BorderLayout.EAST, account);
        account.addActionListener(new ActionListener(){
            public void actionPerformed( ActionEvent aevt)
            {
                if (aevt.getSource() == account)
                {
                    new account(frame, mainPanel);
                }
            }
        });
        
        //Adding components to the frame
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent aevt)
    {
    }
}