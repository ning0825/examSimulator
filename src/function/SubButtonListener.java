package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.soap.SOAPBinding.Use;

import date.User;
import ui.SystemGui;

/**
 * �ύ��ť�ļ�����
 * @author ������ 2017.08.09
 *
 */
public class SubButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//��ȡcheckBoxѡ�񣬵���setScore�ı����
		if(SystemGui.cbx.getSelectedCheckbox() != null) {
			User.user.setScore(SystemGui.cbx.getSelectedCheckbox().getLabel().toCharArray()[0]);

		}
		
		//���ð�ť״̬
		SystemGui.bNext.setEnabled(true);
		SystemGui.bSub.setEnabled(false);
	}

}
