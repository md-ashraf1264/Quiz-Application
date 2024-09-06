package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton back;
    JButton rules;
    JTextField tfname;
    
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pic/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Monospaced", Font.BOLD| Font.ITALIC, 35));
        heading.setForeground(new Color(30, 144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter you name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(30, 144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        back = new JButton ("Back");
        back.setBounds(905,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        rules = new JButton ("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
       
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()== rules)
      {
          String name = tfname.getText();
       setVisible(false);  
       new Rules(name);
      }
      else if (ae.getSource() == back)
              {
                 setVisible(false);
              }
    }
  public static void main(String args[])
  {
      new Login();
  }
    
    
}
