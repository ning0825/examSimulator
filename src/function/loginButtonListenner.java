package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import date.User;
import ui.LoginWindow;
import ui.SystemGui;

/**
 * ע������ע�ᰴť�ļ�����
 * @author ������ 2017.08.09
 *
 */
public class loginButtonListenner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(User.user.getUserName().equals(LoginWindow.tfUserName.getText()) && User.user.getPassWord().equals(LoginWindow.pfPassword.getText())) {
			JOptionPane.showMessageDialog(LoginWindow.bLogin, "��¼�ɹ�����ʼ����");
			new SystemGui();
			LoginWindow.fLogin.dispose();
		}else {
			JOptionPane.showMessageDialog(LoginWindow.bLogin, "�˺Ż��������");
			}
		}
	}
	

