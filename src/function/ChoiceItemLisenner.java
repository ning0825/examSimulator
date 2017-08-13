package function;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import date.CorrectAnswer;
import date.User;
import ui.SystemGui;

/**
 * 选择文件下拉栏的监听器
 * @author 陈亚宁 2017.08.09
 *
 */
public class ChoiceItemLisenner implements ItemListener{
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//清空试题文本框，选择文件，设置标题
		SystemGui.taPaper.setText("");
		FileSet.fileSet.select(e.getItem().toString());
		SystemGui.lTitle.setText(e.getItem().toString());
		
		//初始化倒计时
		CountDown.countDown.flag = false;
		CountDown.countDown.time = 7200;
		
		//初始化答案和 i 值
		CorrectAnswer.setAnswer(e.getItem().toString());
		User.user.setI(0);
		
		//设置按钮状态
		SystemGui.bStart.setEnabled(true);
		SystemGui.bNext.setEnabled(false);
		SystemGui.bTime.setEnabled(false);
		

	}

}
