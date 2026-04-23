import javax.swing.*;
import java.awt.event.*;

public class LibraryMenu extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4;

LibraryMenu()
{
b1=new JButton("Display Books");
b2=new JButton("Issue Book");
b3=new JButton("Return Book");
b4=new JButton("Exit");

b1.setBounds(100,50,180,30);
b2.setBounds(100,100,180,30);
b3.setBounds(100,150,180,30);
b4.setBounds(100,200,180,30);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

add(b1);
add(b2);
add(b3);
add(b4);

setSize(400,350);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
JOptionPane.showMessageDialog(this,
"101 Java Programming\n102 Python Basics");
}

if(e.getSource()==b2)
{
JOptionPane.showMessageDialog(this,
"Book Issued Successfully");
}

if(e.getSource()==b3)
{
JOptionPane.showMessageDialog(this,
"Book Returned Successfully");
}

if(e.getSource()==b4)
{
System.exit(0);
}
}
}
