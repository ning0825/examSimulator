package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import date.User;
import ui.LoginWindow;
import ui.SignWindow;

/**
 * ע��ҳ���ע�ᰴť�ļ�����
 * @author ������ 2017.08.09
 *
 */
public class SignButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(SignWindow.tfPassword.getText().equals(SignWindow.tfcPassword.getText())) {
			User.user.setUserName(SignWindow.tfUserName.getText());
			User.user.setPassWord(SignWindow.tfPassword.getText());
			int a = JOptionPane.showConfirmDialog(SignWindow.bSign, "ע��ɹ���ǰ����¼");
			if(a == JOptionPane.YES_OPTION)
				new LoginWindow();
			
		}
	}

}
