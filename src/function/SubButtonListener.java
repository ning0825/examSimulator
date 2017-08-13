package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jws.soap.SOAPBinding.Use;

import date.User;
import ui.SystemGui;

/**
 * 提交按钮的监听器
 * @author 陈亚宁 2017.08.09
 *
 */
public class SubButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//获取checkBox选择，调用setScore改变分数
		if(SystemGui.cbx.getSelectedCheckbox() != null) {
			User.user.setScore(SystemGui.cbx.getSelectedCheckbox().getLabel().toCharArray()[0]);

		}
		
		//设置按钮状态
		SystemGui.bNext.setEnabled(true);
		SystemGui.bSub.setEnabled(false);
	}

}
