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
 * 登录界面
 * @author 陈亚宁 2017.08.09
 */
public class LoginWindow {
	/**
	 * 登录窗口
	 */
	public static JFrame fLogin;
	/**
	 * 登录标题
	 */
	JLabel title;
	/**
	 * 用户名Label
	 */
	JLabel lUsername;
	/**
	 * 密码Label
	 */
	JLabel lPassword;
	/**
	 * 用户名TextField
	 */
	public static JTextField tfUserName;
	/**
	 * 密码TextField
	 */
	public static JPasswordField pfPassword;
	/**
	 * 登录按钮
	 */
	public static JButton bLogin;
	/**
	 * 注册按钮
	 */
	JButton jbSign;
	
	public LoginWindow() {
		fLogin = new JFrame("登录窗口");
		fLogin.getContentPane().setBackground(Color.white);
		
		title = new JLabel("别来无恙。");
		title.setFont(new Font("宋体", 0, 70));
		title.setBounds(20, 50, 500, 130);
		fLogin.add(title);
		
		lUsername = new JLabel("用户名:");
		lUsername.setFont(new Font("宋体", 0, 18));
		lUsername.setBounds(30, 200, 120, 60);
		fLogin.add(lUsername);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(120, 210, 200, 30);
		tfUserName.setName("user");
		TextFieldBorderSet.textSet(tfUserName);
		fLogin.add(tfUserName);
		
		lPassword = new JLabel("密  码:");
		lPassword.setFont(new Font("宋体", 0, 18));
		lPassword.setBounds(30, 270, 120, 60);
		fLogin.add(lPassword);
		
		pfPassword = new JPasswordField();
		pfPassword.setBounds(120, 280, 200, 30);
		TextFieldBorderSet.textSet(pfPassword);
		fLogin.add(pfPassword);
		
		bLogin = new JButton("登录");
		bLogin.setBounds(350, 270, 70, 40);
		bLogin.setBackground(Color.WHITE);
		bLogin.addActionListener(new loginButtonListenner());
		fLogin.add(bLogin);
		
		jbSign = new JButton("注册");
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
