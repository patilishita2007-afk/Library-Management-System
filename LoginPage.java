import javax.swing.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1;
JPasswordField t2;
JButton b1;

LoginPage()
{
l1=new JLabel("Username");
l1.setBounds(50,50,100,30);

l2=new JLabel("Password");
l2.setBounds(50,100,100,30);

t1=new JTextField();
t1.setBounds(150,50,150,30);

t2=new JPasswordField();
t2.setBounds(150,100,150,30);

b1=new JButton("Login");
b1.setBounds(120,160,100,30);

b1.addActionListener(this);

add(l1);
add(l2);
add(t1);
add(t2);
add(b1);

setSize(400,300);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String user=t1.getText();
String pass=t2.getText();

if(user.equals("admin") && pass.equals("1234"))
{
JOptionPane.showMessageDialog(this,"Login Successful");
new LibraryMenu();
}
else
{
JOptionPane.showMessageDialog(this,"Invalid Login");
}
}

public static void main(String args[])
{
new LoginPage();
}
}
