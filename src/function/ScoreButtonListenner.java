package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import date.CorrectAnswer;
import date.User;
import ui.SystemGui;

/**
 * �鿴������ť�ļ�����
 * @author ������ 2017.08.09
 */
public class ScoreButtonListenner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		SystemGui.taScore.setText("��ǰ�ܷ֣�" + User.user.getScore() + "\n" + "��" + (User.user.getI() + 1) + "��𰸣�" + CorrectAnswer.getAnswer(User.user.getI()));
	}
}
