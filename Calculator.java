import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


class Add implements ActionListener
{
    //Characteristics
    JFrame fobj; 
    JButton addbtn,subbtn,mulbtn,divbtn;
    JTextField t1, t2;
    JLabel Number1, Number2, Resultlabel;

    public Add(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Number1 = new JLabel("Number1");
        Number1.setBounds(50, 50, 100, 30);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        Number2 = new JLabel("Number2");
        Number2.setBounds(50, 100, 100, 30);

        t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);

        addbtn = new JButton("+");
        addbtn.setBounds(50, 150, 50, 30);

        subbtn = new JButton("-");
        subbtn.setBounds(150, 150, 50, 30);

        mulbtn = new JButton("*");
        mulbtn.setBounds(250, 150, 50, 30);

        divbtn = new JButton("/");
        divbtn.setBounds(350, 150, 50, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(190, 200, 250, 30);

        fobj.add(Number1);
        fobj.add(t1);
        fobj.add(Number2);
        fobj.add(t2);
        fobj.add(addbtn);
        fobj.add(subbtn);
        fobj.add(mulbtn);
        fobj.add(divbtn);
        fobj.add(Resultlabel);

        addbtn.addActionListener(this);
        subbtn.addActionListener(this);
        mulbtn.addActionListener(this);
        divbtn.addActionListener(this);
        fobj.setLayout(null);
        fobj.setSize(width, height);
        fobj.setVisible(true);
        fobj.getContentPane().setBackground(Color.CYAN);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  public void actionPerformed(ActionEvent e)
    {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int result = 0;

        if(e.getSource() == addbtn)      
        result = n1 + n2;
    else if(e.getSource() == subbtn) 
        result = n1 - n2;
    else if(e.getSource() == mulbtn) 
        result = n1 * n2;
    else if(e.getSource() == divbtn)
        result = n1 / n2;
       Resultlabel.setText("Result: " + result);
    }
}

class Calculator
{
    public static void main(String A[])
    {
        Add aobj = new Add("Calculator", 500, 300);
    }
}
