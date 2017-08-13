package ui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import function.SignButtonListener;
import function.TextFieldBorderSet;

/**
 * ע�����
 * @author ������ 2017.08.09
 *
 */
public class SignWindow {
	/**
	 * ע�ᴰ��
	 */
	JFrame fSign;
	/**
	 * ע�����
	 */
	JLabel lTitle;
	/**
	 * �û���label
	 */
	JLabel lUserName;
	/**
	 * ����label
	 */
	JLabel lPassword;
	/**
	 * ȷ������label
	 */
	JLabel lcPassword;
	/**
	 * �û���TextField
	 */
	public static JTextField tfUserName;
	/**
	 * ����TextField
	 */
	public static JTextField tfPassword;
	/**
	 * ȷ������TextField
	 */
	public static JTextField tfcPassword;
	/**
	 * ע�ᰴť
	 */
	public static JButton bSign;
	
	public SignWindow() {
		fSign = new JFrame("ע�ᴰ��");
		fSign.getContentPane().setBackground(Color.white);
		
		lTitle = new JLabel("�������");
		lTitle.setFont(new Font("����", 0, 70));
		lTitle.setBounds(20, 50, 500, 130);
		fSign.add(lTitle);
		
		lUserName = new JLabel("�� �� ����");
		lUserName.setFont(new Font("����", 0, 18));
		lUserName.setBounds(20, 200, 130, 60);
		fSign.add(lUserName);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(130, 210, 200, 30);
		TextFieldBorderSet.textSet(tfUserName);
		fSign.add(tfUserName);
		
		lPassword = new JLabel("��    �룺");
		lPassword.setFont(new Font("����", 0, 18));
		lPassword.setBounds(20, 250, 130, 60);
		fSign.add(lPassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(130, 260, 200, 30);
		TextFieldBorderSet.textSet(tfPassword);
		fSign.add(tfPassword);
		
		lcPassword = new JLabel("ȷ�����룺");
		lcPassword.setFont(new Font("����", 0, 18));
		lcPassword.setBounds(20, 300, 125, 60);
		fSign.add(lcPassword);
		
		tfcPassword = new JTextField();
		tfcPassword.setBounds(130, 310, 200, 30);
		TextFieldBorderSet.textSet(tfcPassword);
		fSign.add(tfcPassword);
		
		bSign = new JButton("ע��");
		bSign.setBounds(360, 210, 70, 130);
		bSign.setBackground(Color.white);
		bSign.setFont(new Font("����", 0, 13));
		bSign.addActionListener(new SignButtonListener());
		fSign.add(bSign);
		
		fSign.setBounds(700, 300, 500, 450);
		fSign.setLayout(null);
		fSign.setVisible(true);
		fSign.setResizable(false);
		fSign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new SignWindow();
	}
}
