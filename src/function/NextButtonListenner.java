package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import date.User;
import ui.SystemGui;

/**
 * ��һ�ⰴť�ļ�����
 * @author ������ 2017.08.09
 *
 */
public class NextButtonListenner implements ActionListener{
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		SystemGui.taPaper.setText("");
		FileSet.fileSet.flag2 = true;
		new Thread(FileSet.fileSet).start();
		
		SystemGui.bNext.setEnabled(false);
		SystemGui.bSub.setEnabled(true);
		
		User.user.setI(1);
		
	}
}
