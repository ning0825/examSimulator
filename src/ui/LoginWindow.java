package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyledEditorKit.BoldAction;

import function.JbSignButtonlistenner;
import function.TextFieldBorderSet;
import function.loginButtonListenner;

/**
 * ��¼����
 * @author ������ 2017.08.09
 */
public class LoginWindow {
	/**
	 * ��¼����
	 */
	public static JFrame fLogin;
	/**
	 * ��¼����
	 */
	JLabel title;
	/**
	 * �û���Label
	 */
	JLabel lUsername;
	/**
	 * ����Label
	 */
	JLabel lPassword;
	/**
	 * �û���TextField
	 */
	public static JTextField tfUserName;
	/**
	 * ����TextField
	 */
	public static JPasswordField pfPassword;
	/**
	 * ��¼��ť
	 */
	public static JButton bLogin;
	/**
	 * ע�ᰴť
	 */
	JButton jbSign;
	
	public LoginWindow() {
		fLogin = new JFrame("��¼����");
		fLogin.getContentPane().setBackground(Color.white);
		
		title = new JLabel("��������");
		title.setFont(new Font("����", 0, 70));
		title.setBounds(20, 50, 500, 130);
		fLogin.add(title);
		
		lUsername = new JLabel("�û���:");
		lUsername.setFont(new Font("����", 0, 18));
		lUsername.setBounds(30, 200, 120, 60);
		fLogin.add(lUsername);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(120, 210, 200, 30);
		tfUserName.setName("user");
		TextFieldBorderSet.textSet(tfUserName);
		fLogin.add(tfUserName);
		
		lPassword = new JLabel("��  ��:");
		lPassword.setFont(new Font("����", 0, 18));
		lPassword.setBounds(30, 270, 120, 60);
		fLogin.add(lPassword);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(120, 280, 200, 30);
		TextFieldBorderSet.textSet(pfPassword);
		fLogin.add(pfPassword);
		
		bLogin = new JButton("��¼");
		bLogin.setBounds(350, 270, 70, 40);
		bLogin.setBackground(Color.WHITE);
		bLogin.addActionListener(new loginButtonListenner());
		fLogin.add(bLogin);
		
		jbSign = new JButton("ע��");
		jbSign.setBounds(350, 210, 70, 40);
		jbSign.setBackground(Color.WHITE);
		jbSign.addActionListener(new JbSignButtonlistenner());
		fLogin.add(jbSign);
		
		
		fLogin.setBounds(700 , 300, 500, 450);
		fLogin.setLayout(null);
		fLogin.setVisible(true);
		fLogin.setResizable(false);
		fLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new LoginWindow();
	}
}
