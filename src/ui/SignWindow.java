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
 * 注册界面
 * @author 陈亚宁 2017.08.09
 *
 */
public class SignWindow {
	/**
	 * 注册窗口
	 */
	JFrame fSign;
	/**
	 * 注册标题
	 */
	JLabel lTitle;
	/**
	 * 用户名label
	 */
	JLabel lUserName;
	/**
	 * 密码label
	 */
	JLabel lPassword;
	/**
	 * 确认密码label
	 */
	JLabel lcPassword;
	/**
	 * 用户名TextField
	 */
	public static JTextField tfUserName;
	/**
	 * 密码TextField
	 */
	public static JTextField tfPassword;
	/**
	 * 确认密码TextField
	 */
	public static JTextField tfcPassword;
	/**
	 * 注册按钮
	 */
	public static JButton bSign;
	
	public SignWindow() {
		fSign = new JFrame("注册窗口");
		fSign.getContentPane().setBackground(Color.white);
		
		lTitle = new JLabel("相见恨晚。");
		lTitle.setFont(new Font("宋体", 0, 70));
		lTitle.setBounds(20, 50, 500, 130);
		fSign.add(lTitle);
		
		lUserName = new JLabel("用 户 名：");
		lUserName.setFont(new Font("宋体", 0, 18));
		lUserName.setBounds(20, 200, 130, 60);
		fSign.add(lUserName);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(130, 210, 200, 30);
		TextFieldBorderSet.textSet(tfUserName);
		fSign.add(tfUserName);
		
		lPassword = new JLabel("密    码：");
		lPassword.setFont(new Font("宋体", 0, 18));
		lPassword.setBounds(20, 250, 130, 60);
		fSign.add(lPassword);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(130, 260, 200, 30);
		TextFieldBorderSet.textSet(tfPassword);
		fSign.add(tfPassword);
		
		lcPassword = new JLabel("确认密码：");
		lcPassword.setFont(new Font("宋体", 0, 18));
		lcPassword.setBounds(20, 300, 125, 60);
		fSign.add(lcPassword);
		
		tfcPassword = new JTextField();
		tfcPassword.setBounds(130, 310, 200, 30);
		TextFieldBorderSet.textSet(tfcPassword);
		fSign.add(tfcPassword);
		
		bSign = new JButton("注册");
		bSign.setBounds(360, 210, 70, 130);
		bSign.setBackground(Color.white);
		bSign.setFont(new Font("黑体", 0, 13));
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
