package FirstFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class bai1 extends JFrame {

	private JPanel contentPane;
	boolean kt = true;
	boolean dau = false;
	double val=0;
	String pheptinh="";
	private JTextField txtKq;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				HelloWorldFrame frame = new HelloWorldFrame();
				frame.setVisible(true);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	}
	
	public double tinh(String pheptoan,double a,double b) {
		switch(pheptoan) {
		case "+" : a+=b; break;
		case "-" : a-=b; break;
		case "x" : a*=b; break;
		case "/" : a/=b; break;
		}
		return a;
	}

	
	public String testNumber(double num) {
		if(num % 1==0) return String.valueOf((int)Math.round(num));
		else {
			DecimalFormat format = new DecimalFormat("0.#");
			return format.format(num);
		}
	}
	/**
	 * Create the frame.
	 */
	public HelloWorldFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Calculator");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(40, 74, 65, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_1.setBounds(115, 74, 65, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_2.setBounds(183, 74, 65, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_3.setBounds(40, 135, 65, 51);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4.setBounds(115, 135, 65, 51);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_5.setBounds(183, 135, 65, 51);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_6.setBounds(40, 196, 65, 51);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_7.setBounds(115, 257, 65, 51);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_4_1 = new JButton("2");
		btnNewButton_4_1.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_1.setBounds(115, 196, 65, 51);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("3");
		btnNewButton_4_2.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_2.setBounds(183, 196, 65, 51);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("C");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val = 0;
				kt=true;
				dau=false;
				pheptinh="";
				txtKq.setText("0");
			}
		});
		btnNewButton_4_3.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3.setBounds(40, 257, 65, 51);
		contentPane.add(btnNewButton_4_3);
		
		txtKq = new JTextField();
		txtKq.setFont(new Font("Arial", Font.BOLD, 44));
		txtKq.setText("0");
		txtKq.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKq.setBounds(40, 10, 288, 54);
		contentPane.add(txtKq);
		txtKq.setColumns(10);
		
		JButton btnNewButton_4_3_1 = new JButton("/");
		btnNewButton_4_3_1.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3_1.setBounds(252, 74, 65, 51);
		contentPane.add(btnNewButton_4_3_1);
		
		JButton btnNewButton_4_3_2 = new JButton("x");
		btnNewButton_4_3_2.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3_2.setBounds(252, 135, 65, 51);
		contentPane.add(btnNewButton_4_3_2);
		
		JButton btnNewButton_4_3_3 = new JButton("-");
		btnNewButton_4_3_3.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3_3.setBounds(252, 196, 65, 51);
		contentPane.add(btnNewButton_4_3_3);
		
		JButton btnNewButton_4_3_4 = new JButton("+");
		btnNewButton_4_3_4.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3_4.setBounds(252, 257, 65, 51);
		contentPane.add(btnNewButton_4_3_4);
		
		JButton btnNewButton_4_3_4_1 = new JButton("=");
		btnNewButton_4_3_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pheptinh != "") {
					val = tinh(pheptinh,val,Double.parseDouble(txtKq.getText()));
					txtKq.setText(testNumber(val));
				}
				val = 0;
				pheptinh = "";
				kt=true;
			}
		});
		btnNewButton_4_3_4_1.setFont(new Font("Arial", Font.BOLD, 43));
		btnNewButton_4_3_4_1.setBounds(183, 257, 65, 51);
		contentPane.add(btnNewButton_4_3_4_1);
		
		ActionListener bb = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(txtKq.getText().charAt(0) == '0' || !kt) {
					txtKq.setText(b.getText());
					kt = true;
				}else txtKq.setText(txtKq.getText() + b.getText());
			}
		};
		btnNewButton.addActionListener(bb);
		btnNewButton_1.addActionListener(bb);
		btnNewButton_2.addActionListener(bb);
		btnNewButton_3.addActionListener(bb);
		btnNewButton_4.addActionListener(bb);
		btnNewButton_5.addActionListener(bb);
		btnNewButton_6.addActionListener(bb);
		btnNewButton_7.addActionListener(bb);
		btnNewButton_4_1.addActionListener(bb);
		btnNewButton_4_2.addActionListener(bb);
		btnNewButton_4_3.addActionListener(bb);
		
		JButton btnDau = new JButton(".");
		btnDau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dau == false) {
					dau = true;
					txtKq.setText(txtKq.getText() + ".");
				}
			}
		});
		
		ActionListener cc = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(kt==true)
					if(pheptinh != "") {
						val = tinh(pheptinh,val,Double.parseDouble(txtKq.getText()));
						txtKq.setText(testNumber(val));
					}else val = Double.parseDouble(txtKq.getText());
				pheptinh = b.getText();
				kt = false;
				dau=false;
				}
		};
		btnNewButton_4_3_1.addActionListener(cc);
		btnNewButton_4_3_2.addActionListener(cc);
		btnNewButton_4_3_3.addActionListener(cc);
		btnNewButton_4_3_4.addActionListener(cc);
		setVisible(true);
	}
}
