import java.awt.EventQueue;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double fesult;
	String operation;
	String answer;
	protected double result;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setBounds(100, 100, 347, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(68, 11, 188, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 34, 312, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
				
			}
		});
		btnR.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnR.setBounds(10, 110, 61, 43);
		frame.getContentPane().add(btnR);
		
		JButton btn1x = new JButton("1/x");
		btn1x.setEnabled(false);
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1x.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn1x.setBounds(10, 164, 61, 43);
		frame.getContentPane().add(btn1x);
		
		JButton btnxy = new JButton("x^y");
		btnxy.setEnabled(false);
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
				
				
				
			}
		});
		btnxy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnxy.setBounds(10, 218, 61, 43);
		frame.getContentPane().add(btnxy);
		
		JButton btnCube = new JButton("x^3");
		btnCube.setEnabled(false);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
				
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCube.setBounds(10, 272, 61, 43);
		frame.getContentPane().add(btnCube);
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.setEnabled(false);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSquare.setBounds(10, 326, 61, 43);
		frame.getContentPane().add(btnSquare);
		
		JButton btnFact = new JButton("n!");
		btnFact.setEnabled(false);
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFact.setBounds(10, 380, 61, 43);
		frame.getContentPane().add(btnFact);
		
		JButton btnex = new JButton("e^x");
		btnex.setEnabled(false);
		btnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnex.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnex.setBounds(75, 110, 54, 43);
		frame.getContentPane().add(btnex);
		
		JButton btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnlog.setBounds(75, 164, 54, 43);
		frame.getContentPane().add(btnlog);
		
		JButton btnPerc = new JButton("%");
		btnPerc.setEnabled(false);
		btnPerc.addActionListener(new ActionListener() {
			private String operation;

			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPerc.setBounds(75, 218, 54, 43);
		frame.getContentPane().add(btnPerc);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(75, 272, 54, 43);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(75, 326, 54, 43);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(75, 380, 54, 43);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSin.setBounds(132, 110, 59, 43);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSinh.setBounds(132, 165, 59, 43);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		btnClear.setBounds(132, 218, 59, 43);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(132, 272, 59, 43);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(133, 326, 58, 43);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(132, 380, 59, 43);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.setBounds(195, 110, 61, 44);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCosh.setBounds(196, 166, 60, 43);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackslash = new JButton("\uF0E7");
		btnBackslash.setEnabled(false);
		btnBackslash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
				
				
			}
		});
		btnBackslash.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnBackslash.setBounds(195, 218, 61, 43);
		frame.getContentPane().add(btnBackslash);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(195, 272, 61, 43);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(196, 326, 60, 43);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(195, 380, 61, 43);
		frame.getContentPane().add(btn3);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.setBounds(259, 110, 63, 44);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(260, 165, 62, 43);
		frame.getContentPane().add(btnTanh);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.setBounds(259, 218, 63, 43);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSub.setBounds(259, 272, 63, 43);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(259, 326, 63, 43);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(259, 380, 61, 43);
		frame.getContentPane().add(btnDiv);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlusMinus.setBounds(10, 433, 61, 43);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(75, 434, 116, 43);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDot.setBounds(195, 433, 61, 43);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				second=Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
				   result =first+second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				   
				}
				
				else if(operation=="-") 
				{
				   result =first-second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				   
				}
				
				else if(operation=="*") 
				{
				   result =first*second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				   
				}
				
				else if(operation=="/") 
				{
				   result =first/second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				   
				}
				
				else if(operation=="%") 
				{
				   result =first%second;
				   answer=String.format("%.2f", result);
				   textField.setText(answer);
				   
				}
				
				else if(operation=="x^y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
					resultt =first*resultt;
					}
					answer=String.format("%.2f", resultt);
				    textField.setText(answer);
					
				}
			}
				
		});
		
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEqual.setBounds(259, 433, 63, 43);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				
				btnMul.setEnabled(true);
				btnDiv.setEnabled(true);
				btnPerc.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				
				btnFact.setEnabled(true);
				btnSquare.setEnabled(true);
				btnCube.setEnabled(true);
				btnxy.setEnabled(true);
				btn1x.setEnabled(true);
				btnlog.setEnabled(true);
				btnR.setEnabled(true);
				btnex.setEnabled(true);
				
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackslash.setEnabled(true);
				btn0.setEnabled(true);
				btnEqual.setEnabled(true);
				
				
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(20, 81, 69, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			textField.setText(null);	
				
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);
			
			btnDot.setEnabled(false);
			btnAdd.setEnabled(false);
			btnSub.setEnabled(false);
			
			btnMul.setEnabled(false);
			btnDiv.setEnabled(false);
			btnPerc.setEnabled(false);
			btnPlusMinus.setEnabled(false);
			
			btnFact.setEnabled(false);
			btnSquare.setEnabled(false);
			btnCube.setEnabled(false);
			btnxy.setEnabled(false);
			btn1x.setEnabled(false);
			btnlog.setEnabled(false);
			btnR.setEnabled(false);
			btnex.setEnabled(false);
			
			btnSin.setEnabled(false);
			btnCos.setEnabled(false);
			btnTan.setEnabled(false);
			btnSinh.setEnabled(false);
			btnCosh.setEnabled(false);
			btnTanh.setEnabled(false);
			btnClear.setEnabled(false);
			btnBackslash.setEnabled(false);
			btn0.setEnabled(false);
			btnEqual.setEnabled(false);
			
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOff.setBounds(91, 80, 69, 23);
		frame.getContentPane().add(rdbtnOff);
	}
}
