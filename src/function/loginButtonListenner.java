package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import date.User;
import ui.LoginWindow;
import ui.SystemGui;

/**
 * 注册界面的注册按钮的监听器
 * @author 陈亚宁 2017.08.09
 *
 */
public class loginButtonListenner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(User.user.getUserName().equals(LoginWindow.tfUserName.getText()) && User.user.getPassWord().equals(LoginWindow.pfPassword.getText())) {
			JOptionPane.showMessageDialog(LoginWindow.bLogin, "登录成功，开始考试");
			new SystemGui();
			LoginWindow.fLogin.dispose();
		}else {
			JOptionPane.showMessageDialog(LoginWindow.bLogin, "账号或密码错误");
			}
		}
	}
	

