package function;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import date.CorrectAnswer;
import date.User;
import ui.SystemGui;

/**
 * ѡ���ļ��������ļ�����
 * @author ������ 2017.08.09
 *
 */
public class ChoiceItemLisenner implements ItemListener{
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//��������ı���ѡ���ļ������ñ���
		SystemGui.taPaper.setText("");
		FileSet.fileSet.select(e.getItem().toString());
		SystemGui.lTitle.setText(e.getItem().toString());
		
		//��ʼ������ʱ
		CountDown.countDown.flag = false;
		CountDown.countDown.time = 7200;
		
		//��ʼ���𰸺� i ֵ
		CorrectAnswer.setAnswer(e.getItem().toString());
		User.user.setI(0);
		
		//���ð�ť״̬
		SystemGui.bStart.setEnabled(true);
		SystemGui.bNext.setEnabled(false);
		SystemGui.bTime.setEnabled(false);
		

	}

}
