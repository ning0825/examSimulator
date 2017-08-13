package function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import date.CorrectAnswer;
import date.User;
import ui.SystemGui;

/**
 * 查看分数按钮的监听器
 * @author 陈亚宁 2017.08.09
 */
public class ScoreButtonListenner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		SystemGui.taScore.setText("当前总分：" + User.user.getScore() + "\n" + "第" + (User.user.getI() + 1) + "题答案：" + CorrectAnswer.getAnswer(User.user.getI()));
	}
}
