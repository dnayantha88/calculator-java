import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisp;
	
	double firstNum;
	double secondNum;
	double answer;
	String op;
	String result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber=txtDisp.getText()+btn0.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 311, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber=txtDisp.getText()+btn_dot.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_dot.setBounds(65, 311, 50, 50);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String result;
				secondNum=Double.parseDouble(txtDisp.getText());
				
				if(op=="+")
				{
					answer=firstNum+secondNum;
					result=String.format("%.2f", answer);
					txtDisp.setText(result);
				}
				
				else if(op=="-")
				{
					answer=firstNum-secondNum;
					result=String.format("%.2f", answer);
					txtDisp.setText(result);
				}
				
				else if(op=="*")
				{
					answer=firstNum*secondNum;
					result=String.format("%.2f", answer);
					txtDisp.setText(result);
				}
				
				else if(op=="/")
				{
					answer=firstNum/secondNum;
					result=String.format("%.2f", answer);
					txtDisp.setText(result);
				}
				
				else if(op=="%")
				{
					answer=firstNum%secondNum;
					//answer=firstNum/100;
					result=String.format("%.2f", answer);
					txtDisp.setText(result+"%");
				}
				
					
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_equal.setBounds(120, 311, 50, 50);
		frame.getContentPane().add(btn_equal);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber=txtDisp.getText()+btn1.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 250, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber=txtDisp.getText()+btn2.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(65, 250, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn3.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(120, 250, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn4.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 189, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn5.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(65, 189, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn6.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(120, 189, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn7.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 128, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn8.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 128, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=txtDisp.getText()+btn9.getText();
				txtDisp.setText(enterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(120, 128, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisp.setText(null);
				
			}
		});
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAc.setBounds(10, 67, 50, 50);
		frame.getContentPane().add(btnAc);
		
		JButton btn_prce = new JButton("%");
		btn_prce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(txtDisp.getText());
				txtDisp.setText("");
				op="%";
				
			}
		});
		btn_prce.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_prce.setBounds(65, 67, 50, 50);
		frame.getContentPane().add(btn_prce);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(txtDisp.getText());
				txtDisp.setText("");
				op="/";
				
			}
		});
		btn_div.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_div.setBounds(120, 67, 50, 50);
		frame.getContentPane().add(btn_div);
		
		JButton btn_bak = new JButton("<-");
		btn_bak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back=null;
				
				if(txtDisp.getText().length()>0)
				{
					StringBuilder strB=new StringBuilder(txtDisp.getText());
					strB.deleteCharAt(txtDisp.getText().length()-1);
					back=strB.toString();
					txtDisp.setText(back);
				}
				
			}
		});
		btn_bak.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_bak.setBounds(175, 67, 50, 50);
		frame.getContentPane().add(btn_bak);
		
		JButton btn_mul = new JButton("X");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(txtDisp.getText());
				txtDisp.setText("");
				op="*";
				
			}
		});
		btn_mul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_mul.setBounds(175, 128, 50, 50);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(txtDisp.getText());
				txtDisp.setText("");
				op="-";
				
			}
		});
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_sub.setBounds(175, 189, 50, 50);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_pls = new JButton("+");
		btn_pls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum=Double.parseDouble(txtDisp.getText());
				txtDisp.setText("");
				op="+";
				
			}
		});
		btn_pls.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_pls.setBounds(175, 250, 50, 110);
		frame.getContentPane().add(btn_pls);
		
		txtDisp = new JTextField();
		txtDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisp.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDisp.setBounds(10, 11, 215, 45);
		frame.getContentPane().add(txtDisp);
		txtDisp.setColumns(10);
		
		
	}
}
